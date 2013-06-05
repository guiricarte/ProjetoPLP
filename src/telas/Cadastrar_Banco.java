package telas;

import classes.Arquivo;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.*;
import java.text.Normalizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Cadastrar_Banco extends javax.swing.JFrame {
    private String sexo;
    private String sexo_parente;
    /**
     * Creates new form Cadastrar_Banco
     */
    public Cadastrar_Banco() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(new Point((screenSize.width - frameSize.width) / 2,
                              (screenSize.height - frameSize.width) / 2));
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        nome_parente = new javax.swing.JTextField();
        sex_masc = new javax.swing.JRadioButton();
        sex_fem = new javax.swing.JRadioButton();
        sex_parente_masc = new javax.swing.JRadioButton();
        sex_parente_fem = new javax.swing.JRadioButton();
        sel_parente = new javax.swing.JComboBox();
        Cadastrar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Banco de Dados");
        setAutoRequestFocus(false);
        setBounds(new java.awt.Rectangle(530, 250, 0, 0));
        setResizable(false);

        jLabel1.setText("Nome:");

        jLabel2.setText("Sexo:");

        jLabel3.setText("Grau de Parentesco:");

        jLabel4.setText("Nome do Parente:");

        jLabel5.setText("Sexo do Parente:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Complete todas as informações abaixo: ");

        txt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nome(evt);
            }
        });

        nome_parente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_parente(evt);
            }
        });

        buttonGroup1.add(sex_masc);
        sex_masc.setText("Masculino");
        sex_masc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sex_masc(evt);
            }
        });

        buttonGroup1.add(sex_fem);
        sex_fem.setText("Feminino");
        sex_fem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sex_fem(evt);
            }
        });

        buttonGroup2.add(sex_parente_masc);
        sex_parente_masc.setText("Masculino");
        sex_parente_masc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sex_parente_masc(evt);
            }
        });

        buttonGroup2.add(sex_parente_fem);
        sex_parente_fem.setText("Feminino");
        sex_parente_fem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sex_parente_fem(evt);
            }
        });

        sel_parente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pai de", "Mãe de" }));
        sel_parente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel_parente(evt);
            }
        });

        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cadastrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome_parente))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sel_parente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sex_parente_masc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sex_parente_fem))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sex_masc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sex_fem))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sex_masc)
                    .addComponent(sex_fem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sel_parente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nome_parente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sex_parente_masc)
                    .addComponent(sex_parente_fem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastrar)
                    .addComponent(cancelar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static String removeAcentos(String str) {
        str = Normalizer.normalize(str, Normalizer.Form.NFD);
        str = str.replaceAll("[^\\p{ASCII}]", "");
        return str;
    }
    private void txt_nome(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nome

    }//GEN-LAST:event_txt_nome

    private void sel_parente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel_parente

    }//GEN-LAST:event_sel_parente

    private void cancelar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar
        setVisible(false);
        dispose();
    }//GEN-LAST:event_cancelar

    private void cadastrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar
        if ((!(txt_nome.getText().isEmpty() && nome_parente.getText().isEmpty())) 
                && (!(!sex_masc.isSelected() && (!sex_fem.isSelected())))
                && (!(!sex_parente_masc.isSelected() && (!sex_parente_fem.isSelected())))){
        
            if(sex_masc.isSelected()){
                sexo = "homem";
            }else{
                sexo = "mulher";
            }

            if(sex_parente_masc.isSelected()){
                sexo_parente = "homem";
            }else{
                sexo_parente = "mulher";
            }
            
            //predicado = sel_parente.getSelectedItem().toString().toLowerCase().replace(" ", "_").toLowerCase();
            String predicado = removeAcentos(sel_parente.getSelectedItem().toString().toLowerCase().replace(" ", "_").toLowerCase());
            String sexo_da_pessoa = sexo + "(" + removeAcentos(txt_nome.getText().toLowerCase()) + ").";
            String sexo_do_parente = sexo_parente + "(" + removeAcentos(nome_parente.getText().toLowerCase()) + ").";
            
            String arquivo = "src/files/banco_de_dados.pl";       
            File file = new File(arquivo);
            FileWriter fileWriter;
            try {
                fileWriter = new FileWriter(file,true);
                try (BufferedWriter bufferFileWriter = new BufferedWriter(fileWriter)) {
                    fileWriter.append(predicado +  "(" + removeAcentos(txt_nome.getText().toLowerCase() + ", " + nome_parente.getText().toLowerCase()) + ").\n");

                    if (Arquivo.ler(sexo_da_pessoa)==false){
                        System.out.print("Ja existe uma pessoa/parente com esse sexo cadastrado\n");
                    }else{
                        fileWriter.append(sexo_da_pessoa + "\n");    
                    }
                    if (Arquivo.ler(sexo_do_parente)==false){
                        System.out.print("Ja existe uma pessoa/parente com esse sexo cadastrado\n");
                    }else{
                        fileWriter.append(sexo_do_parente + "\n");    
                    }                    
                    JOptionPane.showMessageDialog(this, "Arquivo gravado com sucesso !", "Aviso", JOptionPane.PLAIN_MESSAGE);
                    System.out.println("Gravado com sucesso.");
                }
            } catch (IOException ex) {
                Logger.getLogger(Cadastrar_Banco.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Campo inválido ou vázio, por favor verifique !", "Erro", JOptionPane.PLAIN_MESSAGE);
        }
       
    }//GEN-LAST:event_cadastrar
    private void nome_parente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_parente

    }//GEN-LAST:event_nome_parente

    private void sex_parente_masc(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sex_parente_masc

    }//GEN-LAST:event_sex_parente_masc

    private void sex_parente_fem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sex_parente_fem

    }//GEN-LAST:event_sex_parente_fem

    private void sex_masc(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sex_masc

    }//GEN-LAST:event_sex_masc

    private void sex_fem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sex_fem

    }//GEN-LAST:event_sex_fem

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Cadastrar_Banco().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nome_parente;
    private javax.swing.JComboBox sel_parente;
    private javax.swing.JRadioButton sex_fem;
    private javax.swing.JRadioButton sex_masc;
    private javax.swing.JRadioButton sex_parente_fem;
    private javax.swing.JRadioButton sex_parente_masc;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables
}
