package EmailServicePackage.annotation_javaBean_config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"EmailServicePackage.annotation_javaBean_config"})// accepts array of packages
public class MyAppConfig {
    //we don't need to write her any thing @Bean task can be done by component scan
}
