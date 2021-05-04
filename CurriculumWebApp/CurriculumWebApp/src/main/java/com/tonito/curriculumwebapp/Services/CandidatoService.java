package com.tonito.curriculumwebapp.Services;

import com.tonito.curriculumwebapp.Model.Candidato;

import java.util.List;

public interface CandidatoService {
    Candidato createCandidato(Candidato candidato);
    List<Candidato> getAllCandidato();
    Candidato getCandidatoByID(long id);
    void deleteCandidato(long id);
}
