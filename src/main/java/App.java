import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld firstHelloWorld =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld secondHelloWorld =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat firstCat =
                (Cat) applicationContext.getBean("cat");
        Cat secondCat =
                (Cat) applicationContext.getBean("cat");
        System.out.println("HelloWorld ссылаются на один и тот же объект? " + (firstHelloWorld == secondHelloWorld));
        System.out.println("Cat ссылаются на один и тот же объект? " + (firstCat == secondCat));
    }
}