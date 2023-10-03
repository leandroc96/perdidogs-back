package com.perdidogs.PerdidogsBackend.controller.advice;

import com.perdidogs.PerdidogsBackend.exception.InternalServerException;
import com.perdidogs.PerdidogsBackend.exception.NoContentException;
import com.perdidogs.PerdidogsBackend.exception.ValidationException;
import com.perdidogs.PerdidogsBackend.model.dto.BadRequestErrorListDTO;
import com.perdidogs.PerdidogsBackend.model.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractControllerAdvice extends ResponseEntityExceptionHandler {

    public static final String genericErrorMessage = "Hubo un error al intentar procesar el request";


    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<BadRequestErrorListDTO> validationException(ValidationException e) {
        List<String> errors = new ArrayList<>();
        errors.add(e.getMessage());
        BadRequestErrorListDTO badRequestErrorList = new BadRequestErrorListDTO(errors);

        //auditLoggerService.advicelogWarn(e.getClass().getSimpleName() + " - " + e.getMessage());
        return new ResponseEntity<>(badRequestErrorList, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ErrorDTO> handle(ConstraintViolationException exception) {
        String msg = exception.getConstraintViolations().stream().findFirst().get().getMessageTemplate();
        ErrorDTO error = new ErrorDTO(msg);

        //auditLoggerService.advicelogWarnAndRequest(error);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InternalServerException.class)
    public ResponseEntity<ErrorDTO> as400Exception(InternalServerException e) {
        ErrorDTO errorDTO = new ErrorDTO(e.getCodigo(), e.getMessage());
        //auditLoggerService.advicelogError(errorDTO);
        return new ResponseEntity<>(new ErrorDTO("Hubo un error al intentar procesar el request"),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NoContentException.class)
    public ResponseEntity<ErrorDTO> noContentException(NoContentException e) {
        String msg = e.getMessage();
        ErrorDTO error = new ErrorDTO(msg);
        //auditLoggerService.advicelogWarn(error);
        return new ResponseEntity<>(error, HttpStatus.NO_CONTENT);
    }

}
