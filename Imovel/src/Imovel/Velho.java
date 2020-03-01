package Imovel;
public class Velho extends Imovel{
    double pv;
    public double precoVelho(){
        pv = getPreco()*0.10;
        return pv;
    }
}
