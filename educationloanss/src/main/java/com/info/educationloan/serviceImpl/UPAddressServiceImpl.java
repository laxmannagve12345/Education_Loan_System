package com.info.educationloan.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.educationloan.model.UPAddress;
import com.info.educationloan.model.UserRegistration;
import com.info.educationloan.repository.UPAddressRepo;
import com.info.educationloan.service.UPAddressService;
@Service
public class UPAddressServiceImpl implements UPAddressService{
	
@Autowired
UPAddressRepo ur;

@Override
public UPAddress savedata(UPAddress st) {
	
	return ur.save(st);
}

@Override
public List<UPAddress> getuse() {
	
	return ur.findAll();
}

@Override
public void deltStud(Integer sid) {
	ur.deleteById(sid);
	
}

@Override
public Optional<UPAddress> getSingleData(int sid) {
	
	return ur.findById(sid);
}

@Override
public UPAddress getupadte(Integer sid, UPAddress p) {
	Optional<UPAddress> op=ur.findById(sid);
	if(op.isPresent()) {
		UPAddress pp=op.get();
		pp.setAId(p.getAId());
		pp.setPareaName(p.getPareaName());
		pp.setPcityName(p.getPcityName());
		pp.setPhouseNo(p.getPhouseNo());
		pp.setPdistric(p.getPdistric());
		pp.setPstate(p.getPstate());
		pp.setPpincode(p.getPpincode());
		
	return	ur.save(pp);
	}
	else {
		System.out.println("Student not available");
	}
		return null;
	
}







	
//public UserRegistration savestud(UserRegistration st) {
//		
//		return ur.save(st);
//	}
//	@Override
//	public List<UserRegistration> getStudList() {
//		return ur.findAll();
//	}
//	@Override
//	public void deltStud(Integer sid) {
//	ur.deleteById(sid);
//	}
//	@Override
//	public Optional<UserRegistration> getSingleData(int sid) {
//		Optional<UserRegistration> user=ur.findById(sid);
//		return user;
//	}
//	@Override
//	public UserRegistration getsinglepr(Integer sid, UserRegistration p) {
//		Optional<UserRegistration> op=ur.findById(sid);
//		if(op.isPresent()) {
//			UserRegistration pp=op.get();
//			pp.setRid(p.getRid());
//			pp.setFirstName(p.getFirstName());
//			pp.setMidddleName(p.getMidddleName());
//			pp.setLastName(p.getLastName());
//			pp.setMobileNo(p.getMobileNo());
//			pp.setEmailId(p.getEmailId());
//			pp.setPassword(p.getPassword());
//			pp.setConfirmPassword(p.getConfirmPassword());
//			
//		return	ur.save(pp);
//		}
//		else {
//			System.out.println("Student not available");
//		}
//			return null;
//	}
}
