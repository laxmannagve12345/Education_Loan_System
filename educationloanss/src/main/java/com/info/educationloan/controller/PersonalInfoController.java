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

import com.info.educationloan.model.PersonalInfo;
import com.info.educationloan.model.UPAddress;
import com.info.educationloan.service.PersonalInfoService;

@RestController
public class PersonalInfoController {
@Autowired
PersonalInfoService ps;

@PostMapping("/savepi")
public ResponseEntity<PersonalInfo> savedata(@RequestBody PersonalInfo st)
{
	PersonalInfo studDetails=ps.savedata(st);
	return new ResponseEntity<PersonalInfo>(studDetails,HttpStatus.CREATED);
}

@GetMapping("/getpinfo")
public ResponseEntity<List<PersonalInfo>>getStudList()
{ 
	List<PersonalInfo> stList=ps.getuse();
	if(stList.isEmpty()) 
		{
		return new ResponseEntity<List<PersonalInfo>>(HttpStatus.NO_CONTENT);
		}
	return new ResponseEntity<List<PersonalInfo>>(stList,HttpStatus.OK);
}

@DeleteMapping("/deletepi/{sid}")
public ResponseEntity<String>deleteStud(@PathVariable Integer sid)
{
	ps.deltStud(sid);
	return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
}

@GetMapping(value="/getSinglepi/{sid}")
public ResponseEntity<Optional<PersonalInfo>> getSingleData(@PathVariable ("sid") int sid){
	
	
	Optional<PersonalInfo> student=ps.getSingleData(sid);
	
	
	return new ResponseEntity<Optional<PersonalInfo>>(student,HttpStatus.OK);
}



@PutMapping("/updateStudent/{sid}")
public ResponseEntity<PersonalInfo> updateStudent(@PathVariable("sid") int sid,@RequestBody PersonalInfo stu)
{
	PersonalInfo s=ps.updateStudent(sid);
	ps.savedata(stu);
	return new ResponseEntity<PersonalInfo>(s, HttpStatus.CREATED);
	
}

}
