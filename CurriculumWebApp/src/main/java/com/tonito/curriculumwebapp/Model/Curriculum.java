package com.tonito.curriculumwebapp.Model;

import javax.persistence.*;

@Entity
@Table(name = "CVs")
public class Curriculum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cvid")
    private long cvid;

    @Column (name = "cvemail")
    private String cvemail;

    @Column(name = "name")
    private String cvname;

    @Column(name = "carrera")
    private String cvcarrera;

    @Column(name = "experiencia")
    private String cvexperiencia;


    public long getCvid() {
        return cvid;
    }

    public String getCvemail() {
        return cvemail;
    }

    public void setCvemail(String cvemail) {
        this.cvemail = cvemail;
    }

    public String getCvname() {
        return cvname;
    }

    public void setCvname(String cvname) {
        this.cvname = cvname;
    }

    public String getCvcarrera() {
        return cvcarrera;
    }

    public void setCvcarrera(String cvcarrera) {
        this.cvcarrera = cvcarrera;
    }

    public String getCvexperiencia() {
        return cvexperiencia;
    }

    public void setCvexperiencia(String cvexperiencia) {
        this.cvexperiencia = cvexperiencia;
    }
}
