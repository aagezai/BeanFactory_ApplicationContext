package EmailServicePackage;

import EmailServicePackage.javaClassBased_beanConfig.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]){
        //EmailService emailService = new EmailService();

        //BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
       // EmailService emailService = beanFactory.getBean("emailService",EmailService.class);
//BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
//EmailService emailService = beanFactory.getBean("emailService",EmailService.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
         EmailService emailService = context.getBean("emailService",EmailService.class);
// Java class config
        ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
        context1.getBean("emailService",EmailService.class);
        EmailService emailService1 = context.getBean("emailService",EmailService.class);


        emailService1.sendEmail("test@gmail.com","hello from Mealat Eyob ");
    }
}

