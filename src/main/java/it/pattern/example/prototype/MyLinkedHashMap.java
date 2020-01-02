/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.pattern.example.prototype;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 *
 * @author Utente
 */
public class MyLinkedHashMap extends Prototype{

  private LinkedHashMap hash = new LinkedHashMap();
 
    @Override
    public Object clone() throws CloneNotSupportedException{
        return (MyLinkedHashMap) super.clone();
    }
 
    @Override
    public void addItem(Object key, Object value) {
        hash.put(key, value);
    }
 
    @Override
    public int getSize() {
        return hash.size();
    }

    @Override
    public Object getList(String key) {
    
       return hash.get(key);
    }
}
