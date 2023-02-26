package com.info.educationloan.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;
import com.info.educationloan.model.AllPersonalDocs;
import com.info.educationloan.service.DocUploaingService;


@RestController
public class DocUploadingController {

	@Autowired
	DocUploaingService ds;
	
	@RequestMapping(value="/savedoc",method=RequestMethod.POST,consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public AllPersonalDocs savefile(@RequestPart(required=true,value="pancard") MultipartFile f1,
			@RequestPart(required=true,value="incomeTaxReturn") MultipartFile f2,
			@RequestPart(required=true,value="adharcard") MultipartFile f3,
			@RequestPart(required=true,value="photo") MultipartFile f4,
			@RequestPart(required=true,value="signature") MultipartFile f5,
			@RequestPart(required=true,value="thumb") MultipartFile f6,
			@RequestPart(required=true,value="bankCheque") MultipartFile f7,
//			@RequestPart(required=true,value="salarySlip") MultipartFile f8,       
			@RequestPart("doc") String doc)throws IOException
	{
		AllPersonalDocs d= new AllPersonalDocs();
		
		
		d.setPancard(f1.getBytes());
		d.setIncomeTaxReturn(f2.getBytes());
		d.setAdharcard(f3.getBytes());
		d.setPhoto(f4.getBytes());
		d.setSignature(f5.getBytes());
		d.setThumb(f6.getBytes());
		d.setBankCheque(f7.getBytes());
//		d.setSalarySlip(f4.getBytes());

		Gson g=new Gson();
		AllPersonalDocs dss=g.fromJson(doc, AllPersonalDocs.class);
		d.setDocumentId(dss.getDocumentId());
	
		AllPersonalDocs d1=ds.savedoc(d);
		return d1;
		}
	@GetMapping("/getDocs")
	public List<AllPersonalDocs> getDocuments()
	{
		return ds.getDoc();
	}
}
