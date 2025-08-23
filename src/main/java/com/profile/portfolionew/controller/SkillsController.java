package com.profile.portfolionew.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profile.portfolionew.dto.SkillsDto;
import com.profile.portfolionew.service.SkillsService;

@RestController
@RequestMapping("/api/v1/skills")
public class SkillsController {
	
	@Autowired
	private SkillsService service;
	
	   @GetMapping()
	    public List<SkillsDto> getSkills() {
	        return service.getSkills();
	    }

}
