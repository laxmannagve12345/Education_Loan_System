package com.info.educationloan.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.educationloan.model.Admin;
import com.info.educationloan.model.PersonalInfo;
import com.info.educationloan.repository.AdminRepository;
import com.info.educationloan.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService{
@Autowired
AdminRepository ar;

//@Override
//public List<Admin> getuse() {
//	
//	return null;
//}

@Override
public Admin savedata(Admin st) {
	
	return ar.save(st);
}

//@Override
//public PersonalInfo savedata(PersonalInfo st) {
//
//	return pi.save(st);
//}
//
//@Override
//public List<PersonalInfo> getuse() {
//	
//	return pi.findAll();
//}
//
//@Override
//public void deltStud(Integer sid) {
//	pi.deleteById(sid);
//	
//}
//
//@Override
//public Optional<PersonalInfo> getSingleData(int sid) {
//	
//	return pi.findById(sid);
//}
//
//@Override
//public PersonalInfo updateStudent(int sid) {
//	
//	return pi.findByUid(sid);
//}

}
