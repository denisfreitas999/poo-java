/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author denis
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean resultado;
        
        resultado = (x < y && y < z) ? true : false; // conjunção
        System.out.println(resultado);
        resultado = (x < y || y < z) ? true : false; // disjunção
        System.out.println(resultado);
        resultado = (x < y ^ y < z) ? true : false; // disjunção exclusiva
        System.out.println(resultado);
        resultado = (x < y && !(y < z)) ? true : false; // negação
        System.out.println(resultado);
    }
    
}
