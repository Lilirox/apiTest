package com.curso.apiDEV8.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.curso.apiDEV8.ApiDev8Application;

/**
 * 
 * @author rmontesd
 *
 * Se envia la clase principal del proyecto
 * en este caso Demoapplication
 */
@CucumberContextConfiguration
@SpringBootTest(classes = ApiDev8Application.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = ApiDev8Application.class, loader = SpringBootContextLoader.class)
public class CucumberSpringConfiguration {

}
