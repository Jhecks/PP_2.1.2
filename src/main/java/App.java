import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld firstWorldBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld secondWorldBean =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat firstCatBean =
                (Cat) applicationContext.getBean("cat");
        Cat secondCatBean =
                (Cat) applicationContext.getBean("cat");

        System.out.printf("firstWorldBean == secondWorldBean: %b\n", firstWorldBean == secondWorldBean);
        System.out.printf("firstCatBean == secondCatBean: %b\n", firstCatBean == secondCatBean);
    }
}