package com.mmert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@KafkaListener(topics = "mmert-topic", groupId = "group-id")
	public void listen(String message) {

		System.out.println("Received Messasge : " + message);
	}

}
