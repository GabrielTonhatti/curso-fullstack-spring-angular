package com.algaworks.algamoney.api.model;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class Endereco {

    private String cep;
    private String bairro;
    private String numero;
    private String cidade;
    private String estado;
    private String logradouro;
    private String complemento;

}
