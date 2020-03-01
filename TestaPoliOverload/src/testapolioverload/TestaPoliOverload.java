package testapolioverload;
public class TestaPoliOverload {
    public static void main(String[] args) {
        
        DemoOverload somar = new DemoOverload();
        System.out.print("A)A soma entre X + Y é: "+somar.soma(2,3)+"\nB)A soma entre X + Y + Z é: "+somar.soma(2,3,4)+"\nC)A soma entre X + Y é: "+somar.soma(2,3.4)
                                                                                                                    +"\nD)A soma entre X + Y é: "+somar.soma(2.5,3)+"\n");
    }
    
}
