/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscandonovosseguidores;

import java.util.Scanner;

/**
 *
 * @author denis
 */
public class BuscandoNovosSeguidores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
       
       int seguidores[] = new int[30];
       
       int numAtualSeg, numSegMeta, dias = 0;
       float media = 0, soma= 0;
       
       numAtualSeg = leia.nextInt();
       numSegMeta = leia.nextInt();
       
        //System.out.println(numAtualSeg);
        //System.out.println(numSegMeta);
        
        for (int i = 0; i < 30; i++) {
            seguidores[i] = leia.nextInt();
            soma += seguidores[i];
        }
        
        while(numAtualSeg < numSegMeta){
            for (int i = 0; (i < 30) && (numAtualSeg < numSegMeta) ; i++) {
               media =  (float) Math.ceil(soma / 30.0);
               numAtualSeg += media;
               soma = soma + (media - seguidores[i]);
               seguidores[i] = (int) media;
               ++dias;
            }  
        }
        
        System.out.println(dias);
    }
    
}
