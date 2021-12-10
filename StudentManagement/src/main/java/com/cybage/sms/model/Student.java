package com.cybage.sms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="STUDENT_TBL")
public class Student {
	@Id
	@GeneratedValue
	private long studentid;
	private String studentname;
	private String studentbloodgroup;
	private float scorepoints;
	private String studentaddress;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Student(long studentid, String studentname, String studentbloodgroup, float scorepoints,
			String studentaddress) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentbloodgroup = studentbloodgroup;
		this.scorepoints = scorepoints;
		this.studentaddress = studentaddress;
	}



	public long getStudentid() {
		return studentid;
	}
	public void setStudentid(long studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentbloodgroup() {
		return studentbloodgroup;
	}
	public void setStudentbloodgroup(String studentbloodgroup) {
		this.studentbloodgroup = studentbloodgroup;
	}
	public float getScorepoints() {
		return scorepoints;
	}
	public void setScorepoints(float f) {
		this.scorepoints = f;
	}
	public String getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}
	
}
