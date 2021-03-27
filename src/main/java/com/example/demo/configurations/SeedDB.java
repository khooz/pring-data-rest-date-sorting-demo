package com.example.demo.configurations;

import java.time.LocalDateTime;
import java.time.Period;

import com.example.demo.data.inf.SimpleUserInterface;
import com.example.demo.data.model.SimpleUser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class SeedDB {

	private static final Logger log = LoggerFactory.getLogger(SeedDB.class);

	@Bean
	CommandLineRunner initDatabase(SimpleUserInterface repository) {
		return args -> {
			log.info("Preloading " + repository.save(new SimpleUser(1L, "user1", LocalDateTime.now().minus(Period.ofDays(5)))));
			log.info("Preloading " + repository.save(new SimpleUser(2L, "user2", LocalDateTime.now().minus(Period.ofDays(4)))));
			log.info("Preloading " + repository.save(new SimpleUser(3L, "user3", LocalDateTime.now().minus(Period.ofDays(3)))));
			log.info("Preloading " + repository.save(new SimpleUser(4L, "user4", LocalDateTime.now().minus(Period.ofDays(2)))));
			log.info("Preloading " + repository.save(new SimpleUser(5L, "user5", LocalDateTime.now())));
		};
	}
}