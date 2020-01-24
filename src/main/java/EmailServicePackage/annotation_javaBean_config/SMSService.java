package EmailServicePackage.annotation_javaBean_config;

import org.springframework.stereotype.Component;

@Component
public class SMSService {
    public void sendMessage(String receiver,String message){
        System.out.println(message +"is sent to"+receiver+"by text message..");
    }
}
