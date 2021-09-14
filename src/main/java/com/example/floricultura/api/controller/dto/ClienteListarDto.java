package com.example.floricultura.api.controller.dto;

import com.example.floricultura.api.model.Cliente;

import java.util.List;
import java.util.stream.Collectors;

public class ClienteListarDto {

    private Long id;
    private String nome;
    private String telefone;
    private String endereco;

    public ClienteListarDto(Cliente cliente){

        this.id = cliente.getId();
        this.nome = cliente.getNome();
        this.telefone = cliente.getTelefone();
        this.endereco = cliente.getEndereco();

    }

    public static List<ClienteListarDto> converter(List<Cliente> cliente) {
        return cliente.stream().map(ClienteListarDto::new).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }
}
