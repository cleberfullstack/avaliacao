package br.com.pamcary.mapper;

import br.com.pamcary.dto.RequestPersonDTO;
import br.com.pamcary.model.Person;

public class PersonMapper {
    public Person toEntity(RequestPersonDTO request){
        return Person.builder()
                .name(request.getName())
                .birth(request.getBirth())
                .cpf(request.getCpf())
                .build();
    }
}
