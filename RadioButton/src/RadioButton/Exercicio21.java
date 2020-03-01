package RadioButton;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class Exercicio21 extends JFrame {
    private JRadioButton Flamengo, Vasco, Nenhum;
    private JLabel meuLabel;
    private ButtonGroup grupo1;
    private RadioButtonOpcao opt;
    
    private class RadioButtonOpcao implements ItemListener{
        public void itemStateChanged(ItemEvent event) {
            if(Flamengo.isSelected())
                JOptionPane.showMessageDialog(null, "Errou, tente outra resposta da próxima vez.");
            if(Vasco.isSelected())
                JOptionPane.showMessageDialog(null, "Errou, tente outra resposta da próxima vez.");
            if(Nenhum.isSelected())
                JOptionPane.showMessageDialog(null, "Boa, agora vai estudar.");
        }
    }
        
    public Exercicio21() {
        setTitle("Botões de Radio com ItemListener");
        setSize(600,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        meuLabel = new JLabel("Qual o melhor time do Campeonato?");
        Flamengo = new JRadioButton("Flamengo", false);
        Vasco = new JRadioButton("Vasco", false);
        Nenhum = new JRadioButton("Nenhum", false);
        grupo1 = new ButtonGroup();
        opt = new RadioButtonOpcao();
        
        add(meuLabel);
        add(Flamengo);
        add(Vasco);
        add(Nenhum);
        grupo1.add(Flamengo);
        grupo1.add(Vasco);
        grupo1.add(Nenhum);
        
        Flamengo.addItemListener(opt);
        Vasco.addItemListener(opt);
        Nenhum.addItemListener(opt);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Exercicio21 radioItemListener = new Exercicio21();
    }
}

