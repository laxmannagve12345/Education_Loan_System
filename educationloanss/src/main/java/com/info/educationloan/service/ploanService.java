package com.info.educationloan.service;

import java.util.List;
import java.util.Optional;

import com.info.educationloan.model.PreviousLoan;
import com.info.educationloan.model.UPAddress;

public interface ploanService {

	

	PreviousLoan savedata(PreviousLoan st);

	List<PreviousLoan> getuse();

	void deltStud(Integer sid);

	Optional<PreviousLoan> getSingleData(int sid);

	PreviousLoan getupadte(Integer sid, PreviousLoan p);

}
