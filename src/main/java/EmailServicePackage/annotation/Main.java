package EmailServicePackage.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]){
//        ApplicationContext context1 = new AnnotationConfigApplicationContext(MyAppConfig.class);
//        SMSService smsService =(SMSService) context1.getBean("smsService");
//        smsService.sendMessage("test@gmail.com","This is by annotation configration Eyob ");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-annotation.xml");
        SMSService smsService =(SMSService) context.getBean("smsService",SMSService.class);
        smsService.sendMessage("test@gmail.com","This is by annotation configration Eyob ");
    }
}
