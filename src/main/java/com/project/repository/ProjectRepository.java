package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
	@Query(value="select * from project where experience=?% ",nativeQuery=true)
	List<Project> getExp(int a);

}
