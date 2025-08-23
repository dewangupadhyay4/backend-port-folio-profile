package com.profile.portfolionew.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExperienceDto {

	
	private String company;
	private String role;
	private String startDate;
	private String endDate;
	private String description;
	private String technologies;
}
