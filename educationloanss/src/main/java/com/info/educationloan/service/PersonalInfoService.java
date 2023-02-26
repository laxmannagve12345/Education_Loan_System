package com.info.educationloan.service;

import java.util.List;
import java.util.Optional;

import com.info.educationloan.model.PersonalInfo;
import com.info.educationloan.model.UPAddress;

public interface PersonalInfoService {

	PersonalInfo savedata(PersonalInfo st);

	List<PersonalInfo> getuse();

	void deltStud(Integer sid);

	Optional<PersonalInfo> getSingleData(int sid);

	PersonalInfo updateStudent(int sid);

	

}
