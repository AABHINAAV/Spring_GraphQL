package com.graphql.learn.Spring_GraphQL;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringGraphQlApplication implements CommandLineRunner {

	@Value("${server.port}")
	private String port;

	public static void main(String[] args) {
		SpringApplication.run(SpringGraphQlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Server running at {}", port);
	}
}
