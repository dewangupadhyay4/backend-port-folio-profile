package com.profile.portfolionew.controller;

import java.util.List;

import org.hibernate.annotations.Where;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profile.portfolionew.dto.ProjectDto;
import com.profile.portfolionew.service.ProjectsService;

@RestController
@RequestMapping("/api/v1/projects")
public class ProjectController {
	
	@Autowired
	private ProjectsService projectsService;

	   @GetMapping
	    public List<ProjectDto> getProjects() {
	        return projectsService.getProjects();
	    }
	
}
