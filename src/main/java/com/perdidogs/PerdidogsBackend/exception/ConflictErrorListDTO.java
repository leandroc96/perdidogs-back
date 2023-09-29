package com.perdidogs.PerdidogsBackend.exception;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.perdidogs.PerdidogsBackend.model.dto.ErrorDTO;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Schema(name = "conflict-error-list-dto")
public class ConflictErrorListDTO implements Serializable{

 
	private static final long serialVersionUID = -8966344697736839254L;
	
	@JsonProperty("errores")
	private List<ErrorDTO> errors;

	public List<ErrorDTO> getErrors() {
		return errors;
	}

	public void setErrors(List<ErrorDTO> errors) {
		this.errors = errors;
	}
	
	public void addError(ErrorDTO e) {
		 if (this.errors == null)
			 this.errors = new ArrayList<>();
		 
		 this.errors.add(e);
	}
}
