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
        Scanner leia = new Scanner(System.in);
        float n = leia.nextFloat();
        float m = leia.nextFloat();
        float h[] = new float[4];
        float x[] = new float[3];
        float y[] = new float[6]; 
        for(int i = 0; i < 4; i++){
            h[i] = leia.nextFloat();
        }
        for(int i = 0; i < 3; i++){
            x[i] = leia.nextFloat();
        }
        
        for(int i = 0; i < 4; i++ ){
        
            for(int j = 0; j < 3; j++ ){           
                y[i] += x[i - j] * h[j];
                System.out.println(y[i]);
            }
        
        }
        
    }
        
        
}
    

