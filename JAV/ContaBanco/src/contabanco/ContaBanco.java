package contabanco;
public class ContaBanco {
    public static void main(String[] args) {
        CriaConta c1 = new CriaConta();
        c1.abreConta("cc", "Jubileu", 1111);
        c1.estadoAtual();
        
        CriaConta c2 = new CriaConta();
        c2.abreConta("cp", "Creuza", 2222);
        c2.estadoAtual();
    } 
}
