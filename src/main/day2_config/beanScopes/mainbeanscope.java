package beanScopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojobeans.Account;

public class mainbeanscope {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanscope/beans.xml");

        Account accountSingleton1 = applicationContext.getBean("account1", Account.class);
        accountSingleton1.setOwnerName("XXXXXXX");
        System.out.println(accountSingleton1.getOwnerName());

        Account accountSingleton2 = applicationContext.getBean("account1", Account.class);
        System.out.println(accountSingleton2.getOwnerName());

        System.out.println("-------------------------");

        Account accountPrototype1 = applicationContext.getBean("account2", Account.class);
        accountPrototype1.setOwnerName("YYYYYYY");
        System.out.println(accountPrototype1.getOwnerName());

        Account accountPrototype2 = applicationContext.getBean("account2", Account.class);
        System.out.println(accountPrototype2.getOwnerName());

        applicationContext.close();
    }
}
