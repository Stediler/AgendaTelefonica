package com.example.AgendaTelefonica.controller;

import com.example.AgendaTelefonica.contato.Contato;
import com.example.AgendaTelefonica.contato.ContatoResponseDTO;
import com.example.AgendaTelefonica.contato.ContatoRepository;
import com.example.AgendaTelefonica.contato.ContatoRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("contato")
public class ContatoController {

    @Autowired
    private ContatoRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveContato(@RequestBody ContatoRequestDTO data){
        Contato contatoData = new Contato(data);
        repository.save(contatoData);
        return;
    }
    @GetMapping
    public List<ContatoResponseDTO> getAll(){

        List<ContatoResponseDTO> contatoList = repository.findAll().stream().map(ContatoResponseDTO::new).toList();
        return contatoList;
    }
    @DeleteMapping("/{id}")
    public void deleteContato(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
