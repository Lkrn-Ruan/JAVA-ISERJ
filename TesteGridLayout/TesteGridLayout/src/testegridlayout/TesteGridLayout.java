package testegridlayout;
import javax.swing.*;
import java.awt.*;

public class TesteGridLayout extends JFrame {
    private JButton N, S, E, W;
    
    public TesteGridLayout(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        N=new JButton("North");
        S=new JButton("South");
        E=new JButton("East");
        W=new JButton("West");
       
        Container container = getContentPane();
        container.setLayout(new java.awt.GridLayout(2,2));
        container.add(N);
        container.add(S);
        container.add(E);
        container.add(W);
               
        setTitle("Teste Grid Layout");
        pack();
        setVisible(true); 
    }
    public static void main(String[] args){
        TesteGridLayout frame = new TesteGridLayout();
    }
}