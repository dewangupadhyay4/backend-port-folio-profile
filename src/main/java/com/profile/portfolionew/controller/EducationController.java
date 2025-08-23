package com.profile.portfolionew.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profile.portfolionew.dto.EducationDto;
import com.profile.portfolionew.service.EducationService;

@RestController
@RequestMapping("/api/v1/education")
public class EducationController {

	@Autowired
	private EducationService educationService;
	
	@GetMapping
	public ResponseEntity<List<EducationDto>> getEducationInfo(){
		
		List<EducationDto> list=educationService.getEducationList();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
}
