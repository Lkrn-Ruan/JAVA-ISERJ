package Imovel;
public class Novo extends Imovel{    
    double pn;
        
    public double precoNovo(){
        pn = getPreco()*0.60;
        return pn;
    }
}
