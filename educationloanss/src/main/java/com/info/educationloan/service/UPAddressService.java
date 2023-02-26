package com.info.educationloan.service;

import java.util.List;
import java.util.Optional;

import com.info.educationloan.model.UPAddress;
import com.info.educationloan.model.UserRegistration;

public interface UPAddressService {

	UPAddress savedata(UPAddress st);

	List<UPAddress> getuse();

	void deltStud(Integer sid);

	Optional<UPAddress> getSingleData(int sid);

	UPAddress getupadte(Integer sid, UPAddress p);

	

}
