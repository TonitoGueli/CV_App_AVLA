package com.tonito.curriculumwebapp.Services;

import com.tonito.curriculumwebapp.Model.Curriculum;
import com.tonito.curriculumwebapp.Repository.CurriculumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CurriculumServiceImp implements CurriculumService{

    @Autowired
    CurriculumRepository curriculumRepository;

    @Override
    public Curriculum createCV(Curriculum curriculum) {
        return curriculumRepository.save(curriculum);
    }

    @Override
    public List<Curriculum> getAllCV() {
        return curriculumRepository.findAll();
    }

    @Override
    public Curriculum getCvByID(long id) {
        return null;
    }
}
