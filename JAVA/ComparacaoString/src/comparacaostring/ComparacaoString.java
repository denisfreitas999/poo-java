/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author denis
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Denisson";
        String nome2 = "Denisson"; 
        String nome3 = new String("Denisson");
        String resultado;
        resultado = (nome1 == nome2) ? "Igual" : "Diferente";
        System.out.println(resultado);
         resultado = (nome1 == nome3) ? "Igual" : "Diferente";
         System.out.println(resultado); 
         //O resultado da comparação é diferente pois eles não possuem a mesma
         //estrutura, ou seja, nome1 se trata de uma variável e nome 3 de um 
         //objeto.
         resultado = (nome1.equals(nome3)) ? "Igual" : "Diferente";
         System.out.println(resultado); 
    }
    
}
