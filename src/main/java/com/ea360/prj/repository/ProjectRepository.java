package com.ea360.prj.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ea360.prj.model.Project;

public interface ProjectRepository extends MongoRepository<Project, String> {
	
	void deleteByProjectName(String projectName);
	
	Optional< Project > findByProjectName(String projectName);
	
	

}
