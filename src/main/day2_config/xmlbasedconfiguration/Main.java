package xmlbasedconfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojobeans.AccountService;

public class Main {
    public static void main(String[] args) {


        //Xml-Based
        // -----------------------------
        //ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("xmlbasedconfiguration/beans.xml");
        //AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

        //Annotation
        // -----------------------------
        //ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("xmlbasedconfiguration/annotationconfig.xml");
        //AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

        //Java-Based beanConfiguration
        // -----------------------------
        //AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        //AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

        //Depency injection Setter and Constructor
        // -----------------------------
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Constructor/beans.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

        System.out.println("Before money transfer");
        System.out.println("Before 1 balance: " + accountService.getAccount(1).getBalance());
        System.out.println("Before 2 balance: " + accountService.getAccount(2).getBalance());

        accountService.transferMoney(1, 2, 5.0);
        System.out.println("-------------------");
        System.out.println("After money transfer");
        System.out.println("Account 1 balance: " + accountService.getAccount(1).getBalance());
        System.out.println("Account 2 balance: " + accountService.getAccount(2).getBalance());
    }
}
