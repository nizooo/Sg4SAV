package mk.sav.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import({AppConfig.class , DbConfig.class})
/*@ImportResource("classpath:DbConfig.xml")*/
public class RootConfig {

}
