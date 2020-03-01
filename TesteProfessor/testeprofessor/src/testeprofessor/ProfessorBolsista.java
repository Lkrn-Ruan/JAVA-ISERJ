package testeprofessor;
public class ProfessorBolsista extends Professor {
    private float ValorBolsa;
    public ProfessorBolsista(){}
    public ProfessorBolsista(float ValorBolsa){
    this.ValorBolsa=ValorBolsa;
}
    public float getValorBolsa(){
    return ValorBolsa;
    }
    public void setValorBolsa(float ValorBolsa){
        this.ValorBolsa=ValorBolsa;
    }
    public float getSalario(){
    return this.getValorBolsa();
    }
}

