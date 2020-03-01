package testeborderlayout;
import java.awt.*;
import javax.swing.*;

class TesteBorderLayout extends JFrame {
    public static void main(String[] args) {
        JFrame window = new TesteBorderLayout();
        window.setVisible(true);
    }
    TesteBorderLayout(){
        JButton Norte = new JButton("North");
        JButton Leste = new JButton("East");
        JButton Sul = new JButton("South");
        JButton Oeste = new JButton("West");
        JButton Centro = new JButton("Center");

        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());

        content.add(Norte, BorderLayout.NORTH);
        content.add(Leste, BorderLayout.EAST);
        content.add(Sul, BorderLayout.SOUTH);
        content.add(Oeste, BorderLayout.WEST);
        content.add(Centro, BorderLayout.CENTER);
        
        setContentPane(content);
        setTitle("BorderTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }
}