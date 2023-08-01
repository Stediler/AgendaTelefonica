package com.example.AgendaTelefonica.contato;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "contato")
@Entity(name = "contato")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Contato {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer numero;
    private Boolean whatsapp;

    public Contato(ContatoRequestDTO data) {
        this.nome = data.nome();
        this.numero = data.numero();
        this.whatsapp = data.whatsapp();
    }
}
