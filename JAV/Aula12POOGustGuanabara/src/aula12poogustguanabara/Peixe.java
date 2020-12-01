package aula12poogustguanabara;
public class Peixe extends Animal {
    //Atributos
    private String corEscama;
    
    //Métodos Públicos
    public void soltarBolhas(){
        System.out.println("Peixe soltou bolhas");
    }
    
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    
    //Métodos Especiais

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
