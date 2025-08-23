package com.profile.portfolionew.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.profile.portfolionew.dto.ExperienceDto;

@Service
public class ExperienceService {

	public List<ExperienceDto> getExperienceInfo() {
		return Arrays.asList(
				
				new ExperienceDto("Tata Capital",
						"Ops IT",
						"2020",
						"Present",
						"NA",
						"NA"
						),
				new ExperienceDto("Tata Capital",
						"Ops IT",
						"2020",
						"Present",
						"NA",
						"NA"
						)
				
				);
	}
	
}
