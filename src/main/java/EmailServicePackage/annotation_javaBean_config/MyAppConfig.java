package EmailServicePackage.annotation_javaBean_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"EmailServicePackage.annotation_javaBean_config"})
public class MyAppConfig {
    @Bean
    public SMSService smsService(){
        return new SMSService();
    }
}
