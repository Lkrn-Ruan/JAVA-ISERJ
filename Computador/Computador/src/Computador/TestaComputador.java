package Computador;
public class TestaComputador {
    public static void main(String[] args) {
        Computador computer1= new Computador();
        Computador computer2= new Computador();
        
        computer1.Marca("HP");
        computer1.Codigo(2);
        computer1.Modelo("NXY000");
        computer1.printComputador();
        
        computer2.Marca("ACER");
         computer2.Codigo(6);
        computer2.Modelo("YXU200");
        computer2.printComputador();
        
    }
    
}
