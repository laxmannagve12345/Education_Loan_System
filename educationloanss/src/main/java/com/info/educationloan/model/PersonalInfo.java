 package com.info.educationloan.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PersonalInfo {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int uid;
private String ufirstname;
private String umiddleName;
private String ulastname;
private String ffirstName;
private String fmiddleName;
private String flastName;
private String udob;
private String eduQualification;
private String email;
private String contactNo;

}


