package com.perdidogs.PerdidogsBackend.exception;

import org.apache.commons.lang3.StringUtils;

public class ServicioWSException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	private String code;


	public ServicioWSException(String message) {
		super(message);
	}

	public ServicioWSException(String code, String message) {
		super(message);
		this.setCode(code);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		if (StringUtils.isNotEmpty(code)) {
			return code + " - " + super.getMessage();
		} else {
			return super.getMessage();
		}
	}
}