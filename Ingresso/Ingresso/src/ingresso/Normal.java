package ingresso;
/**
 *
 * @author Victor Manuel & Ruan Silva - 1302
 */
public class Normal extends Ingresso{
    double valoNormal;
    
    public double ImprimeValor(){
        valoNormal = getPreco();
        return valoNormal;
    }
}
