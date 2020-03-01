package checbox;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercicio19 extends JFrame {
    
    private JCheckBox checkboxUm = new JCheckBox("100");
    private JCheckBox checkboxDois = new JCheckBox("200");
    private JCheckBox checkboxTres = new JCheckBox("300");
    private JLabel labelSoma = new JLabel("Soma: ");
    private JTextField textFieldSoma = new JTextField(10);
    private int soma = 0; 
    
    public Exercicio19() {
        
        super("Programa Swing JCheckBox 1");
        setLayout(new FlowLayout());
        
        add(checkboxUm);
        add(checkboxDois);
        add(checkboxTres);
        add(labelSoma);
        
        textFieldSoma.setEditable(false);
        add(textFieldSoma);
        
        ActionListener actionListener = new ActionHandler();
        checkboxUm.addActionListener(actionListener);
        checkboxDois.addActionListener(actionListener);
        checkboxTres.addActionListener(actionListener);
        
        setSize(500,90);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    class ActionHandler implements ActionListener {
        
        public void actionPerformed(ActionEvent event) {
            
            JCheckBox checkbox = (JCheckBox) event.getSource();
            
            if (checkbox.isSelected()) {
                
                if (checkbox == checkboxUm) {
                    soma += 100;
                } else 
            if (checkbox == checkboxDois) {
                soma += 200;
            } else 
                if (checkbox == checkboxTres) {
                    soma += 300;
                }
            } 
            else {
                if (checkbox == checkboxUm) {
                    soma -= 100;
                } else 
                    if (checkbox == checkboxDois) {
                        soma -= 200;
                    } else
                        if (checkbox == checkboxTres) {
                            soma -= 300;
                        }
            }
            textFieldSoma.setText(String.valueOf(soma));
        }
    }
    public static void main(String[] args) {
        
        Exercicio19 checkBox_acoes = new Exercicio19();
        
    }
}
