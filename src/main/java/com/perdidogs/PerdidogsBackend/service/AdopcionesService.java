package com.perdidogs.PerdidogsBackend.service;

import com.perdidogs.PerdidogsBackend.exception.EntidadException;
import com.perdidogs.PerdidogsBackend.exception.InternalServerException;
import com.perdidogs.PerdidogsBackend.exception.NoContentException;
import com.perdidogs.PerdidogsBackend.model.dto.AdopcionesDTO;
import com.perdidogs.PerdidogsBackend.model.response.ConsultaAdopcionesResponseDTO;
import com.perdidogs.PerdidogsBackend.repository.AdopcionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdopcionesService {

    @Autowired
    private AdopcionesRepository adopcionesRepository;

    public ConsultaAdopcionesResponseDTO listaAdopciones (){
        List<AdopcionesDTO> response = adopcionesRepository.findAll();
        if (response.isEmpty()){
            throw  new NoContentException("No se encontraron elementos en la lista de adopciones");
        }else{
            ConsultaAdopcionesResponseDTO responseDTO = new ConsultaAdopcionesResponseDTO(response);
            return responseDTO;
        }
    }

    public void altaAdopcion(AdopcionesDTO adopcionesDTO){
        try{
            adopcionesRepository.save(adopcionesDTO);
        }catch (Exception e){
            throw new EntidadException("No se pudo dar de alta la adopcion");
        }
    }

    public void modificacionAdopcion(int id,AdopcionesDTO request){
        try{
            Optional<AdopcionesDTO> respBE =adopcionesRepository.findById(id);

            if(respBE.isPresent()){
                AdopcionesDTO adopcionesDTO = respBE.get();
                adopcionesDTO.setDescripcion(request.getDescripcion());
                adopcionesDTO.setPublicadoPor(request.getPublicadoPor());
                adopcionesDTO.setFecha(request.getFecha());
                adopcionesDTO.setFoto(request.getFoto());
                adopcionesDTO.setContacto(request.getContacto());
                adopcionesRepository.save(adopcionesDTO);

            }else{
                throw new EntidadException("No se encontro la adopcion con id: "+request.getId());
            }
        }catch (Exception e){
            throw new InternalServerException(e.getMessage());
        }
    }

    public void bajaAdopcion(int id){
        try{
            if(adopcionesRepository.findById(id).isPresent()){
                adopcionesRepository.deleteById(id);
            }else{
                throw new EntidadException("No se encontro el objeto con id: "+id+" para realizar la baja");
            }
        }catch (Exception e){
            throw new InternalServerException(e.getMessage());
        }
    }

}
