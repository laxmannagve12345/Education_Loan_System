package com.info.educationloan.serviceImpl;

//import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.educationloan.model.EnquiryDetails;
import com.info.educationloan.repository.EnquiryRepository;
import com.info.educationloan.service.EnquiryService;
@Service
public class EnquiryServiceImpl implements EnquiryService{
@Autowired 
EnquiryRepository er;

@Override
public EnquiryDetails createUser( EnquiryDetails wnq) {
	
	return er.save(wnq);
}
}
