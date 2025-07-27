package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    @RequestMapping("/")
    public String hello() {
        return "Hello World !!!" + "\n" + """
        1. Default - Tomcat embedded server -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		----------------------------------------------------
		
		2. Jetty - config -
		To use Jetty instead of Tomcat in your Spring Boot application, remove the Tomcat starter and add the Jetty starter in your pom.xml
		
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
			<exclusions>
				<exclusion>
					<groupId>org.springframework.boot</groupId>
					<artifactId>spring-boot-starter-tomcat</artifactId>
				</exclusion>
			</exclusions>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-jetty</artifactId>
		</dependency>
		
		-----------------------------------------------------------------------------------
		
		3. Undertow - add following dependency by excluding the tomcat server
   		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-undertow</artifactId>
		</dependency>
		
		
                """;
    }
}
