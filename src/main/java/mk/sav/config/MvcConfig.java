package mk.sav.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("mk.sav.web")
@Profile("prod")
public class MvcConfig extends WebMvcConfigurerAdapter {

	/**
	 * Establish a ViewResolver that adds a prefix / suffix to 
	 * the logical view name and selects the JstlView for rendering.
	 */

	@Bean
	public ViewResolver simpleViewResolver(){
		
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/views/");
		vr.setSuffix(".jsp");
		return vr;
	}
}
