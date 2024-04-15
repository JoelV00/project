package com.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.entity.Project;
import com.project.repository.ProjectRepository;

@Repository
public class ProjectDao {
	@Autowired
	ProjectRepository pr;
	public String postAll(List<Project> a) {
		 pr.saveAll(a);
		 return "Posted Successfully";
	}
	public List<Project> getAll() {
		return pr.findAll();
	}
	public List<Project> getExp(int a) {
		return pr.getExp(a);
		}
}
