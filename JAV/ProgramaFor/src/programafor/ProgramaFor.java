/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programafor;

import java.util.Scanner;

/**
 *
 * @author denis
 */
public class ProgramaFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Insira o fatorial desejado: ");
        Scanner leia = new Scanner(System.in);
        int fatorial = leia.nextInt();
        
        int resultado = 1;
        for(int i = 1; i <= fatorial; ++i){
            
            resultado = resultado * i;           
        }
        System.out.println(resultado);
    }
    
}
