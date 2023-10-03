package com.perdidogs.PerdidogsBackend.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

@Schema(name = "bad-request-error-list-dto")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BadRequestErrorListDTO {
    @JsonProperty("errors")
    private List<String> errors;

    public BadRequestErrorListDTO() {
    }

    public BadRequestErrorListDTO(List<String> errors) {
        this.errors = errors;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

}
