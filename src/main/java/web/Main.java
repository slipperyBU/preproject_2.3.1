package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.WebConfig;
import web.dao.UserDAO;
import web.dao.UserDAOImpl;
import web.models.User;
import web.service.UserService;
import web.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext =new AnnotationConfigApplicationContext(WebConfig.class);

        UserDAO user = applicationContext.getBean(UserDAOImpl.class);
    }
}
