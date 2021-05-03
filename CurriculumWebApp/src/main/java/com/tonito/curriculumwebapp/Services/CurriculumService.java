package com.tonito.curriculumwebapp.Services;

import com.tonito.curriculumwebapp.Model.Curriculum;

import java.util.List;

public interface CurriculumService {
    Curriculum createCV(Curriculum curriculum);
    List<Curriculum> getAllCV();
    Curriculum getCvByID (long id);
}
