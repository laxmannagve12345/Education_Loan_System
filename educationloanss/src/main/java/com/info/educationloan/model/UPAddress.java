package com.info.educationloan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UPAddress {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int aId;
private String pareaName;
private String pcityName;
private String pdistric;
private String pstate;                                              
private String ppincode;
private  String phouseNo;


}