package com.perdidogs.PerdidogsBackend.model.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "perdidos")
public class PerdidosDTO {

    @Id
    @GeneratedValue
    private Integer id;

    private String nombre;

    private String descripcion;

    private String ubicacion;

    private String fecha_publicacion;

    private String visto_ultima_vez;

    public PerdidosDTO(Integer id, String nombre, String descripcion, String ubicacion, String fecha_publicacion, String visto_ultima_vez) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.fecha_publicacion = fecha_publicacion;
        this.visto_ultima_vez = visto_ultima_vez;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(String fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public String getVisto_ultima_vez() {
        return visto_ultima_vez;
    }

    public void setVisto_ultima_vez(String visto_ultima_vez) {
        this.visto_ultima_vez = visto_ultima_vez;
    }
}
