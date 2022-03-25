package br.com.pamcary.controller.operations;

import br.com.pamcary.controller.dto.PersonResponseDTO;
import br.com.pamcary.dto.RequestPersonDTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import io.swagger.annotations.Api;

@Api(value = "Api for performing operations on Person")
public interface PersonOperation {

    @ApiOperation(value = "Get All person")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "OK"),
                    @ApiResponse(code = 400, message = "BadRequest"),
                    @ApiResponse(code = 401, message = "Unauthorized"),
                    @ApiResponse(code = 403, message = "Forbidden"),
                    @ApiResponse(code = 404, message = "Not Found"),
                    @ApiResponse(code = 500, message = "Internal Server Error")
            }
    )
    @GetMapping
    ResponseEntity<List<PersonResponseDTO>> getAll();

    @ApiOperation(value = "Get person by CPF")
    @GetMapping(path = "/{cpf}")
    ResponseEntity<PersonResponseDTO> findByCpf(@PathVariable String cpf);

    @ApiOperation(value = "Create a new person")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    ResponseEntity<?> create(@RequestBody RequestPersonDTO requestPersonDTO);

    @ApiOperation(value = "Change a person")
    @ResponseStatus(HttpStatus.OK)
    @PutMapping
    ResponseEntity<?> update(@RequestParam(name = "person_id") long id,@RequestBody RequestPersonDTO requestPersonDTO);

    @ApiOperation(value = "Delete a person")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 204, message = "No Content"),
                    @ApiResponse(code = 400, message = "BadRequest"),
                    @ApiResponse(code = 401, message = "Unauthorized"),
                    @ApiResponse(code = 403, message = "Forbidden"),
                    @ApiResponse(code = 404, message = "Not Found"),
                    @ApiResponse(code = 500, message = "Internal Server Error")
            }
    )
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping
    ResponseEntity<?> delete(@RequestParam(name = "person_id") long id);




}
