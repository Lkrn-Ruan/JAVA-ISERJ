package ingresso;
/**
 *
 * @author Victor Manuel & Ruan Silva - 1302
 */
public class CamaroteSuperior extends Ingresso{
    double precoCS;
    
    public double ImprimeValor(){
        precoCS = getPreco()+60;
        return precoCS;
    }
}
