package com.perdidogs.PerdidogsBackend.model.response;

import com.perdidogs.PerdidogsBackend.model.dto.AdopcionesDTO;

import java.util.List;

public class ConsultaAdopcionesResponseDTO {

    List<AdopcionesDTO> adopcionesDTOList;

    public ConsultaAdopcionesResponseDTO(List<AdopcionesDTO> adopcionesDTOList) {
        this.adopcionesDTOList = adopcionesDTOList;
    }

    public List<AdopcionesDTO> getAdopcionesDTOList() {
        return adopcionesDTOList;
    }

    public void setAdopcionesDTOList(List<AdopcionesDTO> adopcionesDTOList) {
        this.adopcionesDTOList = adopcionesDTOList;
    }
}
