package testeprofessor;
public class ProfessorHorista extends Professor {
    private float ValorHora;
    private float HoraTrabalho;
    
    public ProfessorHorista(){}
    public ProfessorHorista(float ValorHora, float HoraTrabalho){
        this.ValorHora=ValorHora;
        this.HoraTrabalho=HoraTrabalho;
    }
    public float getValorHora(){
        return ValorHora;
    }
    public void setValorHora(float ValorHora){
        this.ValorHora=ValorHora;
    }
    public float getHoraTrabalho(){
        return HoraTrabalho;
    }
    public void setHoraTrabalho(float HoraTrabalho){
        this.HoraTrabalho=HoraTrabalho;
    }
    public float getSalario(){
        return this.ValorHora * this.HoraTrabalho;
    }
           
    
}
