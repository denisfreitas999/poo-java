package aula10poogustguanabara;
public class Aula10POOGustGuanabara {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Kagura", 21, "Feminino");
        Aluno p2 = new Aluno("Denisson", 23, "Masculino");
        Professor p3 = new Professor("Canuto", 44, "Masculino");
        Funcionario p4 = new Funcionario("TI", false , "Google", 27, "Masculino");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
