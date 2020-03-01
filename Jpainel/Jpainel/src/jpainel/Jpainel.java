package jpainel;
import java.awt.*;
import javax.swing.*;

public class Jpainel extends JFrame{
    private JPanel painelTop, painelMid, painelDown;
    
    public Jpainel(){
        painelTop = new JPanel();
        painelMid = new JPanel();
        painelDown = new JPanel();
        
        setLayout(null);
        
        painelTop.setBackground(new Color(128,0,255));
        painelMid.setBackground(new Color(255,128,0));
        painelDown.setBackground(new Color(0,128,0));
        
        painelTop.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER));
        painelTop.setBounds(10,10,705,150);
        
        painelMid.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER));
        painelMid.setBounds(10,170,705,150);
        
        painelDown.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER));
        painelDown.setBounds(10,330,705,150);
        
        add(painelTop);
        add(painelMid);
        add(painelDown);
        
        setTitle("Estudo de Caso");
        setSize(740,560);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[]args){
        Jpainel frame = new Jpainel();
    }
}