package com.info.educationloan.controller;

import java.util.List;
import java.util.Optional;
import java.util.Set;

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

import com.info.educationloan.model.Admin;
import com.info.educationloan.model.PersonalInfo;
import com.info.educationloan.service.AdminService;

@RestController
public class AdminController {
@Autowired
AdminService sm;
@GetMapping("/ssssdata")
public Admin getData() {
	Admin a=new Admin();
	a.setAId(1);
	a.setName("laxman");
	a.setPassword("aaaa");
	a.setUsername("bbbb");
	
	
	PersonalInfo p=new PersonalInfo();
	p.setUid(1);
	p.setUfirstname("qqq");
	p.setUmiddleName("sss");
	p.setUlastname("yy");
	p.setUdob("12/08");
	p.setEduQualification("BE");
	p.setContactNo("12345");
	p.setEmail("laxmannn");
	p.setFfirstName("ee");
	p.setFmiddleName("kk");
	p.setFlastName("hh");
	
	a.getPersonalinfo().add(p);
	return a;
}
@PostMapping("/savead")
public ResponseEntity<Admin> savedata(@RequestBody Admin st)
{
	Admin studDetails=sm.savedata(st);
	return new ResponseEntity<Admin>(studDetails,HttpStatus.CREATED);
}

//@GetMapping("/getlogincheck/{username}/{password}")
//public ResponseEntity<Admin>loginCheck(@PathVariable String username,@PathVariable String password,@RequestBody Admin ad){
//	if(username.equals(ad.getUsername()) && password.equals(ad.getPassword())) {
//		
//		return new ResponseEntity<List<Admin>>(stu,HttpStatus.Ok);
//	}
//	return null;
//}   //not work properly.

}
