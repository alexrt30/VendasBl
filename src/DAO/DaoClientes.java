/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.ModelCliente;
import conexoes.ConexaoMySql;

/**
 *
 * @author alexd
 */
public class DaoClientes extends ConexaoMySql{
    /**
     * Cadastrar cliente no banco
     * 
     * @param pmodelCliente
     * @return 
     */
    
    public int salvarClientesDAO(ModelCliente pmodelCliente){
        try{
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_cliente("
                    + "pk_id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone"
            +") VALUES ("
                    + "'" + pmodelCliente.getIdCliente() + "',"
                    + "'" + pmodelCliente.getCliNome() + "',"
                    + "'" + pmodelCliente.getCliEndereco() + "',"
                    + "'" + pmodelCliente.getCliBairro() + "',"
                    + "'" + pmodelCliente.getCliCidade() + "',"
                    + "'" + pmodelCliente.getCliUF() + "',"
                    + "'" + pmodelCliente.getCliCep() + "',"
                    + "'" + pmodelCliente.getCliTelefone() + "'"
                    +");"
            );
            
        }catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }

    }
     
    
}
