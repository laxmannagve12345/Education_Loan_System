package com.info.educationloan.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.educationloan.model.CourseDetails;
import com.info.educationloan.repository.CourseDeatilsRepository;
import com.info.educationloan.service.CourseDetailsService;
@Service
public class CourseDetailsServiceImpl implements CourseDetailsService{
@Autowired
CourseDeatilsRepository ss;
	@Override
	public CourseDetails savedata(CourseDetails st) {
		
		return ss.save(st);
	}
	@Override
	public List<CourseDetails> getuse() {
		return ss.findAll();
	}
	@Override
	public void deltStud(Integer courseid) {
		 ss.deleteById(courseid);
	}
	
	@Override
	public Optional<CourseDetails> getSingleco(int courseid) {
		
		return ss.findById(courseid);
	}
	@Override
	public CourseDetails updateStudent(int courseid) {
		
		return ss.findByCourseid(courseid);
	}
	

}
