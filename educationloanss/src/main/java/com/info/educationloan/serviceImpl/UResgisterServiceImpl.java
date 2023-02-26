package com.info.educationloan.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.educationloan.model.UserRegistration;
import com.info.educationloan.repository.URegisterRepository;
import com.info.educationloan.service.URegisterService;
@Service
public class UResgisterServiceImpl implements URegisterService{
@Autowired
URegisterRepository ur;
	@Override
	public UserRegistration savestud(UserRegistration st) {
		
		return ur.save(st);
	}
	@Override
	public List<UserRegistration> getStudList() {
		return ur.findAll();
	}
	@Override
	public void deltStud(Integer sid) {
	ur.deleteById(sid);
	}
	@Override
	public Optional<UserRegistration> getSingleData(int sid) {
		Optional<UserRegistration> user=ur.findById(sid);
		return user;
	}
	@Override
	public UserRegistration getsinglepr(Integer sid, UserRegistration p) {
		Optional<UserRegistration> op=ur.findById(sid);
		if(op.isPresent()) {
			UserRegistration pp=op.get();
			pp.setRid(p.getRid());
			pp.setFirstName(p.getFirstName());
			pp.setMidddleName(p.getMidddleName());
			pp.setLastName(p.getLastName());
			pp.setMobileNo(p.getMobileNo());
			pp.setEmailId(p.getEmailId());
			pp.setPassword(p.getPassword());
			pp.setConfirmPassword(p.getConfirmPassword());
			
		return	ur.save(pp);
		}
		else {
			System.out.println("Student not available");
		}
			return null;
	}
	
//			
//		public StudentDetails savestud(StudentDetails st) {
//			
//			return str.save(st);
//		}
//		@Override
//		public List<StudentDetails> getStudList() {
//			
//			return str.findAll();
//		}
//		@Override
//		public void deltStud(Integer sid) {
//			str.deleteById(sid);
//			
//		}
//		
//		public StudentDetails getsinglepr(Integer sid, StudentDetails p) {
//			Optional<StudentDetails> op=str.findById(sid);
//			if(op.isPresent()) {
//				StudentDetails pp=op.get();
//				pp.setSid(p.getSid());
//				pp.setSname(p.getSname());
//				pp.setEducation(p.getEducation());
//				pp.setAge(p.getAge());
//				pp.setUsername(p.getUsername());
//				pp.setPassword(p.getPassword());
//				pp.setSaddr(p.getSaddr());
//				
//			return	str.save(pp);
//			}
//			else {
//				System.out.println("Student not available");
//			}
//				return null;
//		}
//		
//		@Override
//		public Optional<StudentDetails> getSingleData(int sid) {
//		Optional<StudentDetails> student=str.findById(sid);
//			return student;
//		}
//
//		
//
//	}
}
