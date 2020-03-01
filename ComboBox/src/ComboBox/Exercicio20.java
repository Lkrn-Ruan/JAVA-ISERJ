package ComboBox;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercicio20 extends JFrame {
    
    public Exercicio20() {
        
    setSize(300, 300);
    setLocation(400,400);
    setTitle("Selecione seu time");
    setLayout(new FlowLayout(FlowLayout.CENTER));
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    
    String[] times = new String[]{
        "Flamengo", "Fluminense", "Vasco", "Botafogo", "Bangu"
            };
    
    JComboBox comboBox = new JComboBox<String>(times);
    comboBox.setEditable(false);
    comboBox.addActionListener(new ActionListener() {
            
        public void actionPerformed(ActionEvent event) {
        JComboBox comboBox = (JComboBox)event.getSource();
        Object selecionado = comboBox.getSelectedItem();
        JOptionPane.showMessageDialog(null, "O time selecionado foi " + selecionado);
        }
    }
    );
    
    add(comboBox);
    setVisible(true);
    }
        public static void main(String[] args) {
        Exercicio20 comboboxdemo = new Exercicio20();
    }
}