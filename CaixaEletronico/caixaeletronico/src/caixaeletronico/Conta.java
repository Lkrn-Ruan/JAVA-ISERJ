package caixaeletronico;
import java.util.Scanner;

public class Conta {
      private String nome;
      private int conta, saques;
      private double saldo;
      Scanner entrada = new Scanner(System.in);    
      
      public Conta (String nome, int conta, double saldo_inicial){
          this.nome=nome;
          this.conta=conta;
          saldo=saldo_inicial;
          saques=0;
          
      }
      
      public void extrato(){
          System.out.println("\n\tEXTRATO\n");
          System.out.println("Nome: " + this.conta);
          System.out.println("Numero de conta: " + this.conta);
          System.out.printf("Saldo atual: %.2f\n", this.saldo);
          System.out.println("Saques realizados hoje: "+ this.saques +"\n");
      }
      
     public void sacar(double valor){
         if(saldo >= valor){
         saldo -= valor;
         saques++;
         System.out.println("Sacado: " + valor);
         System.out.println("Novo Saldo: " + saldo + "\n");
     } else {
      System.out.println("Saldo insuficiente. faça um deposito\n");
}
     } 
     
     public void depositar(double valor){
         saldo+= valor;
         System.out.println("Depositado: "+valor);
         System.out.println("Novo saldo: "+saldo+"\n");
     }
     public void iniciar(){
         int opcao;
         do{
             exibeMenu();   
             opcao = entrada.nextInt();
             escolheOpcao(opcao);
         }while(opcao!=4);
     }
     public void exibeMenu(){
         System.out.println("\n\t Escolha a opçao desejada\n");
         System.out.println("1 - consultar Extrato");
         System.out.println("2 - sacar");
         System.out.println("3 - depositar");
         System.out.println("4 - sair\n");
         System.out.println("Opçao: ");
        
         }
     public void escolheOpcao (int opcao){
         double valor;
         switch ( opcao ){
             case 1:
                 extrato();
                 break;
             case 2: 
                 if (saques<6){
                     System.out.print("Quanto deseja sacar: ");
                     valor = entrada.nextDouble();
                     sacar (valor);
                     
                 } else{
                     System.out.println("limite de saques diarios atingidos.\n");
                    
                 }
                 break;
             case 3:
                 System.out.println("Quanto deseja depositar: ");
                 valor = entrada.nextDouble();
                 depositar (valor);
                 break;
             case 4:
                 System.out.println("Sistema incerrado");
                 break;
             default:
                 System.out.println("Opçao invalida");
                    
         }
         
      }
     
}
