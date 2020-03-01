package testacarro;
public class Carro {
    String Nome;
    String Montadora;
    String Categoria;
    double Custo;
    
    public Carro(String Nome){
        this.Nome = Nome;
    }
    public void Montadora(String Montadora){
        this.Montadora = Montadora;
    }
    public void Categoria(String Categoria){
        this.Categoria = Categoria;
    }
    public void Custo(double Custo){
        this.Custo=35000;
    }
    public void printCarro(){
        System.out.print("Nome do carro: "+Nome+"\n");
        System.out.print("Montadora: "+Montadora+"\n");
        System.out.print("Custo: "+Custo+"\n");
        System.out.print("Categoria: "+Categoria+"\n");
        
    }

    
}
