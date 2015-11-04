package mk.sav.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableTransactionManagement
@Configuration
@ComponentScan("mk.sav.web")
@Import({AppConfigStub.class,AppConfigJdbc.class,AppConfigJPA.class})
public class AppConfig {

	@Bean
	public ViewResolver simpleViewResolver(){
		
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/jsp/");
		vr.setSuffix(".jsp");
		return vr;
	}
}
