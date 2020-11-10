/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trocapares;

import java.util.*;
//import java.io.*;
//import java.lang.*;

/**
 *
 * @author denis
 */
    class TrocaPares {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        int quantidadePares = leia.nextInt();
        int seed = leia.nextInt();
        
        String pares[][] = new String[quantidadePares][2];
        Random aleatorio = new Random();
        aleatorio.setSeed(seed);
        
        for(int i = 0; i < quantidadePares; i++){
            for (int j = 0; j < 2; j++) {
                pares[i][j] = leia.next();
            }
        }
        
        System.out.println(Arrays.deepToString(pares)); //antes do sorteio
        
        for (int i = 0; i < quantidadePares; i++) {
            int par = aleatorio.nextInt(quantidadePares);
            int componente = aleatorio.nextInt(2);
            int par_2 = aleatorio.nextInt(quantidadePares);
            String aux = pares[par_2][componente];
            pares[par_2][componente] = pares[par][componente];
            pares[par][componente] = aux;
        }
        System.out.println(Arrays.deepToString(pares)); //após o sorteio
        
        for (int i = 0; i < quantidadePares; i++) {
            System.out.println(pares[i][0] + " " + pares[i][1]);
        }
    }
    
}
