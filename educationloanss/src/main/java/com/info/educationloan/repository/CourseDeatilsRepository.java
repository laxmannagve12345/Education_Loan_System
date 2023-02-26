package com.info.educationloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.info.educationloan.model.CourseDetails;
@Repository
public interface CourseDeatilsRepository extends JpaRepository<CourseDetails, Integer>{

	CourseDetails findByCourseid(int courseid);


	
}
