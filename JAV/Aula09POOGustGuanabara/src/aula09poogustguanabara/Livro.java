package aula09poogustguanabara;
public class Livro implements Publicacao{
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor; //Instância da classe pessoa. TAD
    
    //Métodos Públicos

    
    public String detalhes() {
        return "Livro{\n" + "  titulo=" + titulo + "\n, "
                + "autor=" + autor + "\n, "
                + "totPaginas=" + totPaginas + "\n, "
                + "pagAtual=" + pagAtual + "\n, "
                + "aberto=" + aberto + "\n, "
                + "leitor=" + leitor.getNome() + "\n, "
                + "leitor=" + leitor.getIdade() + "\n, "
                + "leitor=" + leitor.getSexo() + "\n}";
    }
    
    
    //Método Construtor

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }
    
    
    //Métodos Especiais
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    //

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if(this.aberto == true && p <= this.totPaginas  && p > 0){
            this.pagAtual = p;
        }else{
            System.out.println("Impossível folhear.");
            
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
