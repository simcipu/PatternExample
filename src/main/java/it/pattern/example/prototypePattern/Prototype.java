/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.pattern.example.prototypePattern;

import java.util.List;

/**
 *
 * @author Utente
 */
public abstract class Prototype implements Cloneable{
    
       @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
    public abstract void add(Object key, Object value);
 

    
    public abstract Object getList(String key);
    
}
