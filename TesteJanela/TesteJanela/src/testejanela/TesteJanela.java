package testejanela;
import java.awt.*;
import javax.swing.*;

public class TesteJanela extends JFrame {
    public TesteJanela(){
        setTitle("Janela Teste");
        setSize(560,260);
        setLocation(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String args[]){
        TesteJanela jan = new TesteJanela();
    }
}