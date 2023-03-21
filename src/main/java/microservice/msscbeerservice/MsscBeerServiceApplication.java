package microservice.msscbeerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication
public class MsscBeerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsscBeerServiceApplication.class, args);
		System.err.println("hellooooooooooooooooooooooo");
	}



}
