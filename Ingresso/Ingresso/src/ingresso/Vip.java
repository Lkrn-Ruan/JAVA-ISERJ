package ingresso;
/**
 *
 * @author Victor Manuel & Ruan Silva - 1302
 */
public class Vip extends Ingresso{
    double precoVip;
    
    public double ImprimeValor(){
        precoVip = getPreco()+20;
        return precoVip;
    }
}
