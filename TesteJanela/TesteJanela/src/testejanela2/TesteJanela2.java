package testejanela2;
import java.awt.*;
import javax.swing.*;

public class TesteJanela2 extends JFrame{
    JButton b1;
    public TesteJanela2(){
        setTitle("Janelinha 2");
        setSize(560,260);
        setLocation(100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        b1 = new JButton("Botão");
        add(b1);
        setVisible(true);
    }
    public static void main(String[]args){
        TesteJanela2 jan2= new TesteJanela2();
    }
}
