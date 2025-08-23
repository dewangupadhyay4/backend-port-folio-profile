package com.profile.portfolionew.service;

import org.springframework.stereotype.Service;

import com.profile.portfolionew.dto.AboutDto;

@Service
public class AboutService {

	public AboutDto getAboutInfo() {
	   return new AboutDto( "Dewang Upadhyay",
        "Backend Developer | Java & Spring Boot Enthusiast",
        "I am an Operations IT professional at Tata Capital, currently transitioning into Backend Development with a strong focus on Java, Spring Boot, and Data Structures & Algorithms (DSA). Passionate about designing efficient APIs and building scalable systems.",
        "your.email@example.com",
        "https://linkedin.com/in/yourprofile",
        "https://github.com/yourgithub");
	}
	
}
