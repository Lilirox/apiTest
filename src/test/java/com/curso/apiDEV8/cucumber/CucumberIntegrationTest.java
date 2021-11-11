package com.curso.apiDEV8.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources")//Indica la ruta de donde va a tomar el feature
public class CucumberIntegrationTest {

}
