package com.profile.portfolionew.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.profile.portfolionew.dto.SkillsDto;

@Service
public class SkillsService {

	public List<SkillsDto> getSkills() {
        return Arrays.asList(
            new SkillsDto("Languages", Arrays.asList("Java", "Python", "C++")),
            new SkillsDto("Frameworks", Arrays.asList("Spring Boot", "Hibernate", "Spring Security")),
            new SkillsDto("Databases", Arrays.asList("MySQL", "PostgreSQL", "MongoDB")),
            new SkillsDto("Tools", Arrays.asList("Git", "Maven", "Docker", "Jenkins")),
            new SkillsDto("Cloud & Deployment", Arrays.asList("AWS", "Heroku"))
        );
    }
	
}
