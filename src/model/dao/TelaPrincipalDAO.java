/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;

/**
 *
 * @author Yan Carlos
 */
public class TelaPrincipalDAO {
    
    //286 W 253H padrão images
    public ImageIcon redimensionaImagem(String img) throws IOException{
        String urlImagem = new File("/teste/blocosIndice/").getCanonicalPath();
        urlImagem = urlImagem +"\\"+img;
        
        System.out.println(urlImagem);
        ImageIcon image = new ImageIcon(urlImagem);
        
        ImageIcon image2 = new ImageIcon(image.getImage().getScaledInstance(286, 
                253, Image.SCALE_DEFAULT));
        
        return image2;
        
    }    
    
    
}
