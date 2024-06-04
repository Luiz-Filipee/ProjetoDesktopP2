/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.com.unigran.views.cadastro;

import br.com.unigran.DTO.FuncaoDTO;
import br.com.unigran.DTO.GenericoDTO;
import br.com.unigran.DTO.GerenteClinicaDTO;
import br.com.unigran.DTO.LoginDTO;
import br.com.unigran.controller.FuncaoController;
import br.com.unigran.controller.GerenteClinicaController;
import br.com.unigran.controller.LoginController;
import br.com.unigran.util.PainelInterface;

/**
 *
 * @author user
 */
public class CadastroGerentePanel extends PainelInterface {

    /**
     * Creates new form CadastroGerentePanel
     */
    public CadastroGerentePanel() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        campoNome1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoSenha = new javax.swing.JTextField();

        jLabel2.setText("Nome");

        jLabel1.setText("Usuario");

        jLabel3.setText("Senha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(campoNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private GerenteClinicaDTO gerenteDTO;
    private FuncaoController funcaoController;
    private LoginController loginController;
    private GerenteClinicaController gerenteClinicaController;
    
    @Override
    public GenericoDTO salvar() {
        funcaoController = new FuncaoController();
        gerenteClinicaController = new GerenteClinicaController();
        loginController = new LoginController();
        
         if( gerenteDTO != null )
            gerenteDTO = new GerenteClinicaDTO();
         
        String username = campoNome1.getText();
        String password = campoSenha.getText();
        
        FuncaoDTO funcaoDTO = funcaoController.buscarPorNome("Gerente");

        LoginDTO loginCadastrado = new LoginDTO();
        loginCadastrado.loginUsername = username;
        loginCadastrado.senha = password;
        loginCadastrado.funcao = funcaoDTO;
                   
        gerenteDTO.nome = campoUsuario.getText();
        gerenteDTO.login = loginCadastrado;
        
        try{
           loginController.salvar(loginCadastrado);
           gerenteClinicaController.salvar(gerenteDTO);
        }catch(Exception ex){
            ex.getMessage();
        }
        
        return gerenteDTO;
    }

    @Override
    public void preencheCampos(GenericoDTO dto) {
        this.gerenteDTO =(GerenteClinicaDTO) dto;
        campoUsuario.setText(this.gerenteDTO.nome);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoNome1;
    private javax.swing.JTextField campoSenha;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}