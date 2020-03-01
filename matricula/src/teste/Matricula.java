package teste;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Victor Manuel & Ruan Silva - 1302
 */
public class Matricula extends JFrame{
    private JFrame frame;
    private JPanel painelBranco,painelAmarelo;
    private JLabel lblTitulo,lblNome,lblCurso,lblDisciplina,lblComentario;
    private JTextField tfNome,tfCurso,tfDisciplina;
    private JTextArea taComentario;
    
    public Matricula(){
        frame = new JFrame();
        painelBranco = new JPanel();
        painelAmarelo = new JPanel();
        lblTitulo = new JLabel();
        lblNome = new JLabel();
        lblCurso = new JLabel();
        lblDisciplina = new JLabel();
        lblComentario = new JLabel();
        tfNome = new JTextField();
        tfCurso = new JTextField();
        tfDisciplina = new JTextField();
        taComentario = new JTextArea();
        Container container = getContentPane();
        container.setLayout(null);
        container.add(painelBranco);
        
        
        setTitle("Utilizando o JtextComponent");
        pack();
        setVisible(true);
               
        painelBranco.setLayout(null);
        painelBranco.setBounds(10,10,510,340);
        painelBranco.setBackground(Color.white);
        
        lblTitulo.setText("Matricula em Disciplina");
        lblTitulo.setForeground(Color.blue);
        lblTitulo.setFont(new Font("Arial",Font.BOLD|Font.ITALIC,18));
        lblTitulo.setBounds(170,10,210,30);
        
        lblNome.setText("Nome do Aluno: ");
        lblNome.setBounds(20,60,115,15);
        
        lblCurso.setText("Curso: ");
        lblCurso.setBounds(20,90,50,15);
        
        lblDisciplina.setText("Disciplina: ");
        lblDisciplina.setBounds(20,130,110,15);
        
        tfNome.setText("Digite seu nome: ");
        tfNome.setForeground(Color.blue);
        tfNome.setBounds(100,60,390,20);
        
        tfCurso.setText("Sistema de Informação");
        tfCurso.setForeground(Color.blue);
        tfCurso.setBounds(70,130,430,20);
        
        tfDisciplina.setText("Linguagens e Técnicas de Programação");
        tfDisciplina.setForeground(Color.blue);
        tfDisciplina.setBounds(70,130,420,20);
        
        painelAmarelo.setLayout(null);
        painelAmarelo.setBounds(20,180,470,130);
        painelAmarelo.setBackground(Color.yellow);
        painelAmarelo.setBorder(BorderFactory.createEtchedBorder());
        
        lblComentario.setText("Comentários: ");
        lblComentario.setBounds(20,10,70,15);
        
        taComentario.setText("O Intuito da disciplina é ensinar ao aluno o paradigma orientado a objetos,SWING Professor: Fernando Moreira utilizando a linguagem de programação orientada a objetos JAVA, também apresentar os componentes para construção de interface gráfica, o SWING.");
        taComentario.setForeground(Color.blue);
        taComentario.setLineWrap(true);
        taComentario.setWrapStyleWord(true);
        taComentario.setBounds(20,30,430,87);
        
        add(painelBranco);
        add(painelAmarelo);
        painelBranco.add(lblTitulo);
        painelBranco.add(lblNome);
        painelBranco.add(lblCurso);
        painelBranco.add(lblDisciplina);
        painelBranco.add(tfNome);
        painelBranco.add(tfCurso);
        painelBranco.add(tfDisciplina);
        painelBranco.add(painelAmarelo);
        painelAmarelo.add(lblComentario);
        painelAmarelo.add(taComentario);
        
    }
    
    public static void main(String[] args) {
        Matricula frame = new Matricula();
    }
}
