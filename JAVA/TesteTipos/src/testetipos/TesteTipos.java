/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author denis
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int idade = 30;
        String valor = Integer.toString(idade); // classe invólocro Interger.toString transforma números inteiros em string
        System.out.println(valor);*/
        String valor = "30";
        int idade = Integer.parseInt(valor); // classe invólocro Interger.parseInt para transformar para inteiro e Float.parseFloat para transformar para Float.
        System.out.println(idade);
    }
    
}
