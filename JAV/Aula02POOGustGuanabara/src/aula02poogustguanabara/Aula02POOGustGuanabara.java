package aula02poogustguanabara;
public class Aula02POOGustGuanabara {


    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Vermelha";
        c1.ponta = 0.5f;
        c1.modelo = "Bic Crystal";
        c1.carga = 90;
        c1.status();
        c1.destampar();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.cor = "Preta";
        c2.ponta = 1.5f;
        c2.modelo = "Faber-Castell";
        c2.carga = 100;
        c2.status();
        c2.tampar();
        c2.rabiscar();
        
        
        
    }
        
}
