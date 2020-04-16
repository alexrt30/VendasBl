/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author alexd
 */
public class ModelCliente {
    private int idCliente;
    private String cliNome;
    private String cliEndereco;
    private String cliBairro;
    private String cliCidade;
    private String cliUF;
    private String cliCep;
    private String cliTelefone;

    public int getIdCliente() {
        return idCliente;
    }

    public String getCliNome() {
        return cliNome;
    }

    public String getCliEndereco() {
        return cliEndereco;
    }

    public String getCliBairro() {
        return cliBairro;
    }

    public String getCliCidade() {
        return cliCidade;
    }

    public String getCliUF() {
        return cliUF;
    }

    public String getCliCep() {
        return cliCep;
    }

    public String getCliTelefone() {
        return cliTelefone;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setCliNome(String cliNome) {
        this.cliNome = cliNome;
    }

    public void setCliEndereco(String cliEndereco) {
        this.cliEndereco = cliEndereco;
    }

    public void setCliBairro(String cliBairro) {
        this.cliBairro = cliBairro;
    }

    public void setCliCidade(String cliCidade) {
        this.cliCidade = cliCidade;
    }

    public void setCliUF(String cliUF) {
        this.cliUF = cliUF;
    }

    public void setCliCep(String cliCep) {
        this.cliCep = cliCep;
    }

    public void setCliTelefone(String cliTelefone) {
        this.cliTelefone = cliTelefone;
    }
  }
