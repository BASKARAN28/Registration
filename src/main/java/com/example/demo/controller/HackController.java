package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Hackathon;
import com.example.demo.repository.HackRepository;

@RestController
@CrossOrigin
public class HackController {
	@Autowired
	HackRepository TwotableRepository;
	@GetMapping("/get")
	List<Hackathon> getList(){
		return TwotableRepository.findAll();
	}
	@PostMapping("/post")
	public Hackathon create(@RequestBody Hackathon obj) {
		return TwotableRepository.save(obj);
	}
}
