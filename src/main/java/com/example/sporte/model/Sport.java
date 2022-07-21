package com.example.sporte.model;

// criei essa classe com a intencao de definir o modelo que sera usado pelas outras classes

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sport {

    public String nome;
    public String nivel;


    //criei para dar acesso aos dados do arquivo json /modelar
    public String toString() {
        return "Client{" +
                ", nome='" + nome + '\'' +
                ", nivel='" + nivel + '\'' +
                '}';

    }

}