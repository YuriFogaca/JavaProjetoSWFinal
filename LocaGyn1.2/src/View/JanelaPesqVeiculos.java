/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Controller.VeiculoController;
import Model.TipoVeiculoAbstractFactory;
import Model.Veiculo;

/**
 *
 * @author PC
 */
public class JanelaPesqVeiculos extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPesqVeiculos
     */
    public JanelaPesqVeiculos() {
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

        jLabel1 = new javax.swing.JLabel();
        cbPesquisa = new javax.swing.JComboBox<>();
        edtPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setTitle("Pesquisar Veiculo");
        
        //FAZER BOTAO OU OPCAO PARA SELECIONAR O TIPO DO VEICULO E O MODELO DO VEICULO
        //OLHAR OS TIPOS E MODELOS NO MODEL
        jLabel1.setText("Selecione o TIPO DE VEICULO E MODELO");//FAZER BOTAO OU OPCAO PARA SELECIONAR O TIPO DO VEICULO E O MODELO DO VEICULO
      //FAZER BOTAO OU OPCAO PARA SELECIONAR O TIPO DO VEICULO E O MODELO DO VEICULO
        cbPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Marca", "Modelo", "Disponível", "Alugado" }));
        cbPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPesquisaActionPerformed(evt);
            }
        });
        
        //SE RETIRAR  ADDACTIONLISTENER OU A FUNCAO CLICOUPESQUISAR O BOTAO PARA DE FUNCIONAR
        btnPesquisar.setText("Pesquisar");//SE RETIRAR  ADDACTIONLISTENER OU A FUNCAO CLICOUPESQUISAR O BOTAO PARA DE FUNCIONAR
        btnPesquisar.addActionListener(new ActionListener() {//SE RETIRAR  ADDACTIONLISTENER OU A FUNCAO CLICOUPESQUISAR O BOTAO PARA DE FUNCIONAR
        	//SE RETIRAR  ADDACTIONLISTENER OU A FUNCAO CLICOUPESQUISAR O BOTAO PARA DE FUNCIONAR
			@Override//SE RETIRAR  ADDACTIONLISTENER OU A FUNCAO CLICOUPESQUISAR O BOTAO PARA DE FUNCIONAR
			public void actionPerformed(ActionEvent e) {//SE RETIRAR  ADDACTIONLISTENER OU A FUNCAO CLICOUPESQUISAR O BOTAO PARA DE FUNCIONAR
				clicouPesquisar();//SE RETIRAR  ADDACTIONLISTENER OU A FUNCAO CLICOUPESQUISAR O BOTAO PARA DE FUNCIONAR
				//SE RETIRAR  ADDACTIONLISTENER OU A FUNCAO CLICOUPESQUISAR O BOTAO PARA DE FUNCIONAR
			}//SE RETIRAR  ADDACTIONLISTENER OU A FUNCAO CLICOUPESQUISAR O BOTAO PARA DE FUNCIONAR
		});
      //SE RETIRAR  ADDACTIONLISTENER OU A FUNCAO CLICOUPESQUISAR O BOTAO PARA DE FUNCIONAR
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Cor", "Placa", "Chassi", "RENAVAM", "Valor da Diária", "Tipo do Veículo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        
        //SE RETIRAR ADDACTIONLISTENER OU A FUNCAO CLICLOUEXCLUIR O BOTAO PARA DE FUNCIONAR
        btnExcluir.setText("Excluir");//SE RETIRAR ADDACTIONLISTENER OU A FUNCAO CLICLOUEXCLUIR O BOTAO PARA DE FUNCIONAR
        btnExcluir.addActionListener(new ActionListener() {//SE RETIRAR ADDACTIONLISTENER OU A FUNCAO CLICLOUEXCLUIR O BOTAO PARA DE FUNCIONAR
        	//SE RETIRAR ADDACTIONLISTENER OU A FUNCAO CLICLOUEXCLUIR O BOTAO PARA DE FUNCIONAR
			@Override//SE RETIRAR ADDACTIONLISTENER OU A FUNCAO CLICLOUEXCLUIR O BOTAO PARA DE FUNCIONAR
			public void actionPerformed(ActionEvent e) {//SE RETIRAR ADDACTIONLISTENER OU A FUNCAO CLICLOUEXCLUIR O BOTAO PARA DE FUNCIONAR
				clicouExcluir();//SE RETIRAR ADDACTIONLISTENER OU A FUNCAO CLICLOUEXCLUIR O BOTAO PARA DE FUNCIONAR
				//SE RETIRAR ADDACTIONLISTENER OU A FUNCAO CLICLOUEXCLUIR O BOTAO PARA DE FUNCIONAR
			}//SE RETIRAR ADDACTIONLISTENER OU A FUNCAO CLICLOUEXCLUIR O BOTAO PARA DE FUNCIONAR
		});//SE RETIRAR ADDACTIONLISTENER OU A FUNCAO CLICLOUEXCLUIR O BOTAO PARA DE FUNCIONAR
      //SE RETIRAR ADDACTIONLISTENER OU A FUNCAO CLICLOUEXCLUIR O BOTAO PARA DE FUNCIONAR
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbPesquisa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //FUNCOES DE ACOES de clicar nos BOTOES ------------------------------------------------------------
    public void clicouPesquisar() {
    	VeiculoController vc= new VeiculoController();

		String placa, tipoVeculo, modeloVeiculo;
		placa= edtPesquisa.getText();
		tipoVeculo= "economico";
		modeloVeiculo= "uno";
		
		//escolher o tipo do objeto veiculo
		TipoVeiculoAbstractFactory objTipoVeiculoAbstractFactory= TipoVeiculoAbstractFactory.getInstance(tipoVeculo);
		//escolher o modelo do objeto veiculo
		Veiculo veiculo= objTipoVeiculoAbstractFactory.getVeiculo(modeloVeiculo);
		
		try {
			List<Veiculo> lvc= new ArrayList<Veiculo>();
			lvc= vc.listarVeiculos(veiculo); //lista de veiculos
			veiculo= vc.buscarVeiculo(placa, veiculo); // veiculo encontrado pela placa
		} catch (SQLException e) {
			JOptionPane.showConfirmDialog(null, "NAO FOI POSSIVEL pesquisar o veiculo"
					+ " erro no Banco de Dados" + e.getLocalizedMessage());
		}
    }
    public void clicouExcluir() {
    	JOptionPane.showConfirmDialog(this, "NAO pode excluir");
    }
    //FUNCOES DE ACOES de clicar nos BOTOES ------------------------------------------------------------

    private void cbPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPesquisaActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        new JanelaVeiculos().setVisible(true);
    }//GEN-LAST:event_btnAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPesqVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPesqVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPesqVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPesqVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPesqVeiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cbPesquisa;
    private javax.swing.JTextField edtPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}