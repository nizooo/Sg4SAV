package mk.sav.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@Import({AppConfig.class , DbConfig.class})
@ImportResource("classpath:/mk/sav/config/security-config.xml")
@EnableTransactionManagement
public class RootConfig {

}
