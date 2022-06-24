package com.profdev.barista.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.profdev.barista.models.OrderProcessing;
import com.profdev.barista.repositories.ServicesRepository;

@RestController
@RequestMapping("api/v1/process-order")
public class ProcessingController {

	@Autowired
	private ServicesRepository repository;
	@CrossOrigin(origins = "http://localhost:1222")
	@GetMapping(value = { "", "/" })
	public Iterable<OrderProcessing> getAll() {
		return  repository.findAll();
	}
	@CrossOrigin(origins = "http://localhost:1222")
	@PostMapping
	public OrderProcessing insert(@RequestBody OrderProcessing request) {
		return repository.save(request);
	}
	@CrossOrigin(origins = "http://localhost:1222")
	@RequestMapping(value="{id}",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public OrderProcessing update(@RequestBody OrderProcessing request,@PathVariable long id) {
		return repository.save(request);
	}
	
	@CrossOrigin(origins = "http://localhost:1222")
	@RequestMapping(value="{id}",method = RequestMethod.DELETE)
	@ResponseBody
	public boolean delete(@PathVariable long id) {
		OrderProcessing processing=repository.findById(id).get();
		 repository.delete(processing);
		 return true;
	}
}
