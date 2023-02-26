package com.info.educationloan.service;

import java.util.List;
import java.util.Optional;

import com.info.educationloan.model.UserRegistration;

public interface URegisterService {

	UserRegistration savestud(UserRegistration st);

	List<UserRegistration> getStudList();

	void deltStud(Integer sid);

	Optional<UserRegistration> getSingleData(int sid);

	UserRegistration getsinglepr(Integer sid, UserRegistration p);

}
