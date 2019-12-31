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
        Singleton s1 = Singleton.getIstance();
        s1.metodo();
        Singleton s2 = Singleton.getIstance();
        s2.metodo();
        Singleton s3 = Singleton.getIstance();
        s3.metodo();
        logger.info("****************************************************");

    }

}
