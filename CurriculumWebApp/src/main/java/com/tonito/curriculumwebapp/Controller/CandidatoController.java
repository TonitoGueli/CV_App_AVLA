package com.tonito.curriculumwebapp.Controller;
import com.tonito.curriculumwebapp.Model.Candidato;
import com.tonito.curriculumwebapp.Services.CandidatoService;
import com.tonito.curriculumwebapp.Services.CurriculumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CandidatoController {

    @Autowired
    private CandidatoService candidatoService;

    @Autowired
    private CurriculumService curriculumService;

    //--------------------------------Visualizar los candidatos------------------------------------------------
    @GetMapping("/candidato")//Visualizar todos los candidatoe
    public ResponseEntity<List<Candidato>> getAllCandidato(){
        return ResponseEntity.ok().body(this.candidatoService.getAllCandidato());
    }

    @GetMapping("/candidato/{id}")//Visualizar un candidato por id
    public ResponseEntity<Candidato> getCandidatoByID(@PathVariable long id){
        return ResponseEntity.ok().body(this.candidatoService.getCandidatoByID(id));
    }

    //--------------------------------Crear candidatos------------------------------------------------
    @PostMapping("/new_candidato")//crear un candidato
    public ResponseEntity<Candidato> createCandidato(@RequestBody Candidato candidato){
        return ResponseEntity.ok().body(this.candidatoService.createCandidato(candidato));
    }

    //--------------------------------Eliminar candidatos------------------------------------------------
    @DeleteMapping("/candidato/{id}")//Eliminar candidato por id
    public HttpStatus deleteCandidato(@PathVariable long id){
        this.candidatoService.deleteCandidato(id);
        return HttpStatus.OK;
    }
}
