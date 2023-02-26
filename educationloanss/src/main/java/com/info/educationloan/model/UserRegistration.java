package com.info.educationloan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class UserRegistration {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rid;
	@NotNull
	private String firstName;
	@Size(min=2,max=30,message="lenth should be between 2 to 30 charactre")
	private String midddleName;
	@NotEmpty
	private String lastName;
	@NotNull
	private String mobileNo;
	@Email(message="email address is invalid")
	private String emailId;
	private String password;
	private String confirmPassword;
}
