package ex15;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex15 extends JFrame {
    private JMenuBar barraMenu;
    private JMenu arquivo, editar;
    private JMenuItem item1, item2, item3;
    private JRadioButtonMenuItem radioMenu1, radioMenu2;
    private JCheckBoxMenuItem checkMenu1, checkMenu2;
    private ButtonGroup grupo;
    
    public Ex15() {
        barraMenu = new JMenuBar();
        arquivo  = new JMenu("Arquivo");
        editar = new JMenu("Editar");
        item1 = new JMenuItem("Novo");
        item2 = new JMenuItem("Salvar");
        item3 = new JMenuItem("Abrir");
        radioMenu1 = new JRadioButtonMenuItem("PT(BR)");
        radioMenu2 = new JRadioButtonMenuItem("In");
        checkMenu1 = new JCheckBoxMenuItem("Negrito");
        checkMenu2 = new JCheckBoxMenuItem("Itálico");
        grupo = new ButtonGroup();
        
        barraMenu.add(arquivo);
        barraMenu.add(editar);        
        arquivo.add(item1);
        arquivo.add(item2);
        arquivo.add(item3);
        editar.add(radioMenu1);
        editar.add(radioMenu2);
        editar.addSeparator();
        editar.add(checkMenu1);
        editar.add(checkMenu2);
        grupo.add(radioMenu1);
        grupo.add(radioMenu2);
        
        editar.setIcon(new ImageIcon( getClass().getResource( "/Imagens/alterar.gif"))); 
        arquivo.setIcon(new ImageIcon( getClass().getResource( "/Imagens/open16.gif"))); 
        
        item1.setAccelerator(KeyStroke.getKeyStroke( KeyEvent.VK_N, ActionEvent.ALT_MASK));
        item1.setIcon(new ImageIcon( getClass().getResource("/Imagens/new.png")));
        
        item2.setAccelerator(KeyStroke.getKeyStroke( KeyEvent.VK_S, ActionEvent.CTRL_MASK)); 
        item2.setIcon(new ImageIcon( getClass().getResource("/Imagens/salvar.png")));
        
        item3.setAccelerator(KeyStroke.getKeyStroke( KeyEvent.VK_A, ActionEvent.ALT_MASK));
        item3.setIcon(new ImageIcon( getClass().getResource("/Imagens/folder.png")));
        
        
        radioMenu1.setAccelerator(KeyStroke.getKeyStroke( KeyEvent.VK_P, ActionEvent.ALT_MASK));
        radioMenu1.setIcon(new ImageIcon( getClass().getResource( "/Imagens/Brazil.png"))); 
        
        radioMenu2.setAccelerator(KeyStroke.getKeyStroke( KeyEvent.VK_E, ActionEvent.CTRL_MASK)); 
        radioMenu2.setIcon(new ImageIcon( getClass().getResource( "/Imagens/United States of America.png"))); 
       
        checkMenu1.setAccelerator(KeyStroke.getKeyStroke( KeyEvent.VK_N, ActionEvent.CTRL_MASK)); 
        checkMenu1.setIcon(new ImageIcon( getClass().getResource( "/Imagens/negrito.png"))); 
        
        checkMenu2.setAccelerator(KeyStroke.getKeyStroke( KeyEvent.VK_I, ActionEvent.CTRL_MASK)); 
        checkMenu2.setIcon(new ImageIcon( getClass().getResource( "/Imagens/italico.png"))); 

        
        setLayout(new BorderLayout());
        setTitle("JList");
        add(barraMenu);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        Ex15 Jlist = new Ex15();
    }
}
