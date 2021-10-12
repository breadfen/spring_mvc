package beady.web;

import beady.listener.WebApplicationContextUtils;
import beady.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = req.getServletContext();
        ApplicationContext app = org.springframework.web.context.support.WebApplicationContextUtils.getWebApplicationContext(context);
        UserService service = app.getBean(UserService.class);
        System.out.println("spring容易创建");

        service.save();

    }
}
