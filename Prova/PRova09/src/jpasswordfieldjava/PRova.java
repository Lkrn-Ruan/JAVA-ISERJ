package jpasswordfieldjava;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import javax.swing.*;
import java.awt.event.ActionListener;

public class PRova extends JFrame {
    private JPasswordField pass;
    private JTextField txuser;
    private JLabel Nome, Senha;
    private JButton Login;
    String user, pas;
    public PRova(){
                       
        pass = new JPasswordField(10);
        pass.setBounds(70,65,150,20);
        
        txuser= new JTextField(10);     
        txuser.setBounds(70,30,150,20);
                
        setLayout(new java.awt.FlowLayout());
        Nome = new JLabel("Nome:");
        Nome.setBounds(20,10,150,60);
        
        Senha = new JLabel("Senha:");
        Senha.setBounds(20,45,150,60);
        
        Login = new JButton("Login");
        Login.setBounds(110,100,80,20);
        
        
        add(Nome);
        add(txuser);
        add(Senha);
        add(pass);       
        add(Login);
        
        
      
Login.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
        pas=pass.getText();
        user=txuser.getText();
        if(user=="teste"&&pas=="123"){
        System.out.println("Autenticação válida, login e senha corretos");
        }else{
        System.out.println("Senha errada ou nome errado");}
    }
});
                               
  
        pack();
        setTitle("Autenticação de Usuário");
        setSize(320,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        
        
    }
public static void main(String[]args){
        PRova frame = new PRova();
        
    }
    
}
