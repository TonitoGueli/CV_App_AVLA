package com.tonito.curriculumwebapp.Repository;

import com.tonito.curriculumwebapp.Model.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoRepository extends JpaRepository<Candidato, Long> {
    //JPA Repository trae todos los métodos CRUD necesarios para la aplicación.
}
