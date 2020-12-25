package com.cognixia.model;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToDoSender {
@Bean
public CommandLineRunner sendToDos(@Value("${country.amqp.queue}") String destination, ToDoProducer producer) {
	return args -> {
	Todo todo = new Todo();
//		todo.setDes("workout!");
//		todo.setDone(false);
//		todo.setTargetDate(new Date());
//		todo.setUser("John");
	
		todo.setDes("Washington DC");
//		todo.setDone(false);
//		todo.setTargetDate(new Date());
		todo.setPopulation(328000000);
		todo.setLandmark("Washington Monument");
		todo.setUser("United States");

		producer.sendTo(destination, todo);
		};
	}
}
