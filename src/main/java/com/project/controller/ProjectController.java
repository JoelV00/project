package com.project.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Project;
import com.project.service.ProjectService;

@RestController
@RequestMapping(value="/project")
public class ProjectController {
	@Autowired
	ProjectService ps;
		 static Logger log  =  Logger.getLogger(ProjectController.class);
	 
	 

	@PostMapping(value="/postAll")
	public String postAll(@RequestBody List<Project> a) {
		PropertyConfigurator.configure("log.properties");
		log.info("Objects Posted Succesfully");
		return ps.postAll(a);
	}
	@GetMapping(value="/getAll")
	public List<Project> getAll() {
		PropertyConfigurator.configure("log.properties");
		log.info("got the Objects Succesfully");
	return ps.getAll();
	}
	@GetMapping(value="/getExperience/{a}")
	public List<Project> getExp(@PathVariable int a) {
		PropertyConfigurator.configure("log.properties");
		log.info("exp is working");
	return ps.getExp(a);
	}
	
	
}
