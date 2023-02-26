package com.info.educationloan.service;

import java.util.List;

import com.info.educationloan.model.AllPersonalDocs;

public interface DocUploaingService {

	AllPersonalDocs savedoc(AllPersonalDocs d);

	List<AllPersonalDocs> getDoc();

}
