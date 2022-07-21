package com.example.sporte.service;

import com.example.sporte.dto.UserDto;
import com.example.sporte.model.Pessoas;
import com.example.sporte.model.Sport;
import org.springframework.stereotype.Service;

import java.util.List;


 //é o meu contrado ou seja vai "obrigar a ter esses metodos"

@Service
public interface PessoasService {


    List<Sport> getAllSport();
    List<UserDto> getAllUser();
    List<Pessoas> getAllPessoas();


}
