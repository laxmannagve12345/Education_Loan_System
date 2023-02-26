package com.info.educationloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.info.educationloan.model.UPAddress;
@Repository
public interface UPAddressRepo extends JpaRepository<UPAddress, Integer>{

}
