package mk.sav.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

@Configuration
@ComponentScan("mk.sav")
@Profile("jdbc")
public class TestInfrastructureDevConfig {

	
	 	@Value("classpath:schema.sql")
		private Resource schemaScript;
	    @Value("classpath:test-data.sql")
		private Resource dataScript;

	    
		@Bean
		public JdbcTemplate jdbcTemplate(){
			
			return new JdbcTemplate(dataSource());
			
		}
		
		@Bean
		public DataSource dataSource(){
			
			BasicDataSource ds = new BasicDataSource();
			ds.setDriverClassName("org.postgresql.Driver");
			ds.setUrl("jdbc:postgresql://localhost/postgres");
			ds.setUsername("postgres");
			ds.setPassword("Gh05t82++");
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
