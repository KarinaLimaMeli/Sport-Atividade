package com.example.sporte.service;

import com.example.sporte.model.Sport;

import com.example.sporte.repository.SportRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SportImp implements SportService {
        SportRepo sportRepo;  // questionar pq nao tem modificador de acesso


        @Override // pesquisar pq claase pediu para criar
        public List<Sport> getAllSport() {
        return null;


        public List<Sport> getAllSport() { //  Pensei em usar dto pq quero somente os dados de la
        List<Sport> SportRepoList = SportRepo.getAllSport();
    }



    }
}
