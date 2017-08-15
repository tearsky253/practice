package practice.spring.sprice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static final String PRODUCT_NAME = "3D-Map";

    public static void main(String[] args) {
        String xmlPath = "context/ApplicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        Manager manager = (Manager)applicationContext.getBean("productManager");
        String progress = manager.queryProgress(PRODUCT_NAME);
        System.out.println(progress);
    }
}
