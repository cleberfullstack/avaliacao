package br.com.pamcary.service.impl;

import br.com.pamcary.dto.RequestPersonDTO;
import br.com.pamcary.model.Person;
import br.com.pamcary.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {
    @Override
    public Optional<Person> create(RequestPersonDTO requestPersonDTO) {


        return Optional.empty();
    }

    @Override
    public Optional<Person> findByCPF(String CPF) {
        return Optional.empty();
    }

    @Override
    public List<Person> findAll() {
        return null;
    }

    @Override
    public Optional<Person> Update(RequestPersonDTO requestPersonDTO) {
        return Optional.empty();
    }

    @Override
    public void Delete() {

    }
}
