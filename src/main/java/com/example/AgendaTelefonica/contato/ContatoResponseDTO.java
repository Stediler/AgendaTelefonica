package com.example.AgendaTelefonica.contato;

public record ContatoResponseDTO(Long id, String nome, Integer numero, Boolean whatsapp) {

    public ContatoResponseDTO(Contato contato) {
        this(contato.getId(), contato.getNome(), contato.getNumero(), contato.getWhatsapp());
    }
}
