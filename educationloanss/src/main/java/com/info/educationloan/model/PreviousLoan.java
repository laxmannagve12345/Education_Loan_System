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
public class PreviousLoan {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int ploanId;
private String bankName;
private String branchName;
private Double ploanAmount;
private Double paidloan;
private Double remainingAmount;
private String ifsc;
private String micrcode;
private long contactNo;
private String branchAddress;
private String email;
private String status;
private String remarks;
private Double branchcode;
private int ptenure;
}

