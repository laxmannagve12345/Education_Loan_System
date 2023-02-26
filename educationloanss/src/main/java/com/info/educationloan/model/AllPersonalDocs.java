package com.info.educationloan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AllPersonalDocs {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int documentId;
//@Lob
//private byte[] addressProof;
@Lob
private byte[] pancard;
@Lob
private byte[] incomeTaxReturn;
@Lob
private byte[] adharcard;
@Lob
private byte[] photo;
@Lob
private byte[] signature;
@Lob
private byte[] thumb;
@Lob
private byte[] bankCheque;
//@Lob
//private byte[] salarySlip;

}
