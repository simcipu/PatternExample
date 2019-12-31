/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.pattern.example.jobs;

import it.pattern.example.factoryMethod.VeicoloEnum;
import it.pattern.example.factoryMethod.VeicoloFactory;
import java.util.Arrays;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author Utente
 */

@Component
public class FactoryMethod 
{

   private final static org.slf4j.Logger logger = LoggerFactory.getLogger(FactoryMethod.class);

   @Scheduled(fixedRate = 6000)
    public void LoggoPattern(){
        
      logger.info("****************************************************");  
      logger.info("FACTORY METHOD");
    VeicoloFactory factory = new VeicoloFactory();
        Arrays.stream(
               VeicoloEnum.values()).forEach(
                type-> logger.info(factory.getVeicolo(type).getCall()));
        
        
        logger.info("****************************************************");  
    }
 
}
