/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.pattern.example.jobs;

import it.pattern.example.SingletonPattern.Singleton;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author Utente
 */
@Component
public class SingletonPattern {

    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(SingletonPattern.class);

    @Scheduled(fixedRate = 7000)
    public void LoggoPattern() {

        logger.info("****************************************************");
        logger.info("SINGLETON METHOD");
        Singleton.getIstance().metodo();
        logger.info("****************************************************");

    }

}
