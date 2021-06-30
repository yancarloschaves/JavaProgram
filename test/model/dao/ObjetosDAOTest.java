/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.SQLException;
import model.bean.Objetos;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yan Carlos
 */
public class ObjetosDAOTest {
    
    public ObjetosDAOTest() {
    }

    @Test
    public void inserir() {
        while (true) {            
            Objetos obj = new Objetos("foto3.jpg", "Cadeira Nova Joe2", "JoeVerao2", "preto; madeira; moderno",
                    "joezao", "EnderecoBloco2dNovo");
            
            ObjetosDAO dao = new ObjetosDAO();
            
            if (dao.save(obj)) {
                System.out.println("SALVO COM SUCESSO");
            } else {
                fail("Erro ao salvar");
            }
        }
        
    }
    
//    @Test
//    public void listar() throws SQLException{
//        ObjetosDAO dao = new ObjetosDAO();
//        
//        for (Objetos o: dao.find("teste")){
//            System.out.println(" Tags:"+o.getTags()
//            +" Bloco3d:"+o.getBloco3dUrl());
//        }
//        
//    }
    
}
