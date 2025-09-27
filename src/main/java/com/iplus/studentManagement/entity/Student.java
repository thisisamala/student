package com.iplus.studentManagement.entity;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.validation.constraints.NotEmpty;
//import jakarta.validation.constraints.Size;

@Entity
public class Student {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@NotEmpty(message = "First name is required")
private String firstName;

@NotEmpty(message = "Last name is required")
private String lastName;

@NotEmpty(message = "email is required")
private String email;

//@Size(min = 5, max = 10, message = "Password must be between 5 and 10 characters")
//private String password;

public String getFirstName() { return firstName; }
public void setFirstName(String firstName) { this.firstName = firstName; }

public String getLastName() { return lastName; }
public void setLastName(String lastName) { this.lastName = lastName; }

public String getEmail() { return email; }
public void setEmail(String email) { this.email = email; }

//public String getPassword() { return password; }
//public void setPassword(String password) { this.password = password; }



}
