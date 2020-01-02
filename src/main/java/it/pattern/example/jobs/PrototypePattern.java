/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.pattern.example.jobs;

import it.pattern.example.prototype.MyLinkedHashMap;
import it.pattern.example.prototype.Prototype;
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

        Prototype hash = new MyLinkedHashMap();
        Prototype hashCloned = (MyLinkedHashMap) hash.clone();
        hash.addItem("key1", "primo valore");
        hashCloned.addItem("key2","secondo valore");
        String ob = (String) hash.getList("key1");
        String ob2=(String) hashCloned.getList("key2");
        String ob3=(String) hashCloned.getList("key1");
        
        logger.info("****************************************************");
        logger.info("PROTOTYPE METHOD");
        logger.info(ob);
        logger.info(ob2);
        logger.info(ob3);
        logger.info("****************************************************");

    }
}
