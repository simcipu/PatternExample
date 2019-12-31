/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.pattern.example.builderPattern;

/**
 *
 * @author Utente
 */
public class Veicolo {
    
         public enum Uso{
        TERRESTRE,
        AQUATICO,
        AEREO
    }
    
    
    public String id;
    public String cilindrata;
    public String matricola;
    public String caratterisitiche;
    public Integer posti;
    public String alimnetazione;
    public Uso uso;

    public Veicolo(String id) {
        this.id = id;
    }

    public Veicolo(String id, String cilindrata, String matricola, String caratterisitiche) {
        this.id = id;
        this.cilindrata = cilindrata;
        this.matricola = matricola;
        this.caratterisitiche = caratterisitiche;
    }

    public Veicolo(String id, String cilindrata, String matricola, Uso uso) {
        this.id = id;
        this.cilindrata = cilindrata;
        this.matricola = matricola;
        this.uso = uso;
    }

    public Veicolo(String id, String cilindrata, String matricola, String caratterisitiche, Integer posti, String alimnetazione, Uso uso) {
        this.id = id;
        this.cilindrata = cilindrata;
        this.matricola = matricola;
        this.caratterisitiche = caratterisitiche;
        this.posti = posti;
        this.alimnetazione = alimnetazione;
        this.uso = uso;
    }


    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(String cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getCaratterisitiche() {
        return caratterisitiche;
    }

    public void setCaratterisitiche(String caratterisitiche) {
        this.caratterisitiche = caratterisitiche;
    }

    public Integer getPosti() {
        return posti;
    }

    public void setPosti(Integer posti) {
        this.posti = posti;
    }

    public String getAlimnetazione() {
        return alimnetazione;
    }

    public void setAlimnetazione(String alimnetazione) {
        this.alimnetazione = alimnetazione;
    }

    public Uso getUso() {
        return uso;
    }

    public void setUso(Uso uso) {
        this.uso = uso;
    }

    @Override
    public String toString() {
        return "Veicolo{" + "id=" + id + ", cilindrata=" + cilindrata + ", matricola=" + matricola + ", caratterisitiche=" + caratterisitiche + ", posti=" + posti + ", alimnetazione=" + alimnetazione + ", uso=" + uso + '}';
    }


    
}
