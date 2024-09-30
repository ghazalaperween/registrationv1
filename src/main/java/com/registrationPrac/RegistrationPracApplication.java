package com.registrationPrac;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RegistrationPracApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationPracApplication.class, args);
	}
// this is first class that run which mean can use only a that configuration class b/c  where this run
// I can wright configuration here itself.

	@Bean   // when ever dependence inject is not happen for some reason like ioc does not which object to create
	//then we can use  annotation ex:-i want to copy data for a entity to dto and dto to entity so in my project
	// i use modelMapper lib. when a try to do dependence inject modelMapper lib i got msg error creating bean
	//now this msg i got b/c ioc was  create object this particular class.so hate config which object is create
	//for this reference variable  i use this annotation @bean b/c which now dependence inject perform ioc is which
	// object is create .

	public ModelMapper getModelMapper(){
		return new ModelMapper();


	}
}




