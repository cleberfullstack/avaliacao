package br.com.pamcary.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonResponseDTO {
    private long Id;
    private String name;
    private String cpf;
    private LocalDateTime birth;
}
