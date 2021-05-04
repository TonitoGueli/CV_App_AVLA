package com.tonito.curriculumwebapp.Repository;

import com.tonito.curriculumwebapp.Model.Curriculum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurriculumRepository extends JpaRepository<Curriculum, Long>{
    Curriculum getCurriculumByCvname (String name);
}
