package com.perdidogs.PerdidogsBackend.exception;

import com.perdidogs.PerdidogsBackend.model.dto.ErrorDTO;

public class ExceptionBuilder {

	private ConflictErrorListDTO errores=null;

	public ExceptionBuilder addConflictError(String codigo, String mensaje) {
		if (errores == null)
			errores = new ConflictErrorListDTO();

		ErrorDTO e = new ErrorDTO(codigo, mensaje);
		errores.addError(e);

		return this;
	}

	public void hasConflictError() {
		if (errores != null) {
			throw new ServicioListException(errores);
		}
	}
}
