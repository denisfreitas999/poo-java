/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Scanner; // Importação do objeto Scanner.

/**
 *
 * @author denis
 */
    class Main {
        
        int elementos[];//estrutura que vai armazenar os elementos da pilha, vetor
        int topo;

        public Main(){ //construtor
            elementos = new int[10];
            topo = -1; //posição inválida do vetor
            }
        
        //empilha o elemento no topo da lista                 
        public void push(int e){
            //if(isFull()){
            //   throw new RuntimeException("Pilha cheia");
            //}
            topo++;
            elementos[topo] = e;
        }

        //desempilha o elemento no topo da lista
        public int pop(){ 
            if(isEmpty()){
              System.out.println("Pilha vazia");
            }
            //if(isEmpty()){
            //    throw new RuntimeException("Pilha vazia");
            //}
            int e;
            e = elementos[topo];
            topo--;
            return e;
        }

        //verifica se a pilha está vazia
        public boolean isEmpty(){ 
            if(topo == -1){
                //System.out.println("Pilha vazia");
                return true;
            }else{
                return false;
            }
        }

        //verifica se a pilha está cheia
        public boolean isFull(){ 
            if(topo == elementos.length - 1){
            //    System.out.println("Pilha cheia");
                return true;
            }else{
                return false;
            }
        }

        //retorna o elemento do topo da pilha
        public int top(){ 
            //if(isEmpty()){
            //    throw new RuntimeException("Pilha vazia");
            //
            return elementos[topo];
        }
        
        public int tamanhoPilha() {  
		return topo + 1;  
	}  
        
        
         
        
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
       
       String x;
       int n;
       int temp[];
       temp = new int[10];
       int contador = 0;
       int m = 0;
       
       ArrayList valores = new ArrayList();
       ArrayList valor = new ArrayList();

        do{
        x = leia.nextLine();
        if(x.equals("C")){  
            Main pilha = new Main();
              
               do{                   
                    x = leia.nextLine();
                  
                        if(x.equals("I")){
                        n = leia.nextInt();
                        pilha.push(n);
                        contador++;
                        valores.add(n);
                        
                        //for(int i = 0; i < contador ; i++){
                        //    temp[i] = n;
                        //}
                        
                    }

                    if(x.equals("R")){
                        
                        if(pilha.isEmpty()){
                            System.out.println("Pilha vazia");
                        }else{
                            pilha.pop();

                            //valores.clear();
                            int h = valores.size()-1;
                            if(h > -1){
                                valores.remove(valores.get(h));
                            }
                            
                        }
                    }
                        
                    if(x.equals("P")){                    
                            if(valores.isEmpty()){
                                System.out.println("Pilha vazia");
                            }else{
                            for (int k = 0; k < valores.size(); k++) { 
                                System.out.print(valores.get(k)+" ");                              
                            }
                            System.out.println("");
                        }
                    }
                    if(x.equals("C")){
                        System.out.println("Pilha já criada");
                    }
                    
                    }while(!x.equals("F"));
           }else if(x.equals("F")){
                break;
           }else{
               System.out.println("Pilha inexistente");
           }
        }
        while(!x.equals("F"));
            
            
       
        
    }
        
        
}
    

