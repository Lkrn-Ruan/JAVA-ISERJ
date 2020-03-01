package Animal;
public class Animal {
	
    private String nome;
    private String raca;
	
	public Animal(){
}
    public String GetNome(){
    return nome;
}
    public void SetNome(String nom){
    nome = nom;
}
    public String GetRaca(){
    return raca;
}
    public void SetRaca(String rac){
    raca = rac;
}



    public static void main(String[] args) {
        Gato felino = new Gato();
        Cachorro cao = new Cachorro();
        
        cao.SetLate("AU-AU");
        cao.SetNome("Tron");
        cao.SetRaca("Pastor Alemão");
        
        felino.SetMia("MIAU");
        felino.SetNome("Estevan");
        felino.SetRaca("Siberiano");
                
        
        System.out.println("Nome: "+felino.GetNome());
        System.out.println("Raça: "+felino.GetRaca());
        System.out.println("Barulho: "+felino.GetMia());
        
        System.out.println("Nome: "+cao.GetNome());
        System.out.println("Raça: "+cao.GetRaca());
        System.out.println("Barulho: "+cao.GetLate());
        
}
}