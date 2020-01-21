package EmailServicePackage.config;

import EmailServicePackage.EmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public  EmailService emailService(){
        return new EmailService();
    }
}
