package aula13poogustguanabara;
public class Aula13POOGustGuanabara {
    public static void main(String[] args) {
        Cachorro sancao = new Cachorro();
        sancao.setCorPelo("Preto");
        sancao.setIdade(14);
        sancao.setMembros(4);
        sancao.setPeso(40);
        sancao.emiteSons();
        sancao.reagir("toma comida");
        sancao.reagir(false);
        sancao.reagir(18, 0);
    }
    
}
