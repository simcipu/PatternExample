/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.pattern.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 *
 * @author Utente
 */
@Profile(Profiles.APPLICATION)
@SpringBootApplication
@EnableScheduling
public class Application {





    public static void main(String[] args) throws Exception {

     
        
     SpringApplication.run(Application.class, args);
    }
    
  


}