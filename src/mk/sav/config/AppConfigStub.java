package mk.sav.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import mk.sav.internal.CustomerManager;
import mk.sav.internal.StubCustomerManager;

@Configuration
@Profile({"stub"})
public class AppConfigStub {
	
	
	@Bean
	public CustomerManager customerManager(){
		
		return new StubCustomerManager();
	}

}
