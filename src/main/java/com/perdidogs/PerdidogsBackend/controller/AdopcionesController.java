package com.perdidogs.PerdidogsBackend.controller;

import com.perdidogs.PerdidogsBackend.helper.JsonExamples;
import com.perdidogs.PerdidogsBackend.model.dto.AdopcionesDTO;
import com.perdidogs.PerdidogsBackend.model.dto.ErrorDTO;
import com.perdidogs.PerdidogsBackend.model.response.ConsultaAdopcionesResponseDTO;
import com.perdidogs.PerdidogsBackend.service.AdopcionesService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping(value = "/v1/adopciones", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Riesgo")
@Validated
public class AdopcionesController {

    @Autowired
    AdopcionesService adopcionesService;



    @Operation(summary = "Consulta de lista de adopciones")
    @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Success", content = {
            @Content(mediaType = "application/json", schema = @Schema(implementation = ConsultaAdopcionesResponseDTO.class), examples = @ExampleObject(name = "SUCCESS", value = JsonExamples.CONSULTA_LISTA_ADOPCIONES)) }),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDTO.class), examples = @ExampleObject(name = "BAD REQUEST", value = JsonExamples.CONSULTA_LISTA_ADOPCIONES_400)) }),
            @ApiResponse(responseCode = "409", description = "Conflict", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDTO.class), examples = @ExampleObject(name = "CONFLICT", value = JsonExamples.CONSULTA_LISTA_ADOPCIONES_409)) }) })
    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public ConsultaAdopcionesResponseDTO consultaListaAdopciones(
            @RequestParam("tipo_documento") @NotEmpty(message = "El campo 'tipo_documento' no deber ser vacío") String tipoDocumento,
            @RequestParam("numero_documento") @NotNull(message = "El campo 'numero_documento' no deber ser vacío") Long numeroDocumento) {
        return adopcionesService.listaAdopciones();

    }

    @Operation(summary = "Alta de adopcion")
    @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Success", content = {
            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDTO.class), examples = @ExampleObject(name = "CONFLICT", value = JsonExamples.ALTA_ADOPCION_409)) }) })
    @PostMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public void consultarSolicitudHistorica(@RequestBody AdopcionesDTO adopcionesDTO) {
         adopcionesService.altaAdopcion(adopcionesDTO);

    }

    @Operation(summary = "modificacion de adopcion")
    @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Success", content = {
            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDTO.class), examples = @ExampleObject(name = "CONFLICT", value = JsonExamples.MODIFICACION_ADOPCION_409)) }) })
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void consultarSolicitudHistorica(@PathVariable("id") int id, @RequestBody AdopcionesDTO adopcionesDTO) {
        adopcionesService.modificacionAdopcion(id, adopcionesDTO);

    }

    @Operation(summary = "Baja de adopcion")
    @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Success", content = {
            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDTO.class), examples = @ExampleObject(name = "CONFLICT", value = JsonExamples.BAJA_ADOPCION_409)) }) })
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void consultarSolicitudHistorica(@PathVariable("id") int id) {
        adopcionesService.bajaAdopcion(id);

    }

}
