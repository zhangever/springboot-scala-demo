package com.github.ever;

import com.github.ever.config.TimeParametersConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableConfigurationProperties(TimeParametersConfig.class)
@EnableScheduling
@SpringBootApplication
public class SpringBootScalaDemoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootScalaDemoServiceApplication.class, args);
	}
}
