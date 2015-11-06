package mk.sav.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
//@ComponentScan("mk.sav.web")
@Import({AppConfigStub.class,AppConfigJdbc.class,AppConfigJPA.class})
public class AppConfig {

	
}
