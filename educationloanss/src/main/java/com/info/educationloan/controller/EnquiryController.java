package com.info.educationloan.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.info.educationloan.model.EnquiryDetails;
import com.info.educationloan.service.EnquiryService;

@RestController
public class EnquiryController {
	@Autowired
	EnquiryService es;
	
	@PostMapping("/save")
	public ResponseEntity<EnquiryDetails>createUser(@Valid  @RequestBody EnquiryDetails wnq){
		
		EnquiryDetails ed=es.createUser(wnq);
		return new ResponseEntity<EnquiryDetails>(ed,HttpStatus.CREATED);
	}
}
