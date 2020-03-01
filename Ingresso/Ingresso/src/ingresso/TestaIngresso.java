package ingresso;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author Victor Manuel & Ruan Silva - 1302
 */
public class TestaIngresso extends Ingresso{
    public static void main(String[] args) {
        NumberFormat formatter = new DecimalFormat("#0.00");
        CamaroteSuperior CS = new CamaroteSuperior();
        CamaroteInferior CI = new CamaroteInferior();
        Vip v = new Vip();
        Normal n = new Normal();
        
        String opcao = JOptionPane.showInputDialog("Escolha o tipo de ingresso:\n"
                + "1 - Ingresso Normal\n"
                + "2 - Ingresso Vip");
        
        switch(opcao){
            case "1":
                JOptionPane.showMessageDialog(null, "O valor do ingresso normal: R$"+ formatter.format(n.ImprimeValor()));
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "Você selecionou o Ingresso Vip no valor de : R$"+formatter.format(v.ImprimeValor()));
                String opcao2 = JOptionPane.showInputDialog("Escolha o tipo de ingresso:\n"
                + "1 - Camarote Superior\n"
                + "2 - Camarote Inferior");;
                switch (opcao2) {
                    case "1":
                            JOptionPane.showMessageDialog(null,"O valor do camarote superior: R$"+formatter.format(CS.ImprimeValor()));
                        break;
                    case "2":
                            JOptionPane.showMessageDialog(null,"O valor do camarote inferior é de: RS"+formatter.format(v.ImprimeValor())+
                                    "\n"+"O lugar do camarote inferior é: "+CI.lugarCI());
                         break;
                    default:
                            JOptionPane.showMessageDialog(null, "Opção Errada");
                    break;
        }
                break;
            default:
               JOptionPane.showMessageDialog(null, "Opção Errada");
               break;
        }
    }
}

