/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.pattern.example.jobs;

import it.pattern.example.builderPattern.Veicolo;
import it.pattern.example.builderPattern.VeicoloBuilder;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author Utente
 */
@Component
public class BuilderPattern {

    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(BuilderPattern.class);

    @Scheduled(fixedRate = 6000)
    public void LoggoPattern() {
        logger.info("****************************************************");
        logger.info("BUILDER METHOD");

        Veicolo vec1 = VeicoloBuilder.newBuilder("00001").
                matricola("0034").
                alimentazione("benziana").
                caratteristiche("dc9/intercontinentale").
                uso(Veicolo.Uso.AEREO).
                posti(100).
                cilindrata("3000").
                build();

        VeicoloBuilder veicoloBuilder = VeicoloBuilder.newBuilder("00001").
                matricola("0035").
                alimentazione("disel").
                caratteristiche("ford 2000").
                uso(Veicolo.Uso.TERRESTRE).
                posti(5).
                cilindrata("1200");

        Veicolo vec2 = veicoloBuilder.build();
        Veicolo vec3 = veicoloBuilder.build();
        Veicolo vec4 = veicoloBuilder.uso(Veicolo.Uso.AQUATICO).build();

        logger.info(vec2.toString());
        logger.info(vec3.toString());
        logger.info(vec4.toString());
        logger.info(vec1.toString());

        logger.info("****************************************************");

    }
}
