package estudo;
import javax.swing.*;
public class Estudo {
    public static void main(String[] args) {
        float n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite sua nota do 1 bimestre!"));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite sua nota do 2 bimestre!"));
        float n3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite sua nota do 3 bimestre!"));
        float n4 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite sua nota do 4 bimestre!"));
        float soma=(n1+n2+n3+n4)/4;
        
        if(soma<7){
            JOptionPane.showMessageDialog(null,"Sua nota está abaixo da média","Resultado Final", JOptionPane.WARNING_MESSAGE);
        }else{
            if(soma>=7){
        JOptionPane.showMessageDialog(null,"Sua nota está dentro da média","Final Campeonato", JOptionPane.INFORMATION_MESSAGE);
        }
            
        else{
                JOptionPane.showMessageDialog(null,"Informe um número","ERRO",JOptionPane.ERROR_MESSAGE);
        }
        
}
    }
}