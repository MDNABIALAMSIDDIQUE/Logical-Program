package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelClass {
	 private Long id;
	    private Long userId;
	    private String title;
	    private String body;
}
