package caixaeletronico;
import java.util.Scanner;
import java.util.Random;

public class CaixaEletronico {
   public static void main(String[] args){
       String nome;
       double inicial;
       Scanner entrada = new Scanner (System.in);
       Random numero = new Random();
       int conta = 1 + numero.nextInt(9999);
       
       System.out.println("##### cadastrando novo cliente #####");
       System.out.println("      Entre com seu nome:      ");
       nome = entrada.nextLine();
       
       System.out.print("      Entre com o valor depositadona conta:      ");
       inicial = entrada.nextDouble ();
       
       Conta minhaConta = new Conta (nome, conta , inicial);
       minhaConta.iniciar();
 
   }
    
}
