/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programawhile;

import java.util.Scanner;

/**
 *
 * @author denis
 */
public class ProgramaWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Digite um número inteiro de 1 a 20: ");
        Scanner leia = new Scanner(System.in);
        int numero = leia.nextInt();
        
        while(numero < 20){
            numero++;
            if((numero == 10) || (numero == 15)){
                continue; // interrompe o fluxo natural e retorna pro looping
            }
            if(numero == 18){
                break; // interrompe o fluxo natural do programa e sai do looping.
            }
            System.out.println(numero + "cambalhotas");
        }
    }
    
}
        