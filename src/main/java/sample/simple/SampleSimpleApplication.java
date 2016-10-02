package sample.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sample.simple.service.HelloWorldService;

/**
 * Created by lee on 2016. 9. 29..
 */
@SpringBootApplication
public class SampleSimpleApplication implements CommandLineRunner {

    @Autowired
    private HelloWorldService helloWorldServie;


    @Override
    public void run(String... strings)  {
        System.out.println(this.helloWorldServie.getHelloMessage());
        if (strings.length > 0 && strings[0].equals("exitcode")){
            throw new ExitException();
        }
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(SampleSimpleApplication.class, args);
    }
}
