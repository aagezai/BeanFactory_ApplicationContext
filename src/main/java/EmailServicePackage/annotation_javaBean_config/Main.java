package EmailServicePackage.annotation_javaBean_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

;

public class Main {
    public static void main(String args[]){
       ApplicationContext context1 = new AnnotationConfigApplicationContext(MyAppConfig.class);
       SMSService smsService =(SMSService) context1.getBean("smsService");
       smsService.sendMessage("test@gmail.com","This is by annotation configration Eyob ");
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-annotation.xml");
//        SMSService smsService =(SMSService) context.getBean("smsService",SMSService.class);
//        smsService.sendMessage("test@gmail.com","This is by annotation configration Eyob ");
        List<Integer> list = new ArrayList<Integer>();
        int[] arr = new int[]{1,2,3,4,5};
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);


        list1.stream().forEach(x->System.out.println(x));
        String str = "My Name is Aaron";

        String[] splitter = str.split("\\s+");
        for(int k= splitter.length-1;k>=0;k--){
          System.out.print(splitter[k]);

        }

        //


        }
       
    }


