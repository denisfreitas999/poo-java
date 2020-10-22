/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author denis
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int n1 = 3;
        int n2 = 5;
        float m = (n1+n2)/2;
        System.out.format("A média é igual a: %.2f \n", m);
        System.out.println("A soma de n1 com n2 é: "+ m);
        */
        
        /*
        //pré-incremento
        int numero = 5;
        int valor = 5 + ++numero;
        System.out.println(valor);
        System.out.println(numero);
        
        //pós-incremento
        int num = 5;
        int valor2 = 5 + num++;
        System.out.println(valor2);
        System.out.println(num);
        */
        
        /*
        //Operadores de atribuição
        int x = 4;
        x += 2; // x = x + 2; portanto x = 4 + 2 = 6
        System.out.println(x);
        */
        
        /*
        //Classe Math
        double pi = Math.PI;
        System.out.println(pi);
        
        int elevadoDois = (int)Math.pow(5,2);
        System.out.println(elevadoDois);
        
        float raizQuadrada = (int)Math.sqrt(9);
        System.out.println(raizQuadrada);
       */
        
        /*
        //Arredondamentos
        
        float x = -2.49f;
        System.out.println(Math.abs(x));
        System.out.println(Math.floor(x));
        System.out.println(Math.ceil(x));
        System.out.println(Math.round(x));
        */
        
        
        //Gerador de números aleatórios de 0.0 a 1.0
        double aleatorio = Math.random();
        System.out.println(aleatorio);
        
        
        //Gerador de números de 1 até 6
        int dado = (int)(1 + aleatorio * (6-1));
        System.out.println(dado);
    }
    
}
