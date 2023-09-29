package com.perdidogs.PerdidogsBackend.exception;

import org.apache.commons.lang3.StringUtils;

public class NoContentException extends RuntimeException{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4578541727818333531L;
	
	private String codigo;

	public NoContentException(String message) {
		super(message);
	}
	
	public NoContentException(String codigo, String message) {
        super(message);
        this.codigo = codigo;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		if (StringUtils.isNotEmpty(codigo)) {
			return codigo + " - " + super.getMessage();
		} else {
			return super.getMessage();
		}
	}
}
