package mk.sav.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import mk.sav.entity.CustomerRepository;
import mk.sav.entity.JdbcCustomerRepository;

@Configuration
@Import({AppConfigStub.class,AppConfigJdbc.class})
public class AppConfig {

	@Autowired
	DataSource dataSource;

	@Bean
	public CustomerRepository customerRepository(){
		
		return new JdbcCustomerRepository(dataSource);
	}
}
