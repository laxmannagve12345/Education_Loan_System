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
public class EmailSending {
	@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int eid;
private String ename;
private String euserName;
private String password;
private String toEmail;
private String fromEmail;
private String subject;
private String textBody;
private String toBcc;
}
