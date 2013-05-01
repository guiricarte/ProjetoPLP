package arvoregenealogica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaPrincipal extends JFrame implements ActionListener
{
    JButton btn_cad_banco, btn_sair;
    
    public TelaPrincipal ()
    {
        //Informações do tamanho da TelaPrincipal
        setBounds (400,200,600,380);
        setTitle("Projeto de PLP");
        setResizable(false);
        getContentPane().setLayout(null);
        
        //Informações sobre o botão Cad_Banco
        btn_cad_banco = new JButton("Cadastrar Banco");
        btn_cad_banco.setBounds(220,190,145,25);
        btn_cad_banco.addActionListener(this);
        
        btn_sair = new JButton("Sair");
        btn_sair.setBounds(440,190,75,25);
        btn_sair.addActionListener(this);
        
        //Colocando os elementos na TelaPrincipal
        getContentPane().add(btn_cad_banco);
        getContentPane().add(btn_sair);
    }

      	public void actionPerformed(ActionEvent evento)
  	{
            Object objetoEvento = evento.getSource();
  		
            if (objetoEvento == btn_sair) 
            {
                System.exit(0);
            }
            if (objetoEvento == btn_cad_banco)
            {
                JFrame CadastrarBanco = new CadastrarBanco();
                CadastrarBanco.setVisible(true);
            }
        }
    
}
