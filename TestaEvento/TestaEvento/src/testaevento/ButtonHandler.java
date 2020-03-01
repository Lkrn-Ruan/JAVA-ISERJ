package testaevento;
import java.awt.event.*;
import javax.swing.*;

public abstract class ButtonHandler implements ActionListener {
    private JButton ok, cancela;
    
    public ButtonHandler(JButton ok, JButton cancela){
        this.ok = ok;
        this.cancela = cancela;
    }
    public void actionPerformed(ActionEvent evento){
        if(evento.getSource()== ok){
            JOptionPane.showMessageDialog(null, "O botão OK foi clicado");
        }
        if(evento.getSource()== cancela){
            JOptionPane.showMessageDialog(null, "O botão CANCELA foi clicado");
             System.exit(0);
        }
    }
    }