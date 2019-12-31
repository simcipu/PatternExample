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
public class VeicoloBuilder {

    public String id;
    public String cilindrata;
    public String matricola;
    public String caratterisitiche;
    public Integer posti;
    public String alimnetazione;
    public Veicolo.Uso uso;

    public VeicoloBuilder alimentazione(String alimnetazione) {
        this.alimnetazione = alimnetazione;
        return this;
    }

    public VeicoloBuilder cilindrata(String cilindrata) {
        this.cilindrata = cilindrata;
        return this;
    }

    public VeicoloBuilder posti(Integer posti) {
        this.posti = posti;
        return this;
    }

    public VeicoloBuilder uso(Veicolo.Uso uso) {
        this.uso = uso;
        return this;
    }

    public VeicoloBuilder matricola(String matricola) {
        this.matricola = matricola;
        return this;
    }

    public VeicoloBuilder caratteristiche(String caratterisitiche) {
        this.caratterisitiche = caratterisitiche;
        return this;
    }

    public VeicoloBuilder(String id) {
        this.id = id;
    }

    public static VeicoloBuilder newBuilder(String id) {
        return new VeicoloBuilder(id);
    }

    public Veicolo build() {

        return new Veicolo(id, cilindrata, matricola, caratterisitiche, posti, alimnetazione,uso);
    }
}
