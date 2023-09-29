package com.perdidogs.PerdidogsBackend.exception;

import ar.com.comafi.arch.dto.ConflictErrorListDTO;
import ar.com.comafi.arch.dto.ErrorDTO;

public class ServicioWSListException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	private ConflictErrorListDTO errores;
	
	
	public ServicioWSListException() {
	}

	public ServicioWSListException(String message) {
		super(message);
	}

	
	public void addError(String codigo, String mensaje) {
		if (errores == null)
			errores = new ConflictErrorListDTO();
		
		ErrorDTO e = new ErrorDTO(codigo, mensaje); 
		errores.addError(e);
	}
	
	public ServicioWSListException(ConflictErrorListDTO errores) {
		this.errores = errores; 
	}

	public ConflictErrorListDTO getErrores() {
		return errores;
	}

	public void setErrores(ConflictErrorListDTO errores) {
		this.errores = errores;
	}

	@Override
	public String toString() {
		return super.getMessage();
	}

}