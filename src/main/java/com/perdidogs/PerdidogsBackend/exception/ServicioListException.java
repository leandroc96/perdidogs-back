package com.perdidogs.PerdidogsBackend.exception;


import com.perdidogs.PerdidogsBackend.model.dto.ErrorDTO;

public class ServicioListException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private ConflictErrorListDTO errores;


	public ServicioListException() {
	}

	public ServicioListException(String message) {
		super(message);
	}

	public ServicioListException(ConflictErrorListDTO errores) {
		this.errores = errores;
	}

	public ConflictErrorListDTO getErrores() {
		return errores;
	}

	public void setErrores(ConflictErrorListDTO errores) {
		this.errores = errores;
	}

	public void addError(String codigo, String mensaje) {
		if (errores == null)
			errores = new ConflictErrorListDTO();

		ErrorDTO e = new ErrorDTO(codigo, mensaje);
		errores.addError(e);
	}

	@Override
	public String toString() {
		return super.getMessage();
	}

}