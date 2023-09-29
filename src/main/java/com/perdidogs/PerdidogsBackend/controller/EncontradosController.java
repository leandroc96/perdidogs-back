package com.perdidogs.PerdidogsBackend.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "encontrados")
public class EncontradosController {

    @Id
    @GeneratedValue
    private Integer id;

    private String descripcion;

    private String encontradoEn;

    private String contacto;

    public EncontradosController(Integer id, String descripcion, String encontradoEn, String contacto) {
        this.id = id;
        this.descripcion = descripcion;
        this.encontradoEn = encontradoEn;
        this.contacto = contacto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEncontradoEn() {
        return encontradoEn;
    }

    public void setEncontradoEn(String encontradoEn) {
        this.encontradoEn = encontradoEn;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
}
