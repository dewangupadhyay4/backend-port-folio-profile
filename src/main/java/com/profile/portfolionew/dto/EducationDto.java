package com.profile.portfolionew.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EducationDto {
	
	private String institution;
	private String degree;
	private String fieldOfStudy;
	private String startOfYear;
	private String endOfYear;
	private String description;

}
