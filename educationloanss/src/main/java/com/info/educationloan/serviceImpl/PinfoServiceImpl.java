package com.info.educationloan.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.educationloan.model.PersonalInfo;
import com.info.educationloan.model.UPAddress;
import com.info.educationloan.repository.PersonalInfoRepository;
import com.info.educationloan.service.PersonalInfoService;
@Service
public class PinfoServiceImpl implements PersonalInfoService{
@Autowired
PersonalInfoRepository pi;

@Override
public PersonalInfo savedata(PersonalInfo st) {

	return pi.save(st);
}

@Override
public List<PersonalInfo> getuse() {
	
	return pi.findAll();
}

@Override
public void deltStud(Integer sid) {
	pi.deleteById(sid);
	
}

@Override
public Optional<PersonalInfo> getSingleData(int sid) {
	
	return pi.findById(sid);
}

@Override
public PersonalInfo updateStudent(int sid) {
	
	return pi.findByUid(sid);
}


}
