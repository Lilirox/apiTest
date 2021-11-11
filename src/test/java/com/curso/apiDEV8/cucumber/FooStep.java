package com.curso.apiDEV8.cucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * 
 * @author rmontesd
 * Clase para verificar el feature
 */
public class FooStep {

    @Autowired
    private TestRestTemplate testRestTemplate;

    private ResponseEntity<String> responseEntity;

    @When("the client calls author") 
    public void callHello() { 
        responseEntity = testRestTemplate.getForEntity("http://localhost:8080/author", String.class); 
    } 
 
    @Then("the client receives status code of 200") 
    public void checkStatus200(){ 
 
        assertEquals(responseEntity.getStatusCode() , HttpStatus.OK); 
    } 
    
}