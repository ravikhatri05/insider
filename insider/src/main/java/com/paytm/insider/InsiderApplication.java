package com.paytm.insider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;
import java.time.Duration;

@SpringBootApplication
@Configuration
@EnableScheduling
public class InsiderApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsiderApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {

		return builder
				.setConnectTimeout(Duration.ofMillis(30000))
				.setReadTimeout(Duration.ofMillis(30000))
				.build();
	}

}
