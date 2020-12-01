package aula09poogustguanabara;
public class Aula09POOGustGuanabara {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Denisson Freitas", 23, "Masculino");
        p[1] = new Pessoa("Kagura Freitas", 21, "Feminino");
        
        l[0] = new Livro("Harry Potter e a pedra filosofal", "J. K. Rowling", 264, p[1]);
        l[1] = new Livro("A menina que roubava livros", "Markus Zusak ", 468, p[0]);
        l[2] = new Livro("O menino do pijama listrado", "John Boyne", 192, p[0]);
        l[0].abrir();
        l[0].folhear(200);
        System.out.println(l[0].detalhes());
    }
    
}
