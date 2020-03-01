package testeprofessor;
public class Testeprofessor {
    public static void main(String[]args){
        ProfessorFixo prof1= new ProfessorFixo();
        ProfessorHorista prof2 = new ProfessorHorista();
        ProfessorBolsista prof3 = new ProfessorBolsista();
        
        prof1.setMatricula(1);
        prof1.setNome("Adriano");
        prof1.setSalario(1848);
        
        prof2.setMatricula(2);
        prof2.setNome("Josue");
        prof2.setValorHora(14);
        prof2.setHoraTrabalho(6);
        
        prof3.setMatricula(3);
        prof3.setNome("Vagner");
        prof3.setValorBolsa(70);
        
        System.out.println("Nome do Professor 1 é: "+prof1.getNome());
        System.out.println("Salario do Professor 1 é: "+prof1.getNome());
        System.out.println("\nNome do Professor 2 é: "+prof2.getNome());
        System.out.println("Salario do Professor 2 é: "+prof2.getNome());
        System.out.println("\nNome do Professor 3 é: "+prof3.getNome());
        System.out.println("Salario do Professor 3 é: "+prof3.getNome());
    }
    
}
