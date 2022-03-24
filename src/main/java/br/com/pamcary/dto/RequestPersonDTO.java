package br.com.pamcary.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestPersonDTO {
    private String name;
    private String cpf;
    private LocalDateTime birth;
}
