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

import com.info.educationloan.model.UPAddress;
import com.info.educationloan.model.UserRegistration;
import com.info.educationloan.service.UPAddressService;

@RestController
public class UPAddressController {
@Autowired
UPAddressService up;


@PostMapping("/saveup")
public ResponseEntity<UPAddress> savedata(@RequestBody UPAddress st)
{
	UPAddress studDetails=up.savedata(st);
	return new ResponseEntity<UPAddress>(studDetails,HttpStatus.CREATED);
}

@GetMapping("/getres")
public ResponseEntity<List<UPAddress>>getStudList()
{ 
	List<UPAddress> stList=up.getuse();
	if(stList.isEmpty()) 
		{
		return new ResponseEntity<List<UPAddress>>(HttpStatus.NO_CONTENT);
		}
	return new ResponseEntity<List<UPAddress>>(stList,HttpStatus.OK);
}

@DeleteMapping("/deleteus/{sid}")
public ResponseEntity<String>deleteStud(@PathVariable Integer sid)
{
	up.deltStud(sid);
	return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
}

@GetMapping(value="/getSingledata/{sid}")
public ResponseEntity<Optional<UPAddress>> getSingleData(@PathVariable ("sid") int sid){
	
	
	Optional<UPAddress> student=up.getSingleData(sid);
	
	
	return new ResponseEntity<Optional<UPAddress>>(student,HttpStatus.OK);
}


@PutMapping(value="/update/{sid}")
public ResponseEntity<UPAddress> updatedata(@PathVariable Integer sid,@RequestBody UPAddress p) 
{
	UPAddress student=up.getupadte(sid,p);
	
	return new ResponseEntity<UPAddress>(student,HttpStatus.OK);	
}


}
