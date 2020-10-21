/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author denis
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //float nota = (float) 8.5; //pode ser escrito assim ou como se localiza abaixo
        //float nota2 = 8.7f;
        //float nota3 = 8.0f;
        //String nome = "Denisson";
        //System.out.println("A nota é: " + nota);
        //System.out.println("A nota é: " + nota2);
        //System.out.printf("A nota de %s é %.1f \n", nome, nota3);
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota4 = teclado.nextFloat();
        System.out.printf("A nota de %s é %.1f \n", nome, nota4);
        /*
        import java.until.Scanner;
        Scanner teclado = new Scanner(System.in);
        int idade = teclado.nextInt();
        float salario = teclado.nextFloat();
        String nome = teclado.nextLine();
        
        
        */
        
    }
    
}
