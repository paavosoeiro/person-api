package com.personalboot.mongodb.entities;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {

	@Id
	private String id;

	private String name;

	private String document;

}
