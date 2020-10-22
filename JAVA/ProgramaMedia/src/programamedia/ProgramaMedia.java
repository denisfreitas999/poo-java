/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author denis
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        float n1 = leia.nextFloat();
        System.out.println("Digite a segunda nota:");
        float n2 = leia.nextFloat();
        
        float media = (n1 + n2)/2;
        
        System.out.println("Sua média é: " + media);
        if (media > 9){
            System.out.println("Parabéns!");
        }
    }
    
}
