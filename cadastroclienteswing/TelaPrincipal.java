/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cadastroclienteswing;

import JavaApplication1.dao.ClienteMapDAO;
import JavaApplication1.domain.Cliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pablo
 */
public class TelaPrincipal extends javax.swing.JFrame {

   private DefaultTableModel modelo = new DefaultTableModel(); 
   private ClienteMapDAO clienteDAO = new ClienteMapDAO();
    
    public TelaPrincipal() {
        initComponents();
        initCustomComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClientes = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        MenuItemSair = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNome.setText("Nome");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblCPF.setText("CPF:");

        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        tableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableClientes);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jMenu1.setText("Opções");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSair);

        MenuItemSair.add(jMenu1);

        setJMenuBar(MenuItemSair);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addGap(56, 56, 56)
                                .addComponent(btnExcluir)
                                .addGap(62, 62, 62)
                                .addComponent(btnAtualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addGap(18, 18, 18)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(lblCPF)))
                        .addGap(18, 18, 18)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAtualizar)
                    .addComponent(btnLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
      
        
        
        int result = JOptionPane.showConfirmDialog(this, "Deseja sair da aplicação?", "Sair", 
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE);
                        if(result == JOptionPane.YES_OPTION){
                            System.exit(0);
                        }
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
                String nome = txtNome.getText();
                String cpf = txtCPF.getText();
                if (!isCamposValidos(nome, cpf)){
                                    JOptionPane.showMessageDialog(null, "Existem campos a serem preenchidos", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
                                    return; 
                                    
                             }
                
                Cliente cliente = new Cliente (nome, cpf, cpf, null, cpf, null, null);
                Boolean isCadastrado = this.clienteDAO.cadastrar(cliente);
                
                if (isCadastrado){
                    modelo.addRow(new Object[]{cliente.getNome(), cliente.getCpf()});
                    limparcampos();
                    
                }else {
                    JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void tableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClientesMouseClicked
        int linhaSelecionada=tableClientes.getSelectedRow();
        String cpf = (String) tableClientes.getValueAt(linhaSelecionada, 1);
        Cliente cliente = this.clienteDAO.consultar(cpf);
        txtNome.setText(cliente.getNome());
        txtCPF.setText(cliente.getCpf());
        
    }//GEN-LAST:event_tableClientesMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
    int linhaSelecionada=tableClientes.getSelectedRow();
    
    if (linhaSelecionada >=0){
        int result = JOptionPane.showConfirmDialog(this, "deseja realmente excluir", "cuidado", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            
            String cpf = (String) tableClientes.getValueAt(linhaSelecionada, 1);
            this.clienteDAO.excluir(cpf);
            modelo.removeRow(linhaSelecionada);
            
            JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            limparcampos();
        }
        else{
            JOptionPane.showMessageDialog(null, "nenhum cliente selecionado", "erro", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed

        int linhaSelecionada = tableClientes.getSelectedRow();
        
        if (linhaSelecionada>=0){
            String cpf = (String) tableClientes.getValueAt(linhaSelecionada, 1);
            String nome = txtNome.getText();
            
        if(!isCamposValidos(nome, cpf)){JOptionPane.showMessageDialog(this, "faltam preencher campos obrigatórios");
        }
        
        Cliente clienteNovo = new Cliente (nome, cpf);
        this.clienteDAO.alterar(clienteNovo);
        
        modelo.removeRow(linhaSelecionada);
        modelo.addRow(new Object[]{clienteNovo.getNome(), clienteNovo.getCpf()});
        
        JOptionPane.showMessageDialog(null, "cliente atualizado", "sucesso", JOptionPane.INFORMATION_MESSAGE);
        limparcampos();
            
        }else{
            JOptionPane.showMessageDialog(null, "nenhum cliente selecionado", "erro", JOptionPane.INFORMATION_MESSAGE);
        }        

    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparcampos();
    }//GEN-LAST:event_btnLimparActionPerformed
    
    
    
    
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
    private javax.swing.JMenuBar MenuItemSair;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tableClientes;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    private boolean isCamposValidos(String ...campos){
        for (String campo:campos) {
            if (campos == null || "".equals(campo)){
                return false;
            }
        }
        return true; 
    }

    private void initCustomComponents() {
        
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        
         tableClientes.setModel(modelo);
         
         
        
        
    }

    private void limparcampos() {

        txtNome.setText("");
        txtCPF.setText("");
    }

   
}