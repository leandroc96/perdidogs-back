package com.perdidogs.PerdidogsBackend.exception;

import org.apache.commons.lang3.StringUtils;

public class EntidadException extends RuntimeException{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String codigo;

    public EntidadException(String message){
        super(message);
    }

    public EntidadException(String codigo, String message){
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
