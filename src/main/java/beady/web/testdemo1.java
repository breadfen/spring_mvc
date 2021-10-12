package beady.web;

import beady.config.SpringConfiguration;
import beady.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testdemo1 {
    public static void main(String[] args) {
       // ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
       ApplicationContext app=new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService service = app.getBean(UserService.class);
        service.save();
    }
}
