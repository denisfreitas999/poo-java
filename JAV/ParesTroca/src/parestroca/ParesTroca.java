/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parestroca;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author denis
 */
public class ParesTroca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int quantidadeDePares = leia.nextInt();
        int seed = leia.nextInt();
        
        Random numAleatorio = new Random();
        numAleatorio.setSeed(seed);
        String pares[][] = new String[quantidadeDePares][2];
         
        //System.out.println("==============================================");
        for(int i = 0; i < quantidadeDePares; i++){
            for (int j = 0; j < 2; j++) {
                pares[i][j] = leia.next();
                //System.out.print(pares[i][j] + " ");
            }
           // System.out.println("");
        }
        
   
        for (int i = 0; i < quantidadeDePares; i++) {
            int par_1 = numAleatorio.nextInt(quantidadeDePares);
            int combina_2 = numAleatorio.nextInt(2);  
            int par_2 = numAleatorio.nextInt(quantidadeDePares);
            String guarda = pares[par_2][combina_2];
            pares[par_2][combina_2] = pares[par_1][combina_2];
            pares[par_1][combina_2] = guarda;
        }
        
        for (int i = 0; i < quantidadeDePares; i++) {
            System.out.println(pares[i][0] + " " + pares[i][1]);
        }
        
    }
    
}
