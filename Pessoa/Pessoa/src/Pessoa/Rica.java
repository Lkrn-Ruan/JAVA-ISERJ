package Pessoa;
public class Rica extends Pessoa {
	
    private double dinheiro;
       
    public double GetDinheiro(){
        return dinheiro;
    }
    public void SetDinheiro(double din){
        this.dinheiro = din;
    }
    public String fazCompras(){
        return "Comprando Ações";
    }
}