package com.tonito.curriculumwebapp.Services;

import com.tonito.curriculumwebapp.Model.Curriculum;

import java.util.List;

public interface CurriculumService {
    List<Curriculum> getAllCV();
    Curriculum updatedCV (Curriculum curriculum);
    Curriculum getCvByName(String name);
}
