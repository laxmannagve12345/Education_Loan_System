package com.info.educationloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.info.educationloan.model.PreviousLoan;
@Repository
public interface ploanRepository extends JpaRepository<PreviousLoan, Integer>{

}
