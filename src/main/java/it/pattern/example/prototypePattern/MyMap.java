/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.pattern.example.prototypePattern;

import java.util.LinkedHashMap;

/**
 *
 * @author Utente
 */
public class MyMap extends Prototype{

  private LinkedHashMap map = new LinkedHashMap();
 
    @Override
    public Object clone() throws CloneNotSupportedException{
        return (MyMap) super.clone();
    }
 
    @Override
    public void add(Object key, Object value) {
        map.put(key, value);
    }
 


    @Override
    public Object getObj(String key) {
    
       return map.get(key);
    }
}
