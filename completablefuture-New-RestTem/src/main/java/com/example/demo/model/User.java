package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	    private int id;
	    private String firstname;
	    private String lastname;
	    private String email;
	    private String birthDate;
	    private Login login;
	    private Address address;
	    private String phone;
	    private String website;
	    private Company company;
}
