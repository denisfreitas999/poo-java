package aula10poogustguanabara;
public class Aluno extends Pessoa{
    //Atributos
    private int matricula;
    private String curso;
    
    //Método Construtor

    public Aluno(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }
    
    //Métodos Públicos
    public void cancelarMatri(){
        System.out.println("Matrícula será cancelada");
    }
    
    //Métodos especiais

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
