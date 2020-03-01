package Imovel;
import java.util.*;
public class TestaImovel extends Imovel{
    public static void main(String[] args) {
        int n=0;
        
        Novo pnovo = new Novo();
        Velho pvelho = new Velho();
                
        pvelho.setEndereco("Rua Transversal, 850 - São Cristovão - Rio de Janeiro/RJ");
        pnovo.setEndereco("Rua Mariz e Barros, 273 - Maracanã - Rio de Janeiro/RJ");
        pvelho.setPreco(1000);
        pnovo.setPreco(2000);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o sua opção: "+"\n"+"1 - Imóvel Novo"+"\n"+"2 - Imóvel Velho\nResposta: ");
        n=sc.nextInt();
       
        if(n==1){
            System.out.println("O Imóvel Novo se encontra no endereço: "+pnovo.getEndereco()+".\nPossui o preço de R$"+pnovo.precoNovo());
        }else{
            if(n==2){
                System.out.println("\nO Imóvel Velho se encontra no endereço: "+pvelho.getEndereco()+".\nPossui o preço de R$"+pvelho.precoVelho());
            }else{
                System.out.println("Opção Inválida");
            }
        }
    }
}