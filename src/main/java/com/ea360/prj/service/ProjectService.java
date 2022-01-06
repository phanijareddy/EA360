package com.ea360.prj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ea360.prj.exception.ResourceNotFoundException;
import com.ea360.prj.model.Project;
import com.ea360.prj.repository.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository repository;

	public Project getProject(String projectName) {

		return repository.findById(projectName).get();

	}

	public List<Project> getAllProjects() {

		List<Project> list = repository.findAll();

		list.forEach(x -> System.out.println("element " + x));

		return repository.findAll();

	}

	public Project createProject(Project project) {

		return repository.save(project);

	}

	public Project updateProject(Project project) {

		return repository.save(project);

	}

	public void deleteProject(String projectName){

		Optional<Project> project = repository.findByProjectName(projectName);

		if (project.isPresent()) {

			repository.delete(project.get());

		} else {

			throw new ResourceNotFoundException("Record not found with project Name : " + projectName);
		}

	}

}
