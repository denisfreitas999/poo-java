/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programadowhile;

import java.util.Scanner;

/**
 *
 * @author denis
 */
public class ProgramaDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite um número de 1 a 10");
        Scanner leia = new Scanner(System.in);
        int numero = leia.nextInt();
        do{
            ++numero;
            System.out.println(numero);
        }while(numero <8);
    }
    
}
