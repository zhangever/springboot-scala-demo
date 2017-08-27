package com.github.ever;

import com.github.ever.config.TimeParametersConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(TimeParametersConfig.class)
@SpringBootApplication
public class SpringBootScalaDemoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootScalaDemoServiceApplication.class, args);
	}
}
