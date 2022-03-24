package br.com.pamcary.service;

import br.com.pamcary.controller.dto.PersonResponseDTO;
import br.com.pamcary.dto.RequestPersonDTO;
import br.com.pamcary.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    Optional<PersonResponseDTO> create(RequestPersonDTO requestPersonDTO);
    Optional<PersonResponseDTO> findByCPF(String CPF);
    List<PersonResponseDTO> findAll();
    Optional<PersonResponseDTO> Update(RequestPersonDTO requestPersonDTO);
    void Delete();



}
