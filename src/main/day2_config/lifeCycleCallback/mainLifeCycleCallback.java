package lifeCycleCallback;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainLifeCycleCallback {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleCallback/beans.xml");

        pojobeans.foo foo = context.getBean("foo", pojobeans.foo.class);

        context.close();
    }
}
