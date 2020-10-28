/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtimeexception;

import java.util.Scanner;

/**
 *
 * @author denis
 */
public class RuntimeException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ========== TRATAMENTO DE ERROS ====================================
        try{ //TENTE
            int valor1, valor2, resultado;

            Scanner leia = new Scanner(System.in);
            valor1 = leia.nextInt(); 
            valor2 = leia.nextInt();

            resultado = valor1/valor2;

            System.out.println("Resultado da divisão = " + resultado);
        }
        catch(NumberFormatException ex0){
            System.out.println("Forneça dois números");
        }
        catch(ArrayIndexOutOfBoundsException ex1){
            System.out.println("Forneça valores");
        }
        catch(ArithmeticException ex2){
            System.out.println("Divisão por zero");
        }
        catch(Exception e){
            System.out.println("Erro");
        }
        finally{
            System.out.println("Fim do programa");
        }
        
    }
    
}
