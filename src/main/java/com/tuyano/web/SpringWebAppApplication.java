package com.tuyano.web;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWebAppApplication {

	@Autowired
	MyDataEntityRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringWebAppApplication.class, args);
	}
	
	@PostConstruct
	public void intialData(){
		repository.save(new MyDataEntity("tuyano","syoda@tuyano"));
		repository.save(new MyDataEntity("hanako","hanako@flower"));
		repository.save(new MyDataEntity("sachiko","sachico@happy"));
		repository.save(new MyDataEntity("taro","taro@yamada"));
		repository.flush();
	}
}
