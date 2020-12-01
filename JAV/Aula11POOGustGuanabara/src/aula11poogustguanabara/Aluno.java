package aula11poogustguanabara;
public class Aluno extends Pessoa{
    //Atributos
    private int matricula;
    private String curso;
    
    //Método Construtor

    public Aluno(int matricula, String curso, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    
    //Métodos Públicos
    public void pagarMensalidade(){
        System.out.println("O aluno " + this.getNome() + " pagou a mensalidade.");
    }
    
    //Métodos Especiais

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    

}
