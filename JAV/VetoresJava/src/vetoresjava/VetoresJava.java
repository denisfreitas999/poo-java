/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetoresjava;

/**
 *
 * @author denis
 */
public class VetoresJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3,2,8,7,5,4};
        System.out.println("O total de casas de n é: "+ n.length);
        for(int i = 0; i < n.length - 1; i++){
            System.out.print(n[i]+" ");
        }
            
    }
    
}
