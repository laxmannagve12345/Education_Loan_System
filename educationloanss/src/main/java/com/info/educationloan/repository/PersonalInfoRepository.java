package com.info.educationloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.info.educationloan.model.PersonalInfo;
@Repository
public interface PersonalInfoRepository extends JpaRepository<PersonalInfo, Integer>{

	PersonalInfo findByUid(int sid);

}
