package com.info.educationloan.service;

import java.util.List;
import java.util.Optional;

import com.info.educationloan.model.CourseDetails;

public interface CourseDetailsService {

	CourseDetails savedata(CourseDetails st);

	List<CourseDetails> getuse();

	void deltStud(Integer courseid);

	Optional<CourseDetails> getSingleco(int courseid);

	CourseDetails updateStudent(int courseid);



}