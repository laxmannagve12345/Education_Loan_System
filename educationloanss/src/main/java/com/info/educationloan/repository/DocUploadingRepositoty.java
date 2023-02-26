package com.info.educationloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.info.educationloan.model.AllPersonalDocs;
@Repository
public interface DocUploadingRepositoty extends JpaRepository<AllPersonalDocs, Integer>{

}
