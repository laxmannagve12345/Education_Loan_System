package com.info.educationloan.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.educationloan.model.PreviousLoan;
import com.info.educationloan.model.UPAddress;
import com.info.educationloan.repository.ploanRepository;
import com.info.educationloan.service.ploanService;
@Service
public class ploanServiceImpl implements ploanService{
@Autowired
ploanRepository pr;

@Override
public PreviousLoan savedata(PreviousLoan st) {
	
	return pr.save(st);
}

@Override
public List<PreviousLoan> getuse() {
	
	return pr.findAll();
}

@Override
public void deltStud(Integer sid) {
	pr.deleteById(sid);
	
}

@Override
public Optional<PreviousLoan> getSingleData(int sid) {
	
	return pr.findById(sid);
}

@Override
public PreviousLoan getupadte(Integer sid, PreviousLoan p) {
	Optional<PreviousLoan> op=pr.findById(sid);
	if(op.isPresent()) {
		PreviousLoan pp=op.get();
		pp.setPloanId(p.getPloanId());
		pp.setBankName(p.getBankName());
		pp.setBranchAddress(p.getBranchAddress());
		pp.setBranchcode(p.getBranchcode());
		pp.setContactNo(p.getContactNo());
		
		pp.setRemainingAmount(p.getRemainingAmount());
		pp.setIfsc(p.getIfsc());
		pp.setMicrcode(p.getMicrcode());
		pp.setEmail(p.getEmail());
		pp.setPtenure(p.getPtenure());
		
		pp.setRemarks(p.getRemarks());
		pp.setStatus(p.getStatus());
		pp.setPloanAmount(p.getPloanAmount());
		pp.setPaidloan(p.getPaidloan());
		pp.setBranchName(p.getBranchName());
	return	pr.save(pp);
	}
	else {
		System.out.println("Student not available");
	}
		return null;
	
}


	

}
