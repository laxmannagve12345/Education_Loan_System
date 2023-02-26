package com.info.educationloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.info.educationloan.controller.uRegistrationController;
import com.info.educationloan.model.UserRegistration;
@Repository
public interface URegisterRepository extends JpaRepository<UserRegistration, Integer>{

}
