package com.ea360.prj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ea360.prj.model.Project;
import com.ea360.prj.service.ProjectService;

@RestController
public class ProjectController {

	@Autowired
	private ProjectService service;

	@GetMapping("/projects/{projectName}")
	public Project getProject(@PathVariable String projectName) {

		return service.getProject(projectName);

	}

	@GetMapping("/projects")
	public ResponseEntity<List<Project>> getAllProjects() {

		return ResponseEntity.ok().body(service.getAllProjects());

	}

	@PostMapping("/projects")
	public ResponseEntity<Project> createProject(@RequestBody Project project) {

		return ResponseEntity.ok().body(service.createProject(project));

	}

	@PutMapping("/projects")
	public ResponseEntity<Project> updateProject(@RequestBody Project project) {

		return ResponseEntity.ok().body(service.updateProject(project));

	}

	@DeleteMapping("/projects/{projectName}")
	public HttpStatus deleteProject(@PathVariable String projectName) {
		
		service.deleteProject(projectName);
		
		return HttpStatus.OK;

	}

}
