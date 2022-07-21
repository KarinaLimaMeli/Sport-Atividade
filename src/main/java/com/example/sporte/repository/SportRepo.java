package com.example.sporte.repository;


import com.example.sporte.model.Sport;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.Arrays;
import java.util.List;

// questionar se tem a possibildade de fazer pessoas e sport em um lugar so

//// criei o repository para passar informacoes para controller

@Repository
@Component
public class SportRepo {

    // criei para passar o caminho para que a minha requisicao possa acessar
    public static final String linkFile = "src/main/resources/sport.json";


    // REAVALIAR
    public Sport getAllSport(String nome, String nivel) {
        return new Sport("Futebol", "2");
    }


   //estou criando um metodo que le a minha lista e retorna
    public static List<Sport> getAllSport() {
        ObjectMapper mapper = new ObjectMapper();
        List<Sport> lista = null;
        try {// esse tratamento eu criei para converte vetor em array
            lista = Arrays.asList
                    (mapper.readValue(new File(linkFile), Sport[].class));

        } catch (Exception ex) {
        }
        return lista;
    }
}
