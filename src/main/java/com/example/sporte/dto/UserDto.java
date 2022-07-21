package com.example.sporte.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



// ele serve para mostrar apenas o que o usuario pode visualizar

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    String nome;
    String sobrenome;
    String esporte;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }
}

