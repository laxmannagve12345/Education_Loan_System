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

import com.info.educationloan.model.PreviousLoan;
import com.info.educationloan.model.UPAddress;
import com.info.educationloan.service.ploanService;

@RestController
public class pLoanController {
@Autowired
ploanService ps;

@PostMapping("/saveploan")
public ResponseEntity<PreviousLoan> savedata(@RequestBody PreviousLoan st)
{
	PreviousLoan studDetails=ps.savedata(st);
	return new ResponseEntity<PreviousLoan>(studDetails,HttpStatus.CREATED);
}

@GetMapping("/getloandata")
public ResponseEntity<List<PreviousLoan>>getStudList()
{ 
	List<PreviousLoan> stList=ps.getuse();
	if(stList.isEmpty()) 
		{
		return new ResponseEntity<List<PreviousLoan>>(HttpStatus.NO_CONTENT);
		}
	return new ResponseEntity<List<PreviousLoan>>(stList,HttpStatus.OK);
}

@DeleteMapping("/deleteloan/{sid}")
public ResponseEntity<String>deleteStud(@PathVariable Integer sid)
{
	ps.deltStud(sid);
	return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
}

@GetMapping(value="/getSingleloan/{sid}")
public ResponseEntity<Optional<PreviousLoan>> getSingleData(@PathVariable ("sid") int sid){
	
	
	Optional<PreviousLoan> student=ps.getSingleData(sid);
	
	
	return new ResponseEntity<Optional<PreviousLoan>>(student,HttpStatus.OK);
}


@PutMapping(value="/updateloan/{sid}")
public ResponseEntity<PreviousLoan> updatedata(@PathVariable Integer sid,@RequestBody PreviousLoan p) 
{
	PreviousLoan student=ps.getupadte(sid,p);
	
	return new ResponseEntity<PreviousLoan>(student,HttpStatus.OK);	
}


}
