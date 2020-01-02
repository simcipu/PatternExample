/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.pattern.example.factoryMethodPattern;

/**
 *
 * @author Utente
 */
public class VeicoloFactory {
    public VeicoloFactory (){}
    
        public Veicolo getVeicolo (VeicoloEnum type){
        Veicolo retval = null;
        switch (type){
            case Moto:
                retval = new Moto();
                break;
            case AutoMobile:
                retval = new Macchina();
                break;
        }
        return retval;
    }
}
