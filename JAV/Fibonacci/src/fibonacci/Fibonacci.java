/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author denis
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fibo fibonacci = new Fibo();
        for(int i = 1; i <= 6 ; i++){
            int resultado = fibonacci.calculaFibonacci(i);
            System.out.print(resultado + " ");
    }
    }
    
}
