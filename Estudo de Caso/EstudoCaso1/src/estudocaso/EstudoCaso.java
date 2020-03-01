package estudocaso;
import java.awt.*;
import javax.swing.*;

public class EstudoCaso extends JFrame {
    private JPanel painelTop, painelMid, painelDown;
    private JButton salvar, procurar, alterar, deletar, sair;
    private JLabel nome, endereco, bairro, cidade, email, sexo, escolaridade, areasAtuacao, pretensaoSalarial, cargoDesejavel, estado;
    
    public EstudoCaso(){
        painelTop = new JPanel();
        painelMid = new JPanel();
        painelDown = new JPanel();
        salvar = new JButton("Salvar");
        procurar = new JButton("Procurar");
        alterar = new JButton("Alterar");
        deletar = new JButton ("Deletar");
        sair = new JButton ("Sair");
        nome = new JLabel("Nome");
        endereco = new JLabel("Endereço");
        bairro = new JLabel("Bairro");
        cidade = new JLabel("Cidade");
        email   = new JLabel("E-mail");
        sexo    = new JLabel("Sexo");
        escolaridade = new JLabel("Escolaridade");
        areasAtuacao = new JLabel("Áreas de Atuação");
        pretensaoSalarial = new JLabel("Pretensão Salarial");
        cargoDesejavel = new JLabel("cargoDesejado"); 
        estado = new JLabel("Estado");
                
        setLayout(null);
        
        painelTop.setBackground(new Color(128,0,255));
        painelMid.setBackground(new Color(255,128,0));
        painelDown.setBackground(new Color(0,128,0));
        
        painelTop.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        painelTop.setBounds(10,10,705,150);
        
        painelMid.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        painelMid.setBounds(10,170,705,150);
       
        painelDown.setLayout(new java.awt.GridLayout(2, 2)); 
        painelDown.setBounds(10,330,705,150);

        salvar.setIcon(new ImageIcon(getClass().getResource("/imagens/salvar.png")));
        procurar.setIcon(new ImageIcon(getClass().getResource("/imagens/procurar.png"))); 
        alterar.setIcon(new ImageIcon(getClass().getResource("/imagens/alterar.gif")));
        deletar.setIcon(new ImageIcon(getClass().getResource("/imagens/delete.png")));
        sair.setIcon(new ImageIcon(getClass().getResource("/imagens/sair.png")));

        //Definição dos botões e de sus posições.
        salvar.setBounds(105,490,110,25);
        procurar.setBounds(230,490,110,25);
        alterar.setBounds(355,490,110,25);
        deletar.setBounds(480,490,110,25);
        sair.setBounds(605,490,110,25);
        //Adiciona os componetes no JFarme.
        add(painelTop);
        add(painelMid);
        add(painelDown);
        add(salvar);
        add(procurar);
        add(alterar);
        add(deletar);
        add(sair);

        painelTop.add(nome);
        painelTop.add(endereco);
        painelTop.add(estado);
        painelTop.add(email);
        painelTop.add(cidade);
        painelTop.add(sexo);
        painelTop.add(bairro);

        painelDown.add(escolaridade);
        painelDown.add(areasAtuacao);
        painelDown.add(cargoDesejavel);
        painelDown.add(pretensaoSalarial);
        setTitle("Estudo de Caso");
        setSize(740,560);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        EstudoCaso frame=new EstudoCaso();
    }
}