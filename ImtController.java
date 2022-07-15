package com.SpringbootCassandra.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.SpringbootCassandra.Model.Imteyaz;
import com.SpringbootCassandra.Repo.ImteyazRepo;

@RestController
public class ImtController {
	@Autowired
	private ImteyazRepo imteyazrepo;

	//@PostConstruct
	public void saveUser() {
		List<Imteyaz> newusers = new ArrayList<>();
		newusers.add(new Imteyaz(121, "rohit", "kolkaata", 33));
		newusers.add(new Imteyaz(122, "jedja", "dehli", 22));
		newusers.add(new Imteyaz(123, "kolhli", "hydrabad", 21));
		newusers.add(new Imteyaz(124, "komal", "asam", 23));
		newusers.add(new Imteyaz(125, "eshika", "asam", 44));
		imteyazrepo.saveAll(newusers);

	}

	@GetMapping("/getAllusers")
	public List<Imteyaz> getAllUsers() {
		return imteyazrepo.findAll();

	}

	@GetMapping("/getUserFilterByAge/{age}")
	public List<Imteyaz> getUserFilterByAge(@PathVariable int age) {
		return imteyazrepo.findByAgeGreaterThan(age);

	}

	@GetMapping("/getUserFilterBylessAge/{age}")
	public List<Imteyaz> getUserFilterByAge1(@PathVariable int age) {
		return imteyazrepo.findByAgeLessThan(age);

	}

	
}