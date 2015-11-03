package mk.sav.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan("mk.sav")
@Import({AppConfig.class,DbConfigTest.class})
@Profile("jdbc")
public class TestInfrastructureDevConfig {

	
}
