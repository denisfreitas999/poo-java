package aula11poogustguanabara;
public class Professor extends Pessoa{
    //Atributos
    private String especialidade;
    private float salario;
    
    //Método Construtor

    public Professor(String especialidade, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = 1500f;
    }
    
    
    //Métodos Públicos
    public void recebeAumento(float valor){
        this.salario += valor;
    }
    //Métodos Especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
