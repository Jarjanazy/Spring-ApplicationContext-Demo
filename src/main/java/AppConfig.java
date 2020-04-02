import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(GreetingConfig.class) // this import tells Spring to look in GreetingConfig for Beans
public class AppConfig {
    // an entry point
    public static void main(String[] args){
        // create a new Spring Context using the provided config class
        // the AnnotationConfigApplicationContext is one implementation of many
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        // get the bean called helloGreeting
        String beanString = (String) applicationContext.getBean("helloGreeting");

        System.out.println(beanString);
    }
}
