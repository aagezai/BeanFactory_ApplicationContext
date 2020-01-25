package EmailServicePackage.javaClassBased_beanConfig;

import EmailServicePackage.EmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public  EmailService emailService(){// emailService will be the name of the bean in main method
        return new EmailService();
    }

}
