package br.com.pamcary.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "PESSO_FISICA")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO")
    private long Id;
    @Column(name = "NOME")
    private String name;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "DATA_NASCIMENTO")
    private LocalDateTime birth;
}
