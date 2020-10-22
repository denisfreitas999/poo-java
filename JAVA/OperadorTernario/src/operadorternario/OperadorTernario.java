/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author denis
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, resultado;
        n1 = 4;
        n2 = 8;
        
        resultado = (n1 > n2) ? 1 : 0;
        System.out.println(resultado);
        
        //O operador aceita fórmulas também:
        
        resultado = (n1 > n2) ? n1+n2 : n1-n2;
        System.out.println(resultado);
    }
    
}
