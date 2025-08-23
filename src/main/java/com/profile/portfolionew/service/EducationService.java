package com.profile.portfolionew.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.profile.portfolionew.dto.EducationDto;

@Service
public class EducationService {
	
	public List<EducationDto> getEducationList(){
		return Arrays.asList(

				new EducationDto("Viva College",
						"BSC IT",
						"IT",
						"2021",
						"2024",
						"NA"
						
						
						),
				new EducationDto("Viva College",
						"BSC IT",
						"IT",
						"2021",
						"2024",
						"NA"
						
						
						)
				
				
				);
	}

}
