import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean String TestBean(){
        return "Hello Test";
    }

    public static void main(String[] args){
        // create a new Spring Context using the provided config class
        // the AnnotationConfigApplicationContext is one implementation of many
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        // get the bean called TestBean
        String beanString = (String) applicationContext.getBean("TestBean");

        System.out.println(beanString);
    }
}
