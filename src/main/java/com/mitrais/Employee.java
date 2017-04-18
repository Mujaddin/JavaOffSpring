package com.mitrais;

import java.sql.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "employeeTable")
public class Employee {
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
//	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
//	private Set<OfficeLocation> officeLocations;

}
