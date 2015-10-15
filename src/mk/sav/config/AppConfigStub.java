package mk.sav.config;

import org.springframework.context.annotation.Bean;

import mk.sav.internal.CustomerManager;
import mk.sav.internal.StubCustomerManager;

public class AppConfigStub {
	
	
	@Bean
	public CustomerManager customerManager(){
		
		return new StubCustomerManager();
	}

}
