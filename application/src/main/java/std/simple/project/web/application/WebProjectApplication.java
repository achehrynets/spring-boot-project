package std.simple.project.web.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import std.simple.project.web.repository.configuration.EnableRepositoryModule;

@SpringBootApplication
@EnableRepositoryModule
public class WebProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebProjectApplication.class, args);
	}

}