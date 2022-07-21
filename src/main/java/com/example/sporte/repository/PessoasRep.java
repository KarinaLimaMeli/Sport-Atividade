package com.example.sporte.repository;

import com.example.sporte.dto.UserDto;
import com.example.sporte.model.Pessoas;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.Arrays;
import java.util.List;

// criei o repository para passar informacoes para controller
@Repository
@Component
public class PessoasRep {

  // criei o repository para passar informacoes para controller
  public final String linkFile = "src/main/resources/dados.json";



    //estou criando um metodo que le a minha lista e retorna
    public List<UserDto> getAllUserDto() {
        ObjectMapper mapper = new ObjectMapper();
        List<UserDto> lista = null;
        try { // esse tratamento eu criei para converte vetor em array
           lista = Arrays.asList
                    (mapper.readValue(new File(linkFile), UserDto[].class));

        } catch (Exception ex) {
        }
            return lista;
    }


    public List<Pessoas> getAllPessoas() {
        return  null;
    }
}

