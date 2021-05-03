package com.tonito.curriculumwebapp.Services;

import com.tonito.curriculumwebapp.Exceptions.CustomResourceNotFound;
import com.tonito.curriculumwebapp.Model.Candidato;
import com.tonito.curriculumwebapp.Model.Curriculum;
import com.tonito.curriculumwebapp.Repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CandidatoServiceImp implements CandidatoService{

    @Autowired
    private CandidatoRepository candidatoRepository;


    @Override
    public Candidato createCandidato(Candidato candidato){
        Curriculum curriculumAUX = new Curriculum();
        curriculumAUX.setCvemail(candidato.getEmail());
        candidato.setCurriculum(curriculumAUX);
        return candidatoRepository.save(candidato);

    }

    @Override
    public List<Candidato> getAllCandidato(){
        return candidatoRepository.findAll();
    }

    @Override
    public Candidato getCandidatoByID(long id){
        Optional<Candidato> CandidatoDataBase = this.candidatoRepository.findById(id);
        if(CandidatoDataBase.isPresent()){
            return CandidatoDataBase.get(); //Retorno del candidato
        }else{
            throw new CustomResourceNotFound("No se encontró el id");
        }
    }

    @Override
    public void deleteCandidato(long id){
        Optional<Candidato> CandidatoForDelete = this.candidatoRepository.findById(id);
        if(CandidatoForDelete.isPresent()){
            this.candidatoRepository.delete(CandidatoForDelete.get());
        }else{
            throw new CustomResourceNotFound("El id no existe. No se eliminaron registros");
        }
    }

}
