package com.example.sporte.controller;


import com.example.sporte.dto.UserDto;
import com.example.sporte.model.Pessoas;
import com.example.sporte.model.Sport;
import com.example.sporte.repository.SportRepo;
import com.example.sporte.service.PessoasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


    @RestController // auxilia no transito de informacao
    @RequestMapping(" /informacoes") //indica que "/informacoes" é usada para acionar este controller
     public class User {
    @Autowired
    public PessoasService pessoasService; // para se comunicar com service


        // Este metodo indica que eu estou solicitando uma informacao
        @GetMapping("/{nome}")
        public ResponseEntity<List<Pessoas>> getAllPessoas() {
           List<Pessoas> lista = Pessoas.getAllPessoas();
            return (ResponseEntity<List<Pessoas>>) lista;

        }
        SportRepo spt;
       @GetMapping("/{Sport}")
        public ResponseEntity<List<Sport>> getAllSport () {
           List<Sport> lista = spt.getAllSport();
            return ResponseEntity.ok(lista);

        }
            //falta criar mais um metodo  verificar esporte e nivel

        @GetMapping("/")
        public ResponseEntity<List<UserDto>> getAllUser(){
            List<UserDto> lista = pessoasService.getAllUser();
            return  ResponseEntity.ok(lista);

        }



        }





















