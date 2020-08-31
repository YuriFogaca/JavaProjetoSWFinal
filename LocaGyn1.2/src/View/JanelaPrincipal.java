/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import Controller.ObservadorDeStatus;
import Controller.StatusVeiculoSujeito;
import Controller.VeiculoController;
import Model.Celta;
import Model.Gol;
import Model.Palio;
import Model.S10;
import Model.Toro;
import Model.Uno;
import Model.Veiculo;

/**
 *
 * @author PC
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadastrarCliente = new javax.swing.JButton();
        CadastrarVeiculo = new javax.swing.JButton();
        ListarClientes = new javax.swing.JButton();
        ListarVeiculos = new javax.swing.JButton();
        AlugarVeiculo = new javax.swing.JButton();
        ListarAlugueis = new javax.swing.JButton();
        btnConectarDB = new javax.swing.JButton();
        lblInfoDB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LocaGyn");

        CadastrarCliente.setText("Cadastrar Cliente");
        CadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarClienteActionPerformed(evt);
            }
        });

        CadastrarVeiculo.setText("Cadastrar Veiculo");
        CadastrarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarVeiculoActionPerformed(evt);
            }
        });

        ListarClientes.setText("Listar Clientes");
        ListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarClientesActionPerformed(evt);
            }
        });

        ListarVeiculos.setText("Listar Veiculo");
        ListarVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarVeiculosActionPerformed(evt);
            }
        });

        AlugarVeiculo.setText("Alugar Veiculo");
        AlugarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlugarVeiculoActionPerformed(evt);
            }
        });

        ListarAlugueis.setText("Listar Alugueis");
        ListarAlugueis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarAlugueisActionPerformed(evt);
            }
        });

        btnConectarDB.setText("Veiculos Disponiveis");
        btnConectarDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnConectarDBActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        lblInfoDB.setText("Lista de status de veiculos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AlugarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(CadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CadastrarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ListarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ListarVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(ListarAlugueis, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConectarDB, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblInfoDB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CadastrarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListarVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListarAlugueis, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlugarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                .addComponent(btnConectarDB)
                .addGap(3, 3, 3)
                .addComponent(lblInfoDB)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //impressao de status --------------------------------------------------------------------    
    public void imprimirStatus(StatusVeiculoSujeito status) throws SQLException {
    	lblInfoDB.setText("Visualizar Celtas disponiveis");
    	Veiculo veiculo= new Celta();
    	status.setarDados(veiculo);
    	lblInfoDB.setText("Visualizar Unos disponiveis");
    	Veiculo veiculo2= new Uno();
    	status.setarDados(veiculo2);
    	lblInfoDB.setText("Visualizar Gols disponiveis");
    	Veiculo veiculo3= new Gol();
    	status.setarDados(veiculo3);
    	lblInfoDB.setText("Visualizar Palios disponiveis");
    	Veiculo veiculo4= new Palio();
    	status.setarDados(veiculo4);
    	lblInfoDB.setText("Visualizar Toros disponiveis");
    	Veiculo veiculo5= new Toro();
    	status.setarDados(veiculo5);
    	lblInfoDB.setText("Visualizar S10s disponiveis");
    	Veiculo veiculo6= new S10();
    	status.setarDados(veiculo6);
    }
    //impressao de status --------------------------------------------------------------------
    private void AlugarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlugarVeiculoActionPerformed
        new JanelaAluguel().setVisible(true);
    }//GEN-LAST:event_AlugarVeiculoActionPerformed

    private void btnConectarDBActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_btnConectarDBActionPerformed
        StatusVeiculoSujeito status= new StatusVeiculoSujeito();
        ObservadorDeStatus observer= new ObservadorDeStatus(status);
        while (true) {
			imprimirStatus(status);
		}
    }//GEN-LAST:event_btnConectarDBActionPerformed

    private void CadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarClienteActionPerformed
        new JanelaEditarCliente().setVisible(true);
    }//GEN-LAST:event_CadastrarClienteActionPerformed

    private void ListarVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarVeiculosActionPerformed
        new JanelaPesqVeiculos().setVisible(true);
    }//GEN-LAST:event_ListarVeiculosActionPerformed

    private void ListarAlugueisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarAlugueisActionPerformed
        new JanelaPesqAluguel().setVisible(true);
    }//GEN-LAST:event_ListarAlugueisActionPerformed

    private void ListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarClientesActionPerformed
        new JanelaPesqCliente().setVisible(true);
    }//GEN-LAST:event_ListarClientesActionPerformed

    private void CadastrarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarVeiculoActionPerformed
        new JanelaVeiculos().setVisible(true);
    }//GEN-LAST:event_CadastrarVeiculoActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlugarVeiculo;
    private javax.swing.JButton CadastrarCliente;
    private javax.swing.JButton CadastrarVeiculo;
    private javax.swing.JButton ListarAlugueis;
    private javax.swing.JButton ListarClientes;
    private javax.swing.JButton ListarVeiculos;
    private javax.swing.JButton btnConectarDB;
    private javax.swing.JLabel lblInfoDB;
    // End of variables declaration//GEN-END:variables
}
