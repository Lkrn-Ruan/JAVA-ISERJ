package testeprofessor;
public class Professor {
    private int Matricula;
    private String Nome;
    
    public Professor(){}
    public Professor(int Matricula,String Nome){
        this.Matricula=Matricula;
        this.Nome=Nome;
    }
    public int getMatricula(){
        return Matricula;
        }
    public void setMatricula(int Matricula){
        this.Matricula=Matricula;
    }
    public String getNome(){
    return Nome;
}
    public void setNome(String Nome){
        this.Nome=Nome;
    }
    public float getSalario(){
    return 0;
    }
    
    
}
