package aula13poogustguanabara;
public class Cachorro extends Lobo{
    //Métodos Públicos
    @Override
    public void emiteSons() {
        System.out.println("Sons de Cachorros");
    }
    
    public void reagir(String frase){
            if("toma comida".equals(frase) || "Olá".equals(frase)){
            System.out.println("Abanar e latir");
        }else{
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int hora, int min){
        if (hora < 12) {
            System.out.println("Abanar");
        }else if(hora >= 18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e Latir");
        }
    }
    
    public void reagir(boolean dono){
        if (dono) {
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar e Latir");
        }
    }
    
}
