package com.info.educationloan.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

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

import com.info.educationloan.model.UserRegistration;
import com.info.educationloan.service.URegisterService;

@RestController
public class uRegistrationController {
@Autowired
URegisterService  us;


	
	@PostMapping("/postStudent")
	public ResponseEntity<UserRegistration> savestuddata(@Valid @RequestBody UserRegistration st)
	{
		UserRegistration studDetails=us.savestud(st);
		return new ResponseEntity<UserRegistration>(studDetails,HttpStatus.CREATED);
	}

	@GetMapping("/getAllStud")
	public ResponseEntity<List<UserRegistration>>getStudList()
	{ 
		List<UserRegistration> stList=us.getStudList();
		if(stList.isEmpty()) 
			{
			return new ResponseEntity<List<UserRegistration>>(HttpStatus.NO_CONTENT);
			}
		return new ResponseEntity<List<UserRegistration>>(stList,HttpStatus.OK);
	}
	
	@DeleteMapping("/delt_Stud/{sid}")
	public ResponseEntity<String>deleteStud(@PathVariable Integer sid)
	{
		us.deltStud(sid);
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}

	@GetMapping(value="/getSingle/{sid}")
	public ResponseEntity<Optional<UserRegistration>> getSingleData(@PathVariable ("sid") int sid){
		
		
		Optional<UserRegistration> student=us.getSingleData(sid);
		
		
		return new ResponseEntity<Optional<UserRegistration>>(student,HttpStatus.OK);
	}
	
	
	@PutMapping(value="/updt_Stud/{sid}")
	public ResponseEntity<UserRegistration> updatedata( @Valid @PathVariable Integer sid,@RequestBody UserRegistration p) 
	{
		UserRegistration student=us.getsinglepr(sid,p);
		
		return new ResponseEntity<UserRegistration>(student,HttpStatus.OK);	
	}
	

}
