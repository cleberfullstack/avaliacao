package br.com.pamcary.service;

import br.com.pamcary.dto.RequestPersonDTO;
import br.com.pamcary.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    Optional<Person> create(RequestPersonDTO requestPersonDTO);
    Optional<Person> findByCPF(String CPF);
    List<Person> findAll();
    Optional<Person> Update(RequestPersonDTO requestPersonDTO);
    void Delete();



}
