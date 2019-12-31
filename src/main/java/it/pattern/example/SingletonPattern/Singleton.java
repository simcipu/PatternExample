/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.pattern.example.SingletonPattern;

import it.pattern.example.jobs.SingletonPattern;
import org.slf4j.LoggerFactory;


/**
 *
 * @author Utente
 */
public class Singleton {

    
        private final static org.slf4j.Logger logger = LoggerFactory.getLogger(Singleton.class);
  private static Singleton istance=null; // riferimento all' istanza

  private static String nome="sono unico!!!!!";
  
  private Singleton() {} // costruttore
public static Singleton getIstance() {
  synchronized(Singleton.class) {
      if( istance == null )
        istance = new Singleton();
      }
  
  
 return istance;

}
public void metodo(){
logger.info(nome);

}

}