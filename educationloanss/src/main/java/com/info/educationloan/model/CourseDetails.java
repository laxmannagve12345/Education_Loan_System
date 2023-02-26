package com.info.educationloan.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CourseDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int courseid;
	private String quota;
	private String startingdate;
	private String endingdate;
	private String institutename;
	private String coursename;
}

