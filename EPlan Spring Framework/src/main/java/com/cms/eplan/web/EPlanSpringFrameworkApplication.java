package com.cms.eplan.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude=HibernateJpaAutoConfiguration.class)
@ComponentScan("com.cms.eplan.web")
public class EPlanSpringFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(EPlanSpringFrameworkApplication.class, args);
	}

}

