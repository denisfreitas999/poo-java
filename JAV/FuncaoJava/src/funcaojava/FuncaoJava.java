/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcaojava;

/**
 *
 * @author denis
 */
public class FuncaoJava {

    /**
     * @param args the command line arguments
     */
    static  void soma(int a, int b){
        int s = a + b;
        System.out.println("A soma é: " + s);
    }
            
    static int multiplicacao(int a, int b){
        int s = a * b;
        return s;
    }       
    public static void main(String[] args) {
        // TODO code application logic here
        // main é um método
        // void, static, public são procedimentos
        //string[] argumento vetor como parâmetro
        System.out.println("Começou o programa:");
        soma(5,3);
        System.out.println("A multiplicação é: " + multiplicacao(5,3));
    }
    
}
