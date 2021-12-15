package com.example.SpringAirplanes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringAirplanes.service.AirplaneService;

@RestController
@RequestMapping("/airplane")


public class AirplaneController {
	
	   private AirplaneService service;
	   
	   private AirplaneController(AirplaneService service)  {
		   this.service = service;
		   
	   }
	   
	   
	   //
	   
	
	
	

}
