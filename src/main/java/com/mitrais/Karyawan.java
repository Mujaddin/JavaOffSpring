package com.mitrais;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "employeeTable")
public class Karyawan {
	@Id
	@Column(name = "emp_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long empId;
	@Column(name = "first_name", nullable = false)
	private String firstName;
	@Column(name = "last_name", nullable = false)
	private String lastName;
	@Column(name = "gender", nullable = false)
	private String gender;
	@Column(name = "dob")
	private Date dob;
	// @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	// private Set<OfficeLocation> officeLocations;
public Karyawan(){
	
}
public long getEmpId() {
	return empId;
}
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public String getGender() {
	return gender;
}
public Date getDob() {
	return dob;
}
public void setEmpId(long empId) {
	this.empId = empId;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public void setGender(String gender) {
	this.gender = gender;
}
public void setDob(Date dob) {
	this.dob = dob;
}

}
