package com.perdidogs.PerdidogsBackend.controller.advice;


import com.perdidogs.PerdidogsBackend.exception.ConflictErrorListDTO;
import com.perdidogs.PerdidogsBackend.exception.EntidadException;
import com.perdidogs.PerdidogsBackend.exception.ServicioListException;
import com.perdidogs.PerdidogsBackend.model.dto.EntidadExceptionListDTO;
import com.perdidogs.PerdidogsBackend.model.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;


@ControllerAdvice
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class PerdidogsControllerAdvice extends AbstractControllerAdvice {




    @ExceptionHandler(EntidadException.class)
    public ResponseEntity<ErrorDTO> servicioWSListException(EntidadException e) {
        //auditLoggerService.advicelogWarn(e.getErrores());
        ErrorDTO error = new ErrorDTO(e.getMessage());
        return new ResponseEntity<>(error, HttpStatus.CONFLICT);
    }



    @ExceptionHandler(ServicioListException.class)
    public ResponseEntity<ConflictErrorListDTO> servicioListException(ServicioListException e) {
        //auditLoggerService.advicelogWarn(e.getErrores());
        return new ResponseEntity<>(e.getErrores(), HttpStatus.CONFLICT);
    }
}