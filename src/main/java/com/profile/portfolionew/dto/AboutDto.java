package com.profile.portfolionew.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AboutDto {
	
	private String name;
	private String title;
	private String description;
	private String email;
	private String linkedin;
	private String github;

}
