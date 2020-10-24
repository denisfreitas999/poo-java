/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetorforit;

import java.util.Arrays;

/**
 *
 * @author denis
 */
public class VetorForIt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double vetor[] = {3.5, 6.5, 9,-5.4};
        Arrays.sort(vetor); // coloca o vetor em ordem crescente    
        for (double valor: vetor){
            System.out.print(valor + " ");
        }
    }
    
}
