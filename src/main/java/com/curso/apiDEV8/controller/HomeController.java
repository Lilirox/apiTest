package com.curso.apiDEV8.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.curso.apiDEV8.domain.Author;
import com.curso.apiDEV8.domain.Weather;

@RestController
public class HomeController {

	@RequestMapping("/")
	public Weather home() {
		RestTemplate restTemplate = new RestTemplate();
		Weather weather =  restTemplate.getForObject("http://localhost:8080/data/weather.json", Weather.class);
		return weather;
	}
	
	@RequestMapping("/author")
	public Author aut() {
		RestTemplate restTemplate = new RestTemplate();
		Author author = restTemplate.getForObject("http://localhost:8080/data/author.json", Author.class);
		return author;
	}
}
