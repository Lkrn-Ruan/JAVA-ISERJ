package testacachorro;
public class Cachorro {
    String Nome;
    int Idade;
    float Peso;
    public Cachorro(String Nome){
        this.Nome = Nome;
        }
    public void Idade(int Idade){
        this.Idade = Idade;
    }
    public void Peso(float Peso){
        this.Peso = Peso;
    }
    public void printCachorro(){
        System.out.printf("O cachorro %s, tem idade de %d anos e pesa %.2f Kilos",this.Nome,this.Idade,this.Peso);
    
}    

   
    
}
