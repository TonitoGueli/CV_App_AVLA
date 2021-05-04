package com.tonito.curriculumwebapp.Services;

import com.tonito.curriculumwebapp.Exceptions.CustomResourceNotFound;
import com.tonito.curriculumwebapp.Model.Curriculum;
import com.tonito.curriculumwebapp.Repository.CurriculumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CurriculumServiceImp implements CurriculumService{

    @Autowired
    CurriculumRepository curriculumRepository;

    @Override
    public List<Curriculum> getAllCV() {
        return curriculumRepository.findAll();
    }

    @Override
    public Curriculum updatedCV(Curriculum curriculum) {
        Optional<Curriculum> cvDB = this.curriculumRepository.findById(curriculum.getCvid());
        if (cvDB.isPresent()){
            Curriculum curriculumUpdated = cvDB.get();
            curriculumUpdated.setCvcarrera(curriculum.getCvcarrera());
            curriculumUpdated.setCvname(curriculum.getCvname());
            curriculumUpdated.setEdad(curriculum.getEdad());
            curriculumUpdated.setTelefono(curriculum.getTelefono());
            curriculumUpdated.setCertificaciones(curriculum.getCertificaciones().toString());
            curriculumUpdated.setCvexperiencia(curriculum.getCvexperiencia().toString());
            curriculumUpdated.setJavaLevel(curriculum.getJavaLevel());
            curriculumUpdated.setAngularLevel(curriculum.getAngularLevel());
            curriculumUpdated.setPythonLevel(curriculum.getPythonLevel());
            curriculumUpdated.setCartaIntro(curriculum.getCartaIntro());
            curriculumRepository.save(curriculumUpdated);
            return curriculumUpdated;
        }else{
            throw new CustomResourceNotFound("No se encontró nah. Id del CV:" + curriculum.getCvid());
        }
    }

    @Override
    public Curriculum getCvByName(String name) {
        return curriculumRepository.getCurriculumByCvname(name);
    }


}
