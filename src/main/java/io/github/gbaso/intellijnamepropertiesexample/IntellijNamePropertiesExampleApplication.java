package io.github.gbaso.intellijnamepropertiesexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class IntellijNamePropertiesExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntellijNamePropertiesExampleApplication.class, args);
	}

}
