package com.profile.portfolionew.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profile.portfolionew.dto.AboutDto;
import com.profile.portfolionew.service.AboutService;

@RestController
@RequestMapping("/api/v1/about")
public class AboutController {

	@Autowired
	private AboutService aboutService;
	
	@GetMapping("/about")
	public AboutDto getAbout() {
		return aboutService.getAboutInfo();
	}
	
	
	@GetMapping("/")
	public ResponseEntity<Map<String, Object>> get(){
		return ResponseEntity.ok(Map.of("name","Dewang Upadhyay",
				"title","Backend Engineer",
				"location","thane",
				"highlights",List.of("100 days code","Projects")
				));
	}
	
}
