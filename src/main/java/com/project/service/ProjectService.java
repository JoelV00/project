package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.dao.ProjectDao;
import com.project.entity.Project;
@Service
public class ProjectService {
	@Autowired
	ProjectDao pd;
	public String postAll(List<Project> a) {
		return pd.postAll(a);
	}
	
	public List<Project> getAll() {
		return pd.getAll();
	}

	public List<Project> getExp(int a){ 
		return pd.getExp(a);
		}
}
