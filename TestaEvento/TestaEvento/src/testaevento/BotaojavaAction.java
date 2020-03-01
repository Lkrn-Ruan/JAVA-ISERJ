package testaevento;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class BotaojavaAction extends JFrame{
    
    private JButton ok = new JButton("OK");
    private JButton cancela = new JButton("Cancela");
    private ButtonHandler handler;
    
    public BotaojavaAction(){
        
        setTitle("Criando botões");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200,80);
        setVisible(true);
        
        handler = new ButtonHandler(ok, cancela){};
        ok.addActionListener(handler);
        add(ok);
        cancela.addActionListener(handler);
        add(cancela);
    }
}