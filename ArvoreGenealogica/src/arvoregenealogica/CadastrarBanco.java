package arvoregenealogica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CadastrarBanco extends JFrame implements ActionListener
{
    JTextField txt_nome;
    JButton btn_salvar, btn_cancel;
    
    public CadastrarBanco()
    {
        setBounds (400,250,600,290);
        setTitle("Cadastrar Banco de Dados");
        setResizable(false);
        getContentPane().setLayout(null);
        
        txt_nome = new JTextField("");
        txt_nome.setBounds(55,40,320,25);
        
        getContentPane().add(txt_nome);
        
        getContentPane().add(btn_salvar);
        getContentPane().add(btn_cancel);
    }
    @Override
     public void actionPerformed(ActionEvent evento)
    {

        Object objetoEvento = evento.getSource();
            if (objetoEvento == btn_cancel)
            {
                this.dispose();
            }
            if (objetoEvento == btn_salvar)
            {

            }   
    }
}
