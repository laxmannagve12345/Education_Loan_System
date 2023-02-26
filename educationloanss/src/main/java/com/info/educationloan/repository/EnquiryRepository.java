package com.info.educationloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.info.educationloan.model.EnquiryDetails;
@Repository
public interface EnquiryRepository extends JpaRepository<EnquiryDetails, Integer>{

}
