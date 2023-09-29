package com.perdidogs.PerdidogsBackend.model.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adopciones")
public class AdopcionesDTO {

    @Id
    @GeneratedValue
    private Integer id;

    private String descripcion;

    private String publicadoPor;

    private String fecha;

    private String foto;

    private String contacto;

    public AdopcionesDTO(Integer id, String descripcion, String publicadoPor, String fecha, String foto, String contacto) {
        this.id = id;
        this.descripcion = descripcion;
        this.publicadoPor = publicadoPor;
        this.fecha = fecha;
        this.foto = foto;
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

    public String getPublicadoPor() {
        return publicadoPor;
    }

    public void setPublicadoPor(String publicadoPor) {
        this.publicadoPor = publicadoPor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
}
