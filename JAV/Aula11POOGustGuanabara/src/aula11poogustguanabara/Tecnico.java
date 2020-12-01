package aula11poogustguanabara;
public class Tecnico extends Aluno{
    //Atributos
    private int registroProfissional;
    
    //Método Construtor

    public Tecnico(int registroProfissional, int matricula, String curso, String nome, int idade, String sexo) {
        super(matricula, curso, nome, idade, sexo);
        this.registroProfissional = registroProfissional;
    }
    
    
    //Métodos Públicos
    public void praticar(){
        System.out.println("O técnico " + this.getNome() + " está praticando." );
    }
    
    //Métodos Especiais

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
