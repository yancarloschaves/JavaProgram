/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import model.dao.ObjetosDAO;
import model.dao.TelaPrincipalDAO;

/**
 *
 * @author Yan Carlos
 */
public class TelaPrincipal extends javax.swing.JFrame {  
    ObjetosDAO dao = new ObjetosDAO();
    DefaultTableModel dtmBusca = new DefaultTableModel();
    TelaPrincipalDAO tpDAO = new TelaPrincipalDAO();
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        jTBusca.getColumnModel().getColumn(3).setMinWidth(0);
        jTBusca.getColumnModel().getColumn(3).setMaxWidth(0);
        jTBusca.getColumnModel().getColumn(4).setMinWidth(0);
        jTBusca.getColumnModel().getColumn(4).setMaxWidth(0);

        
        //Teste para carregamento de imagem       
//        this.lblImg.setIcon(tlp.redimensionaImagem("C:\\Users\\Yan Carlos\\Desktop\\JavaProgram\\"
//                + "JavaProgram\\src\\images\\fotoTeste.jpg"));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parte1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        edtBuscar = new javax.swing.JTextField();
        btnAbrirBloco = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        parte2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTBusca = new javax.swing.JTable();
        lblImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bibliobusca 1.0");
        setResizable(false);

        parte1.setBackground(new java.awt.Color(204, 204, 255));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        edtBuscar.setText("use apenas uma tag");
        edtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtBuscarActionPerformed(evt);
            }
        });

        btnAbrirBloco.setText("Bloco 3D");
        btnAbrirBloco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbrirBlocoMouseClicked(evt);
            }
        });
        btnAbrirBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirBlocoActionPerformed(evt);
            }
        });

        jLabel1.setText("Desenvolvido por yancarlos@dcc.ufrj.br");

        javax.swing.GroupLayout parte1Layout = new javax.swing.GroupLayout(parte1);
        parte1.setLayout(parte1Layout);
        parte1Layout.setHorizontalGroup(
            parte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parte1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAbrirBloco)
                .addContainerGap())
            .addGroup(parte1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(edtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parte1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        parte1Layout.setVerticalGroup(
            parte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parte1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(parte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(edtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(btnAbrirBloco)
                .addContainerGap())
        );

        parte2.setBackground(new java.awt.Color(204, 204, 255));

        jTBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "T??tulo", "Descri????o", "Designer", "UrlImagem", "Bloco3D"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTBusca.setColumnSelectionAllowed(true);
        jTBusca.getTableHeader().setReorderingAllowed(false);
        jTBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTBuscaMouseClicked(evt);
            }
        });
        jTBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTBuscaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTBusca);
        jTBusca.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTBusca.getColumnModel().getColumnCount() > 0) {
            jTBusca.getColumnModel().getColumn(3).setResizable(false);
            jTBusca.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout parte2Layout = new javax.swing.GroupLayout(parte2);
        parte2.setLayout(parte2Layout);
        parte2Layout.setHorizontalGroup(
            parte2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parte2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        parte2Layout.setVerticalGroup(
            parte2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parte2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(parte2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(parte2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(parte1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(parte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(parte2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBuscaMouseClicked
        
        if(jTBusca.getSelectedRow()!= -1){
           ImageIcon imgIcon;
            try {
                imgIcon = tpDAO.redimensionaImagem(jTBusca.getValueAt(jTBusca.getSelectedRow(),3).toString());
                this.lblImg.setIcon(imgIcon);
            } catch (IOException ex) {
                System.out.println(ex);
            }
           
        }
    }//GEN-LAST:event_jTBuscaMouseClicked

    private void jTBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBuscaKeyPressed
        
    }//GEN-LAST:event_jTBuscaKeyPressed

    private void btnAbrirBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirBlocoActionPerformed

    }//GEN-LAST:event_btnAbrirBlocoActionPerformed

    private void btnAbrirBlocoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbrirBlocoMouseClicked
        
        String link = jTBusca.getValueAt(jTBusca.getSelectedRow(), 4).toString();
        
        try {
            Runtime.getRuntime().exec("explorer c:\\teste\\blocosIndice\\");

            } catch (java.io.IOException ex) {
                System.out.println("ErroAberturaPasta"+ex);
            }
    }//GEN-LAST:event_btnAbrirBlocoMouseClicked

    private void edtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtBuscarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        dao.ReconnectSQL();
        
        dtmBusca = (DefaultTableModel) jTBusca.getModel();
        dtmBusca.setNumRows(0);
        ResultSet rs = null;
        
        try {
            rs = dao.find(edtBuscar.getText());

            while(rs.next()){
                dtmBusca.addRow(new Object[]{rs.getString("titulo"),
                    rs.getString("colecao"),rs.getString("designer"),
                    rs.getString("urlImagem"),rs.getString("bloco3d")});
        }

        } catch (SQLException ex) {
            System.out.println("ErroBTN:"+ex);
        }finally{

        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirBloco;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JTextField edtBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTBusca;
    private javax.swing.JLabel lblImg;
    private javax.swing.JPanel parte1;
    private javax.swing.JPanel parte2;
    // End of variables declaration//GEN-END:variables
}
