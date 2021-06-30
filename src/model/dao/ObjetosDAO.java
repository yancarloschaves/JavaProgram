/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Objetos;

/**
 *
 * @author Yan Carlos
 */
public class ObjetosDAO {
    private Connection con = null;
    
    //Faz a conexao com o banco de dados
    public ObjetosDAO() {
        con = ConnectionFactory.getConnection();
        
    }
    
    public void ReconnectSQL(){
        try {
            if(con.isClosed()){
                con = ConnectionFactory.getConnection();
            }
            
        } catch (SQLException ex) {
            System.out.println("ErroReconnect: "+ex);
        }
    
    }
    
    //Processo de inserir objeto no banco de dados
    public Boolean save(Objetos obj){
        PreparedStatement stmt = null;
        
        //Query sql para ser executada no BD
        String sql = "INSERT INTO tabela(urlImagem,titulo,colecao,tags,designer,bloco3d) VALUES (?,?,?,?,?,?)";
        
        try {
            //Prepara o stmt para dar update usando a query em sql
            stmt = con.prepareStatement(sql);
            
            //faz o insert do obj passado para o stmt
            stmt.setString(1,obj.getUrlImagem());
            stmt.setString(2,obj.getTitulo());
            stmt.setString(3,obj.getColecao());
            stmt.setString(4,obj.getTags());
            stmt.setString(5,obj.getDesigner());
            stmt.setString(6,obj.getBloco3dUrl());
            
            //faz o update na tabela, retorna true se estiver tudo ok e false se der erro
            stmt.executeUpdate();
            
            return true;
                    
        } catch (SQLException ex) {
            System.err.println(ex);
            return false;
          
        //Encerra a conexão com o BD tanto para retorno true ou false   
        } finally{
            ConnectionFactory.CloseConnection(con, stmt);
        }
        
        
    }
    
    //Processo de buscar objeto no banco de dados
    public ResultSet find(String tag) throws SQLException{
        
        String sql = "SELECT * FROM tabela WHERE tags LIKE '%"+tag+"%'";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
               
        try{
            //cria a query 
            stmt = con.prepareStatement(sql);
            
            //executa a query e envia os resultados para o rs
            rs = stmt.executeQuery();
            
            
           
        } catch(SQLException ex){
            System.out.println("ErroFind:"+ex);
        }  
        
        return rs;
    }
    
    
    
}
