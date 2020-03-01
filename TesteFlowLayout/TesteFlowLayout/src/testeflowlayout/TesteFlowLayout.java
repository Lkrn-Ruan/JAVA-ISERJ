package testeflowlayout;
import javax.swing.*;
import java.awt.*;

public class TesteFlowLayout extends JFrame {
    private JButton N, S, E, W;
    
    public TesteFlowLayout(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        N = new JButton ("North");
        S = new JButton ("South");
        E = new JButton ("East");
        W = new JButton ("West");
        
        Container container = getContentPane();
        container.setLayout(new java.awt.FlowLayout());
        container.add(N);
        container.add(S);
        container.add(E);
        container.add(W);
        
        setTitle("Teste Flow Layout");
        pack();
        setVisible(true);  
    }
    public static void main(String[] args) {
        TesteFlowLayout frame = new TesteFlowLayout();
    }
}