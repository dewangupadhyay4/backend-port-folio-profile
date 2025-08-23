package com.profile.portfolionew.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.profile.portfolionew.dto.ProjectDto;

@Service
public class ProjectsService {

	 public List<ProjectDto> getProjects() {
	        return Arrays.asList(
	            new ProjectDto(
	                "Backend Portfolio",
	                "A detailed backend portfolio built using Spring Boot and Maven, showcasing APIs for About, Education, Experience, and Projects.",
	                "Java, Spring Boot, Maven, REST API",
	                "https://github.com/yourusername/backend-portfolio",
	                "http://localhost:8080"
	            ),
	            new ProjectDto(
	                "Blogging Platform",
	                "A mini blogging application with CRUD operations, user authentication, and comment system.",
	                "Java, Spring Boot, JPA, MySQL",
	                "https://github.com/yourusername/blog-app",
	                "https://blog-demo.herokuapp.com"
	            )
	        );
	    }
	
}
