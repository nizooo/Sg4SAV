package mk.sav.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@ComponentScan("mk.sav")
//@ImportResource("classpath:/mk/sav/config/security-config.xml")
@Import({AppConfigStub.class,AppConfigJdbc.class,AppConfigJPA.class})
public class AppConfig {

	
}
