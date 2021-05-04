package com.tonito.curriculumwebapp.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "fono")
    private String telefono;

    @Column(name = "certificaciones")
    private String certificaciones;

    @Column(name = "experiencias")
    private String cvexperiencia;

    @Column(name = "javaLevel")
    private Integer javaLevel;

    @Column (name = "angularLevel")
    private Integer angularLevel;

    @Column(name = "pythonLevel")
    private Integer pythonLevel;

    @Column(name = "intro")
    private String cartaIntro;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_candidato")
    private Candidato candidato;


    public Curriculum(){

    }

    public String getCartaIntro() {
        return cartaIntro;
    }

    public void setCartaIntro(String cartaIntro) {
        this.cartaIntro = cartaIntro;
    }


    public Integer getJavaLevel() {
        return javaLevel;
    }

    public void setJavaLevel(Integer javaLevel) {
        this.javaLevel = javaLevel;
    }

    public Integer getAngularLevel() {
        return angularLevel;
    }

    public void setAngularLevel(Integer angularLevel) {
        this.angularLevel = angularLevel;
    }

    public Integer getPythonLevel() {
        return pythonLevel;
    }

    public void setPythonLevel(Integer pythonLevel) {
        this.pythonLevel = pythonLevel;
    }

    public void setCvid(long cvid) {
        this.cvid = cvid;
    }

    public long getCvid() {
        return cvid;
    }

    public String getCvemail() {
        return cvemail;
    }

    public void setCvemail(String cvemail) {
        this.cvemail = cvemail;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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

    public String getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
    }

    public String getCvexperiencia() {
        return cvexperiencia;
    }

    public void setCvexperiencia(String cvexperiencia) {
        this.cvexperiencia = cvexperiencia;
    }
}
