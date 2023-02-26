package com.info.educationloan.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EnquiryDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int enqId;
	
	@NotEmpty
    @Size(min=2 , max=30, message="name must be min 2 char and length max 30")
	private String name;
	
	@NotNull
	private long mobileNo;
	
	@Email
	private String email;
	
}


