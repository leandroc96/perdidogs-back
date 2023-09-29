package com.perdidogs.PerdidogsBackend.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

@Schema(name = "error-dto")
public class ErrorDTO implements Serializable{

	private static final long serialVersionUID = 4271439068113803142L;

	@JsonProperty("codigo")
	@JsonInclude(JsonInclude.Include.NON_ABSENT)
    private String codigo;

    @JsonProperty("message")
    private String message;

    public ErrorDTO() {
    }

    public ErrorDTO(String message) {
        this.message = message;
    }

    public ErrorDTO(String codigo, String message) {
        this.codigo = codigo;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}

