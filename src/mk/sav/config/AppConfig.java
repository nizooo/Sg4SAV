package mk.sav.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import mk.sav.entity.CustomerRepository;
import mk.sav.entity.JdbcCustomerRepository;

@Configuration
@ComponentScan("mk.sav")
@Import({AppConfigStub.class,AppConfigJdbc.class})
public class AppConfig {

	@Autowired
	DataSource dataSource;

	@Bean
	public CustomerRepository customerRepository(){
		
		return new JdbcCustomerRepository(dataSource);
	}
	
	@Bean
	public ViewResolver simpleViewResolver(){
		
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/jsp/");
		vr.setSuffix(".jsp");
		return vr;
	}
}
