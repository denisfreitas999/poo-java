package aula11poogustguanabara;
public class Bolsista extends Aluno{
    //Atributos
    private float bolsa;
    
    //Método Construtor
    public Bolsista(int matricula, String curso, String nome, int idade, String sexo) {
        super(matricula, curso, nome, idade, sexo);
    }
    
    //Métodos Públicos
    public void renovarBolsa(){
        System.out.println("Bolsa do aluno " + this.getNome() + " foi renovada.");
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("O aluno " + this.getNome() + " pagou mensalidade com desconto.");
    }
    //Métodos Especiais

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
    
}
