package mk.sav.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

@Configuration
@Profile("test")
public class DbConfigTest {

	@Value("classpath:schema.sql")
	private Resource schemaScript;
	 @Value("classpath:test-data.sql")
	private Resource dataScript;

	/**
	 * Creates an in-memory  "rewards" database populated with
	 * test data for fast testing
	 */
	
//	@Bean
//	public DataSource dataSource(){
//		
//		return (new EmbeddedDatabaseBuilder())
//				.setName("db_sav_NIZAR")
//				.addScript("classpath:mk/sav/testdb/schema.sql")
//				.addScript("classpath:mk/sav/testdb/test-data.sql")
//				.build();
//	}
	
	 
	 // dataSource postgresql 
//	@Bean
//	public DataSource dataSource(){
//		
//		BasicDataSource ds = new BasicDataSource();
//		ds.setDriverClassName("org.postgresql.Driver");
//		ds.setUrl("jdbc:postgresql://localhost/postgres_test");
//		ds.setUsername("postgres");
//		ds.setPassword("postgresql");
//		return ds;
//		
//	}
	
	@Bean
	public DataSource dataSource(){
		
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("org.hsqldb.jdbcDriver");
		ds.setUrl("jdbc:hsqldb:mem:.");
		ds.setUsername("sa");
		ds.setPassword("");
		return ds;
		
	}
	

	
	@Bean
	public DataSourceInitializer dataSourceInitializer(final DataSource dataSource){
		
		final DataSourceInitializer initializer = new DataSourceInitializer();
		initializer.setDataSource(dataSource);
		initializer.setDatabasePopulator(databasePopulator());
		
		return initializer;
		
	}

	private DatabasePopulator databasePopulator() {
		
		final ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
		populator.addScript(schemaScript);
		populator.addScript(dataScript);
		
		return populator;
	}
	
}
