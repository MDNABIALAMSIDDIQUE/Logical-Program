package com.example.demo.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Login {

	 private String uuid;
	    private String username;
	    private String password;
	    private String md5;
	    private String sha1;
	    private Date registered;
}
