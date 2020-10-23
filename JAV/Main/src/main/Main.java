/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner; // Importação do objeto Scanner.

/**
 *
 * @author denis
 */
    class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner (System.in); // Leitor de variável tipo o Scanf do C.
        int valor = leia.nextInt();
        String resultado = (valor % 2 == 0) ? valor + " é PAR" : valor + " é IMPAR"; // operador Ternário
        System.out.println(resultado);
    }
    
}
