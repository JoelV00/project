package com.project;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.entity.Project;

@SpringBootApplication
public class ProjectApplication {
	static Logger log=Logger.getLogger(ProjectApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
		PropertyConfigurator.configure("log.properties");
		log.info("Started");
	}

}
