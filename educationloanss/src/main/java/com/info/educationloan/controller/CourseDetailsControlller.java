package com.info.educationloan.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.info.educationloan.model.CourseDetails;
import com.info.educationloan.model.PersonalInfo;
import com.info.educationloan.service.CourseDetailsService;

@RestController
public class CourseDetailsControlller {
@Autowired
CourseDetailsService cs;
	
	@PostMapping("/saveco")
	public ResponseEntity<CourseDetails> savedata(@RequestBody CourseDetails st)
	{
		CourseDetails studDetails=cs.savedata(st);
		return new ResponseEntity<CourseDetails>(studDetails,HttpStatus.CREATED);
	}
//
	@GetMapping("/getcourse")
	public ResponseEntity<List<CourseDetails>>getStudList()
	{ 
		List<CourseDetails> stList=cs.getuse();
		if(stList.isEmpty()) 
			{
			return new ResponseEntity<List<CourseDetails>>(HttpStatus.NO_CONTENT);
			}
		return new ResponseEntity<List<CourseDetails>>(stList,HttpStatus.OK);
	}

	@DeleteMapping("/deletepi/{courseid}")
	public ResponseEntity<String>deleteStud(@PathVariable Integer courseid)
	{
		cs.deltStud(courseid);
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}

	@GetMapping(value="/getSinglco/{courseid}")
	public ResponseEntity<Optional<CourseDetails>> getSingleData(@PathVariable ("courseid") int courseid){
		
		
		Optional<CourseDetails> student=cs.getSingleco(courseid);
		
		
		return new ResponseEntity<Optional<CourseDetails>>(student,HttpStatus.OK);
	}


	@PutMapping("/updateco/{courseid}")
	public ResponseEntity<CourseDetails> updateStudent(@PathVariable("courseid") int courseid,@RequestBody CourseDetails stu)
	{
		CourseDetails s=cs.updateStudent(courseid);
		cs.savedata(stu);
		return new ResponseEntity<CourseDetails>(s, HttpStatus.CREATED);
		
	}
}
