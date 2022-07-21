package com.example.sporte.model;

// criei essa classe com a intencao de definir o modelo que sera usado pelas outras classes


import com.example.sporte.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EntityScan
public class Pessoas {

    public String nome;
    public String sobrenome;
    public String sport;
    public int idade;

    public static List<Pessoas> getAllPessoas() {
        return null;
    }


    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getSport() {
        return sport;
    }

    public int getIdade() {
        return idade;
    }

    //criei para dar acesso aos dados do arquivo json - modelar
    @Override
    public String toString() {
        return "Pessoas{" +
                ", nome='" + nome + '\'' +
                ", sobronome='" + sobrenome + '\'' +
                ", sport='" + sport + '\'' +
                '}';

    }

}

