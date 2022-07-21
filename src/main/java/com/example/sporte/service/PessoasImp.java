package com.example.sporte.service;

import com.example.sporte.dto.UserDto;
import com.example.sporte.model.Pessoas;
import com.example.sporte.model.Sport;
import com.example.sporte.repository.PessoasRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//service v ai conter a minha logica, a regra que o meu produto deve seguir

@Service
public class PessoasImp implements PessoasService {

    @Autowired
    public PessoasRep pessoasRep;

    @Override
    public List<Sport> getAllSport() {
        return null;
    }

    @Override
    public List<UserDto> getAllUser() {
        return null;
    }

    @Override
    public List<Pessoas> getAllPessoas() {
        return null;


    //aqui quero retorna uma lista com dados que o exercicio perde
      public List<Pessoas> getAllPessoas ;{        //  Pensei em usar dto pq quero somente os dados de la
      return pessoasRep.getAllPessoas();

    }


    }
}
