package com.example.floricultura.api.controller;

import com.example.floricultura.api.controller.dto.ClienteListarDto;
import com.example.floricultura.api.model.Cliente;
import com.example.floricultura.api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<ClienteListarDto> listar (Long id){

        List<Cliente> cliente =  clienteRepository.findAll();
        return ClienteListarDto.converter(cliente);

    }

}
