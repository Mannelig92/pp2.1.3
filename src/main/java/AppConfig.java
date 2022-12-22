import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "helloworld") //Бин к имени которого будет привязан
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name = "cat")  //Бин по аналогии
    @Scope("prototype") //Скоуп prototype позволяет создавать новый объект при вызове бина, по умолчанию singleton
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setCatSound("Meow-meow");
        return cat;
    }
}