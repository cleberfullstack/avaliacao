package br.com.pamcary.service.impl;

import br.com.pamcary.controller.dto.PersonResponseDTO;
import br.com.pamcary.dto.RequestPersonDTO;
import br.com.pamcary.mapper.PersonMapper;
import br.com.pamcary.model.Person;
import br.com.pamcary.repository.PersonRepository;
import br.com.pamcary.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository repository;

    @Autowired
    private PersonMapper personMapper;

    @Override
    public Optional<PersonResponseDTO> create(RequestPersonDTO requestPersonDTO) {
        Person person = personMapper.toEntity(requestPersonDTO);
        Person result = repository.save(person);
        return Optional.of( personMapper.toDto(result)  );
    }

    @Override
    public Optional<PersonResponseDTO> findByCPF(String CPF) {
        Optional<Person> optionalPerson = repository.findByCpf(CPF);
            if(!optionalPerson.isPresent()) return Optional.empty();
            return Optional.of(personMapper.toDto(optionalPerson.get()));
    }

    @Override
    public List<PersonResponseDTO> findAll() {
        List<Person> result = repository.findAll();
        return result.stream()
                .map((x)-> personMapper.toDto(x))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<PersonResponseDTO> Update(RequestPersonDTO requestPersonDTO) {
        return Optional.empty();
    }

    @Override
    public void Delete() {

    }
}
