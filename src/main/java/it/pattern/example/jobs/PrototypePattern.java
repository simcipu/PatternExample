/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.pattern.example.jobs;

import it.pattern.example.prototypePattern.MyMap;
import it.pattern.example.prototypePattern.Prototype;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author Utente
 */
@Component
public class PrototypePattern {

    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(PrototypePattern.class);

    @Scheduled(fixedRate = 8000)
    public void LoggoPattern() throws CloneNotSupportedException {

        Prototype map = new MyMap();
        Prototype mapCloned = (MyMap) map.clone();
        map.add("key1", "primo valore");
        mapCloned.add("key2","secondo valore");
        String ob = (String) map.getList("key1");
        String ob2=(String) mapCloned.getList("key2");
        String ob3=(String) mapCloned.getList("key1");
        
        logger.info("****************************************************");
        logger.info("PROTOTYPE METHOD");
        logger.info(ob);
        logger.info(ob2);
        logger.info(ob3);
        logger.info("****************************************************");

    }
}
