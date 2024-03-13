package co.com.tascon.microservice.resolveEnigmaApi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = { "co.com.tascon.microservice.resolveEnigmaApi", "co.com.tascon.microservice.resolveEnigmaApi.api" , "co.com.tascon.microservice.resolveEnigmaApi.config"})
public class ResolveEnigmaApplicationStep3 {

	public static void main(String[] args) throws Exception {
        new SpringApplication(ResolveEnigmaApplicationStep3.class).run(args);
	}
    
}