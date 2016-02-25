package mk.sav.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Configuration
@Import({AppConfig.class,DbConfigTest.class/*,MvcConfig.class*/})
//@ImportResource("classpath:/mk/sav/config/security-config.xml")
@Profile("jdbc")
public class TestInfrastructureDevConfig {

	
}
