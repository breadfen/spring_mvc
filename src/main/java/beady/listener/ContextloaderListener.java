package beady.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextloaderListener implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext context = servletContextEvent.getServletContext();
        String configLocation = context.getInitParameter("configLocation");
        ApplicationContext app=new ClassPathXmlApplicationContext(configLocation);
        context.setAttribute("app",app);
        System.out.println("spring创建完毕");

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
