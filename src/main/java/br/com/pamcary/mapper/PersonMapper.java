package br.com.pamcary.mapper;

import br.com.pamcary.controller.dto.PersonResponseDTO;
import br.com.pamcary.dto.RequestPersonDTO;
import br.com.pamcary.model.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {
    public Person toEntity(RequestPersonDTO request){
        return Person.builder()
                .name(request.getName())
                .birth(request.getBirth())
                .cpf(request.getCpf())
                .build();
    }

    public PersonResponseDTO toDto(Person person){
        return PersonResponseDTO.builder()
                .Id(person.getId())
                .birth(person.getBirth())
                .cpf(person.getCpf())
                .name(person.getName())
                .build();
    }

}
