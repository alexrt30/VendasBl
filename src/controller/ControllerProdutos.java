/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DaoProdutos;
import java.util.ArrayList;
import model.ModelProdutos;

/**
 *
 * @author alexd
 */
public class ControllerProdutos {
    private DaoProdutos daoProdutos = new DaoProdutos();
    
/**
 * Salvar produto no controller
 * @param pModelProdutos
 * @return int 
 */    
    
    public int salvarProdutosController(ModelProdutos pModelProdutos){
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);
    }
    
    /**
     * Excluir um produto pelo codigo
     * @param pCodigo
     * @return 
     */
    public boolean excluirProdutoController(int pCodigo){
        return this.daoProdutos.excluirProdutoDAO(pCodigo);
    }
    
/**
     * Alterar dados do produtos
     *
     * @param pModelProduto
     * @return boolean
     */  
    public boolean alteraProdutoController(ModelProdutos pModelProduto){
        return this.daoProdutos.alterarProdutoDAO(pModelProduto);
    
    }
/**
 * return produto pelo codigo
 * @param pCodigo
 * @return 
 */
    public ModelProdutos retornaProdutoController(int pCodigo){
    return this.daoProdutos.retornarProdutoDAO(pCodigo);
    }
   /**
    * retorna lista  
    * @return 
    */ 
    public ArrayList<ModelProdutos> retornaListaProdutoController(){
        return this.daoProdutos.retornarListaProdutosDAO();
    }

  


    
    
    
}
