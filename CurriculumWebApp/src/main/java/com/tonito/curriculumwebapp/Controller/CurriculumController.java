package com.tonito.curriculumwebapp.Controller;

import com.tonito.curriculumwebapp.Model.Curriculum;
import com.tonito.curriculumwebapp.Services.CurriculumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CurriculumController {
    @Autowired
    CurriculumService curriculumService;
    //--------------------------------Visualizar los CVs------------------------------------------------
    @GetMapping("/cvs")//Visualizar todos los CVS
    public ResponseEntity<List<Curriculum>> getAllCvs(){
        return ResponseEntity.ok().body(this.curriculumService.getAllCV());
    }
    @GetMapping("/cvs/{name}")//Visualizar CV Por nombre.
    public ResponseEntity<Curriculum> getCvByName(@PathVariable String name){
        return ResponseEntity.ok().body(this.curriculumService.getCvByName(name));
    }

    @PutMapping("/cvs/{id}")//Modificar un CV
    public ResponseEntity<Curriculum> updatedCV (@PathVariable long id, @RequestBody Curriculum curriculum){
        curriculum.setCvid(id);
        return ResponseEntity.ok().body(this.curriculumService.updatedCV(curriculum));
    }



}
