package mk.sav.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppConfig.class, DbConfig.class})
public class RootConfig {

}
