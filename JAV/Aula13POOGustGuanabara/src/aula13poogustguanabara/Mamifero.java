package aula13poogustguanabara;
public class Mamifero extends Animal{
    //Atributos
    protected String corPelo;
    
    //Métodos Públicos
    @Override
    public void emiteSons() {
        System.out.println("Sons de mamíferos");
    }
    
    //Métodos Especiais

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
}
