package Transporte;
public class Carro extends Terrestre {
    private final String cor;
    private final String placa;
    private int marcha;
    
    public Carro(String ncor, String nplaca){
        
        super(4);
        cor = ncor;
        placa = nplaca;
        marcha = 0; 
    }
    public int GetMarcha(){
        return marcha;
    }
    public void TrocarMarcha(int novaMarcha){
        marcha = novaMarcha;
    }
    public void Acelerar(){
        velocidade += marcha * 10;
    }
    public void Frear(){
        velocidade -= marcha * 10;
    }
}
