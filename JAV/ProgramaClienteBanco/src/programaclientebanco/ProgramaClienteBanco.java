/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaclientebanco;

/**
 *
 * @author denis
 */
class Cliente{
    String nome;
    String sobrenome;
    String cpf;
}
class Conta{
    int numero;
    double saldo;
    //Cliente titular;
    Cliente titular = new Cliente();
}
public class ProgramaClienteBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta minhaConta = new Conta();
        //Cliente c = new Cliente();
        minhaConta.titular.nome = "Denisson";
        System.out.println(minhaConta.titular.nome);
        Conta meuSonho = new Conta();
        meuSonho.titular.nome = "Carlos";
        System.out.println(meuSonho.titular.nome);
    }
    
}
