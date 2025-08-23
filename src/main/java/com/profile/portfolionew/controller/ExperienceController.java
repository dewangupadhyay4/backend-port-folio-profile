package com.profile.portfolionew.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profile.portfolionew.dto.ExperienceDto;
import com.profile.portfolionew.service.ExperienceService;

@RestController
@RequestMapping("/api/v1/experience")
public class ExperienceController {

	@Autowired
	private ExperienceService experienceService;
	
	@GetMapping
	public ResponseEntity<List<ExperienceDto>> getExperienceDetails(){
		List<ExperienceDto> list=experienceService.getExperienceInfo();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
}
