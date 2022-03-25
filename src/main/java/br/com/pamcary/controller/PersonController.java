package br.com.pamcary.controller;

import br.com.pamcary.controller.dto.PersonResponseDTO;
import br.com.pamcary.controller.operations.PersonOperation;
import br.com.pamcary.dto.RequestPersonDTO;
import br.com.pamcary.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/persons")
public class PersonController implements PersonOperation {

    @Autowired
    private PersonService personService;

    @Override
    public ResponseEntity<List<PersonResponseDTO>> getAll() {

      List<PersonResponseDTO> response =  personService.findAll();

      return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<PersonResponseDTO> findByCpf(String cpf) {

        Optional<PersonResponseDTO> optionalPersonResponseDTO = personService.findByCPF(cpf);

        if(!optionalPersonResponseDTO.isPresent()){
            return ResponseEntity.ok(null);
        }

        return ResponseEntity.ok(optionalPersonResponseDTO.get());
    }

    @Override
    public ResponseEntity<?> create(RequestPersonDTO requestPersonDTO) {
        Optional<PersonResponseDTO> optionalPersonResponseDTO = personService.create(requestPersonDTO);

        if(!optionalPersonResponseDTO.isPresent()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.created(URI.create("/persons/"+ requestPersonDTO.getCpf())).build();
    }

    @Override
    public ResponseEntity<?> update(long id, RequestPersonDTO requestPersonDTO) {
        return null;
    }

    @Override
    public ResponseEntity<?> delete(long id) {

       boolean result = personService.Delete(id);

       if(result == true){
           return ResponseEntity.noContent().build();
       }
        return ResponseEntity.notFound().build();
    }
}
