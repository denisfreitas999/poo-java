package JAVA;


/**
 * DeclararVariaveis
 */
public class DeclararVariaveis {

    public static void main(String[] args) {
        
        //Formas de declaração de variáveis em JAVA

        //============Declaração de atribuição simples==============
        int idade = 3;
        float salario = 975.35f;
        char letra = 'G';
        boolean casado = false;
        System.out.println(idade);
        System.out.println(salario);
        System.out.println(letra);
        System.out.println(casado);
         

        //============Declaração com typecast================
        int idade2 = (int) 23;
        float salario2 = (float) 858.56;
        char letra2 = (char) 'G';
        boolean casado2 = (boolean) true;
        System.out.println(idade2);
        System.out.println(salario2);
        System.out.println(letra2);
        System.out.println(casado2);
    
    
        

        //=============Declaração com Classes, Wrapper Class===================
        Integer idade3 = new Integer(27); // New cria um objeto, idade não é uma variável e sim um objeto o 27 é um valor inteiro
        System.out.println(idade3);        // colocad dentro do objeto
        Float salario3 = new Float(1586.83);
        System.out.println(salario3);
        Character letra3 = new Character('G');
        System.out.println(letra3);
        Boolean casado3 = new Boolean(true);
        System.out.println(casado3);
    }
}