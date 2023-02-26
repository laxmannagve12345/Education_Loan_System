package com.info.educationloan.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.educationloan.model.AllPersonalDocs;
import com.info.educationloan.repository.DocUploadingRepositoty;
import com.info.educationloan.service.DocUploaingService;
@Service
public class DocUploadingServiceImpl implements DocUploaingService{
@Autowired
DocUploadingRepositoty dr;

@Override
public AllPersonalDocs savedoc(AllPersonalDocs d) {
	
	return dr.save(d);
}

@Override
public List<AllPersonalDocs> getDoc() {
	return dr.findAll();
}
}
