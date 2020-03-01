package jpanelButton;
import java.awt.*;
import javax.swing.*;

public class JpanelButton extends JFrame{
    private JPanel painelTop, painelMid, painelDown;
    private JButton salvar, procurar, alterar, deletar, sair;
    
    public JpanelButton(){
        painelTop = new JPanel();
        painelMid = new JPanel();
        painelDown = new JPanel();
        salvar = new JButton("Salvar");
        procurar = new JButton("Procurar");
        alterar = new JButton("Alterar");
        deletar = new JButton("Deletar");
        sair = new JButton("Sair");
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
        
        salvar.setIcon(new ImageIcon(getClass().getResource("/figuras_icones//save.png")));
        
        procurar.setIcon(new ImageIcon(getClass().getResource("/figuras_icones//procurar.png")));
        
        alterar.setIcon(new ImageIcon(getClass().getResource("/figuras_icones//alterar.gif")));
        
        deletar.setIcon(new ImageIcon(getClass().getResource("/figuras_icones//delete.png")));
        
        sair.setIcon(new ImageIcon(getClass().getResource("/figuras_icones//sair.png")));
        
        salvar.setBounds(105,490,110,25);
        procurar.setBounds(230,490,110,25);
        deletar.setBounds(355,490,110,25);
        alterar.setBounds(480,490,110,25);
        sair.setBounds(605,490,110,25);
        
        add(painelTop);
        add(painelMid);
        add(painelDown);
        add(salvar);
        add(procurar);
        add(alterar);
        add(deletar);
        add(sair);
        
        setTitle("Painel");
        setSize(730,560);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[]args){
        JpanelButton frame = new JpanelButton();
    }
}