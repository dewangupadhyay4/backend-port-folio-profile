package com.profile.portfolionew.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDto {
	
	  private String title;
	    private String description;
	    private String technologies;
	    private String githubLink;
	    private String liveDemo;

}
