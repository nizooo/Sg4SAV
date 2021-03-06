package mk.sav.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@Profile("jdbc")
public class AppConfigJdbc {

	
	@Autowired
	DataSource dataSource;

	@Bean
	public JdbcTemplate jdbcTemplate(){
		
		return new JdbcTemplate(dataSource);
		
	}

//	@Bean
//	public CustomerManager customerManager(){
//		return new JdbcCustomerManager(jdbcTemplate());
//		
//		
//	}
	
}
