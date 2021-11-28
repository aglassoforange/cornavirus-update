package io.javabrians.cornavirusupdate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CornavirusUpdateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CornavirusUpdateApplication.class, args);
	}

}
