package com.demoproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoproject.Details;
import com.demoproject.repository.DetailsRepo;

@RestController
@RequestMapping("/Details")
public class demoController {
	@Autowired
	private DetailsRepo repo;
	@GetMapping("/detailsId")
	public List<Details>getDetailsId()
	{
		return repo.findAll();
	}
	@PostMapping("/save")
	public Details saveDetails(@RequestBody Details details) {
		return repo.save(details);
	}
	

}
