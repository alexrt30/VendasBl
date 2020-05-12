package DAO;

import model.ModelCliente;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author alexmf
*/
public class DAOCliente extends ConexaoMySql {

    /**
    * grava Cliente
    * @param pModelCliente
    * @return int
    */
    public int salvarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_cliente ("
                    + "pk_id_cliente,"
                    + "cli__nome,"
                    + "cli__endereco,"
                    + "cli__bairro,"
                    + "cli__uf,"
                    + "cli__telefone"
                + ") VALUES ("
                    + "'" + pModelCliente.getIdCliente() + "',"
                    + "'" + pModelCliente.getCli_Nome() + "',"
                    + "'" + pModelCliente.getCli_Endereco() + "',"
                    + "'" + pModelCliente.getCli_Bairro() + "',"
                    + "'" + pModelCliente.getCli_Uf() + "',"
                    + "'" + pModelCliente.getCli_Telefone() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Cliente
    * @param pIdCliente
    * @return ModelCliente
    */
    public ModelCliente getClienteDAO(int pIdCliente){
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_cliente,"
                    + "cli__nome,"
                    + "cli__endereco,"
                    + "cli__bairro,"
                    + "cli__uf,"
                    + "cli__telefone"
                 + " FROM"
                     + " tbl_cliente"
                 + " WHERE"
                     + " pk_id_cliente = '" + pIdCliente + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setCli_Nome(this.getResultSet().getString(2));
                modelCliente.setCli_Endereco(this.getResultSet().getString(3));
                modelCliente.setCli_Bairro(this.getResultSet().getString(4));
                modelCliente.setCli_Uf(this.getResultSet().getString(5));
                modelCliente.setCli_Telefone(this.getResultSet().getString(6));
            } 
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }

    /**
    * recupera uma lista de Cliente
        * @return ArrayList
    */
    public ArrayList<ModelCliente> getListaClienteDAO(){
        ArrayList<ModelCliente> listamodelCliente = new ArrayList();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_cliente,"
                    + "cli__nome,"
                    + "cli__endereco,"
                    + "cli__bairro,"
                    + "cli__uf,"
                    + "cli__telefone"
                 + " FROM"
                     + " tbl_cliente"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente = new ModelCliente();
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setCli_Nome(this.getResultSet().getString(2));
                modelCliente.setCli_Endereco(this.getResultSet().getString(3));
                modelCliente.setCli_Bairro(this.getResultSet().getString(4));
                modelCliente.setCli_Uf(this.getResultSet().getString(5));
                modelCliente.setCli_Telefone(this.getResultSet().getString(6));
                listamodelCliente.add(modelCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCliente;
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * @return boolean
    */
    public boolean atualizarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_cliente SET "
                    + "pk_id_cliente = '" + pModelCliente.getIdCliente() + "',"
                    + "cli__nome = '" + pModelCliente.getCli_Nome() + "',"
                    + "cli__endereco = '" + pModelCliente.getCli_Endereco() + "',"
                    + "cli__bairro = '" + pModelCliente.getCli_Bairro() + "',"
                    + "cli__uf = '" + pModelCliente.getCli_Uf() + "',"
                    + "cli__telefone = '" + pModelCliente.getCli_Telefone() + "'"
                + " WHERE "
                    + "pk_id_cliente = '" + pModelCliente.getIdCliente() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Cliente
    * @param pIdCliente
    * @return boolean
    */
    public boolean excluirClienteDAO(int pIdCliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_cliente "
                + " WHERE "
                    + "pk_id_cliente = '" + pIdCliente + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}