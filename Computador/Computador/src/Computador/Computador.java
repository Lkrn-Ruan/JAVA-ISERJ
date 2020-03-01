package Computador;
public class Computador {
    int Codigo; 
    String Marca;
    String Modelo;
    
    public void Marca(String Marca){
        this.Marca = Marca;
    }
    public void Codigo(int Codigo){
        this.Codigo = Codigo;
    }
    public void Modelo(String Modelo){
        this.Modelo = Modelo;
    }
    
    public void printComputador(){

        System.out.print("\n"+"Codigo: "+Codigo+"\n");
        System.out.print("Marca: "+Marca+"\n");
        System.out.print("Modelo: "+Modelo+"\n");
    }}

    

    