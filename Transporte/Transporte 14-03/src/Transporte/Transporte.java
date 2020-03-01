package Transporte;
public class Transporte {
    protected int capacidade;
    protected int velocidade;
        
    public Transporte(){
        velocidade = 0;
    }
    public int GetCapacidade(){
        return capacidade;
    }
    public void SetCapacidade(int cap){
        capacidade = cap;
    }
    public int GetVelocidade(){
        return velocidade;
    }
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Vermelho", "ABC-1234");
        Moto minhaMoto = new Moto("Preto", "XYZ-9876");
        
        meuCarro.TrocarMarcha(1);
        meuCarro.Acelerar();
        meuCarro.Acelerar();
        
        minhaMoto.TrocarMarcha(minhaMoto.GetMarcha()+1);
        minhaMoto.Acelerar();
        minhaMoto.TrocarMarcha(minhaMoto.GetMarcha()+1);
        minhaMoto.Acelerar();   
        
        System.out.println("Velocidade do Carro: "+meuCarro.GetVelocidade());
        System.out.println("Velocidade da Moto: "+minhaMoto.GetVelocidade());
        }
}