package com.tonito.curriculumwebapp.Repository;

import com.tonito.curriculumwebapp.Model.Curriculum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurriculumRepository extends JpaRepository<Curriculum, Long>{
    //JPA Repository trae todos los métodos CRUD necesarios para la aplicación.
}
