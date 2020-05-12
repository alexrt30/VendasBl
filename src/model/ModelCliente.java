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
    private String cli_Nome;
    private String cli_Endereco;
    private String cli_Bairro;
    private String cli_Uf;
    private String cli_Telefone;

    /**
     * Construtor
     */
    public ModelCliente() {
    }

    /**
     * seta o valor de idCliente
     *
     * @param pIdCliente
     */
    public void setIdCliente(int pIdCliente) {
        this.idCliente = pIdCliente;
    }

    /**
     * @return pk_idCliente
     */
    public int getIdCliente() {
        return this.idCliente;
    }

    /**
     * seta o valor de cli_Nome
     *
     * @param pCli_Nome
     */
    public void setCli_Nome(String pCli_Nome) {
        this.cli_Nome = pCli_Nome;
    }

    /**
     * @return cli_Nome
     */
    public String getCli_Nome() {
        return this.cli_Nome;
    }

    /**
     * seta o valor de cli_Endereco
     *
     * @param pCli_Endereco
     */
    public void setCli_Endereco(String pCli_Endereco) {
        this.cli_Endereco = pCli_Endereco;
    }

    /**
     * @return cli_Endereco
     */
    public String getCli_Endereco() {
        return this.cli_Endereco;
    }

    /**
     * seta o valor de cli_Bairro
     *
     * @param pCli_Bairro
     */
    public void setCli_Bairro(String pCli_Bairro) {
        this.cli_Bairro = pCli_Bairro;
    }

    /**
     * @return cli_Bairro
     */
    public String getCli_Bairro() {
        return this.cli_Bairro;
    }

    /**
     * seta o valor de cli_Uf
     *
     * @param pCli_Uf
     */
    public void setCli_Uf(String pCli_Uf) {
        this.cli_Uf = pCli_Uf;
    }

    /**
     * @return cli_Uf
     */
    public String getCli_Uf() {
        return this.cli_Uf;
    }

    /**
     * seta o valor de cli_Telefone
     *
     * @param pCli_Telefone
     */
    public void setCli_Telefone(String pCli_Telefone) {
        this.cli_Telefone = pCli_Telefone;
    }

    /**
     * @return cli_Telefone
     */
    public String getCli_Telefone() {
        return this.cli_Telefone;
    }

    @Override
    public String toString() {
        return "ModelCliente {" + "::idCliente = " + this.idCliente + "::cli_Nome = " + this.cli_Nome + "::cli_Endereco = " + this.cli_Endereco + "::cli_Bairro = " + this.cli_Bairro + "::cli_Uf = " + this.cli_Uf + "::cli_Telefone = " + this.cli_Telefone + "}";
    }

    
}
