package aula11poogustguanabara;
public class Aula11POOGustGuanabara {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa("Denisson", 23, "Masculino"); Classes abstratas não podem ser 
        //implementadas
        

        // herança pobre de implementação   
        Visitante v1 = new Visitante("Visitante 1", 23, "Masculino"); 
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno(1111, "Informática", "Kaguya", 21, "Feminino");
        System.out.println(a1.toString());
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista (1112, "Informática", "Mayumi", 21, "Feminino");
        b1.pagarMensalidade();
    }
    
}
