/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoPI3.Inteface_principal;

import java.awt.CardLayout;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author NadsonJR
 */
public class Tela_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Principal
     */
    public Tela_Principal() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        painelLogin1 = new ProjetoPI3.Interface_Login.painelLogin();
        Empty = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelCadastrarProduto1 = new ProjetoPI3.Inteface_Produto.PainelCadastrarProduto();
        painelConsultarProduto1 = new ProjetoPI3.Inteface_Produto.PainelConsultarProduto();
        painelCategoria1 = new ProjetoPI3.Inteface_Produto.PainelCategoria();
        painelCadastroCliente1 = new ProjetoPI3.Interface_Cliente.painelCadastroCliente();
        painelRelatorio1 = new ProjetoPI3.Interface_Relatorio.painelRelatorio();
        painelVenda1 = new ProjetoPI3.Interface_Venda.painelVenda();
        painelCadastroUsuarios2 = new ProjetoPI3.Interface_Usuarios.painelCadastroUsuarios();
        jMenuBar1 = new javax.swing.JMenuBar();
        BarraProduto = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        CategoriaMenu = new javax.swing.JMenuItem();
        BarraClient = new javax.swing.JMenu();
        CadastrarCliente = new javax.swing.JMenuItem();
        ConsultarCliente = new javax.swing.JMenuItem();
        Vendas = new javax.swing.JMenu();
        EfetuarVendas = new javax.swing.JMenuItem();
        BarraRelatorio = new javax.swing.JMenu();
        MenuRelatorio = new javax.swing.JMenuItem();
        jMenuUsuarios = new javax.swing.JMenu();
        jUsuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        MainPanel.setLayout(new java.awt.CardLayout());
        MainPanel.add(painelLogin1, "card7");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif Redimensionado2.gif"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(469, 602));
        jLabel1.setMinimumSize(new java.awt.Dimension(469, 602));
        jLabel1.setPreferredSize(new java.awt.Dimension(469, 602));

        javax.swing.GroupLayout EmptyLayout = new javax.swing.GroupLayout(Empty);
        Empty.setLayout(EmptyLayout);
        EmptyLayout.setHorizontalGroup(
            EmptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmptyLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        EmptyLayout.setVerticalGroup(
            EmptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 509, Short.MAX_VALUE)
        );

        MainPanel.add(Empty, "empty");
        MainPanel.add(painelCadastrarProduto1, "TelaDeCadastro");
        MainPanel.add(painelConsultarProduto1, "TelaDeAlteracao");
        MainPanel.add(painelCategoria1, "CategoriaEdicao");
        MainPanel.add(painelCadastroCliente1, "CadastrarCliente");
        MainPanel.add(painelRelatorio1, "TelaRelatorio");
        MainPanel.add(painelVenda1, "TelaVendas");
        MainPanel.add(painelCadastroUsuarios2, "TelaUsuarios");

        jMenuBar1.setBackground(new java.awt.Color(161, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(153, 255, 255));

        BarraProduto.setText("Produto");

        jMenuItem1.setText("Cadastrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        BarraProduto.add(jMenuItem1);

        jMenuItem2.setText("Consultar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        BarraProduto.add(jMenuItem2);

        CategoriaMenu.setText("Categoria");
        CategoriaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaMenuActionPerformed(evt);
            }
        });
        BarraProduto.add(CategoriaMenu);

        jMenuBar1.add(BarraProduto);

        BarraClient.setText("Cliente");

        CadastrarCliente.setText("Cadastrar");
        CadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarClienteActionPerformed(evt);
            }
        });
        BarraClient.add(CadastrarCliente);

        ConsultarCliente.setText("Consultar");
        BarraClient.add(ConsultarCliente);

        jMenuBar1.add(BarraClient);

        Vendas.setText("Vendas");

        EfetuarVendas.setText("Efetuar");
        EfetuarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EfetuarVendasActionPerformed(evt);
            }
        });
        Vendas.add(EfetuarVendas);

        jMenuBar1.add(Vendas);

        BarraRelatorio.setText("Relatório");

        MenuRelatorio.setText("Emitir");
        MenuRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelatorioActionPerformed(evt);
            }
        });
        BarraRelatorio.add(MenuRelatorio);

        jMenuBar1.add(BarraRelatorio);

        jMenuUsuarios.setText("Usuários");

        jUsuarios.setText("Cadastrar");
        jUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsuariosActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jUsuarios);

        jMenuBar1.add(jMenuUsuarios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CardLayout Card = (CardLayout) MainPanel.getLayout();
        Card.show(MainPanel, "TelaDeCadastro");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CardLayout Card = (CardLayout) MainPanel.getLayout();
        Card.show(MainPanel, "TelaDeAlteracao");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        painelCadastrarProduto1.getCancelar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout card = (CardLayout) MainPanel.getLayout();
                card.show(MainPanel, "empty");
            }
        });

        painelConsultarProduto1.getCancelar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout card = (CardLayout) MainPanel.getLayout();
                card.show(MainPanel, "empty");
            }
            
        });
        painelCategoria1.getCancelar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout card = (CardLayout) MainPanel.getLayout();
                card.show(MainPanel, "empty");
            }
        });
        painelCadastroCliente1.getCancelar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout card = (CardLayout) MainPanel.getLayout();
                card.show(MainPanel, "empty");
            }
        });
        painelRelatorio1.getCancelar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout card = (CardLayout) MainPanel.getLayout();
                card.show(MainPanel, "empty");
            }
        });
        painelVenda1.getCancelar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout card = (CardLayout) MainPanel.getLayout();
                card.show(MainPanel, "empty");
            }
        });
        painelCadastroUsuarios2.getCancelar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout card = (CardLayout) MainPanel.getLayout();
                card.show(MainPanel, "empty");
            }
        });
        painelLogin1.getCancelar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout card = (CardLayout) MainPanel.getLayout();
                card.show(MainPanel, "empty");
            }
        });
        
    }//GEN-LAST:event_formWindowOpened

    private void CategoriaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaMenuActionPerformed
        CardLayout Card = (CardLayout) MainPanel.getLayout();
        Card.show(MainPanel, "CategoriaEdicao");
    }//GEN-LAST:event_CategoriaMenuActionPerformed

    private void CadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarClienteActionPerformed
         CardLayout Card = (CardLayout) MainPanel.getLayout();
        Card.show(MainPanel, "CadastrarCliente");   // TODO add your handling code here:
    }//GEN-LAST:event_CadastrarClienteActionPerformed

    private void MenuRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelatorioActionPerformed
        CardLayout Card = (CardLayout) MainPanel.getLayout();
        Card.show(MainPanel, "TelaRelatorio"); 
    }//GEN-LAST:event_MenuRelatorioActionPerformed

    private void EfetuarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EfetuarVendasActionPerformed
        CardLayout Card = (CardLayout) MainPanel.getLayout();
        Card.show(MainPanel, "TelaVendas"); 
    }//GEN-LAST:event_EfetuarVendasActionPerformed

    private void jUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsuariosActionPerformed
        CardLayout Card = (CardLayout) MainPanel.getLayout();
        Card.show(MainPanel, "TelaUsuarios");
    }//GEN-LAST:event_jUsuariosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tela_Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Tela_Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Tela_Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Tela_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Principal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu BarraClient;
    private javax.swing.JMenu BarraProduto;
    private javax.swing.JMenu BarraRelatorio;
    private javax.swing.JMenuItem CadastrarCliente;
    private javax.swing.JMenuItem CategoriaMenu;
    private javax.swing.JMenuItem ConsultarCliente;
    private javax.swing.JMenuItem EfetuarVendas;
    private javax.swing.JPanel Empty;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JMenuItem MenuRelatorio;
    private javax.swing.JMenu Vendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jMenuUsuarios;
    private javax.swing.JMenuItem jUsuarios;
    private ProjetoPI3.Inteface_Produto.PainelCadastrarProduto painelCadastrarProduto1;
    private ProjetoPI3.Interface_Cliente.painelCadastroCliente painelCadastroCliente1;
    private ProjetoPI3.Interface_Usuarios.painelCadastroUsuarios painelCadastroUsuarios2;
    private ProjetoPI3.Inteface_Produto.PainelCategoria painelCategoria1;
    private ProjetoPI3.Inteface_Produto.PainelConsultarProduto painelConsultarProduto1;
    private ProjetoPI3.Interface_Login.painelLogin painelLogin1;
    private ProjetoPI3.Interface_Relatorio.painelRelatorio painelRelatorio1;
    private ProjetoPI3.Interface_Venda.painelVenda painelVenda1;
    // End of variables declaration//GEN-END:variables
}
