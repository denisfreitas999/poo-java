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
       
       String x = "";
       int n;
       
       ArrayList valores = new ArrayList();

        do{
        x = leia.nextLine();
        if(x.equals("C")){  
            Main pilha = new Main();
              
               while(!x.equals("F")){  
                    x = leia.nextLine();
                    switch(x.charAt(0)){
                        case 'I':
                            if(!pilha.isFull()){
                                String partes[] = x.split(" ",2);
                                n = Integer.parseInt(partes[1]);
                                pilha.push(n);
                                valores.add(n);
                  
                            }
                            break;
                        case 'R':
                                if(pilha.isEmpty()){
                                    System.out.println("Pilha vazia");
                                }else{
                                    pilha.pop();
                                    int h = valores.size()-1;
                                    if(h > -1){
                                        valores.remove(valores.get(h));
                                    }
                                }
                                break;
                        case 'P':
                            if(valores.isEmpty()){
                                System.out.println("Pilha vazia");
                            }else{
                            for (int k = 0; k < valores.size(); k++) { 
                                System.out.print(valores.get(k)+" ");                              
                            }
                            System.out.println("");
                            }
                            break;
                    
                        case 'C':
                            System.out.println("Pilha já criada");
                    }
                    
                }
           }else if(x.equals("F")){
                break;
           }else{
               System.out.println("Pilha inexistente");
           }
        }
        while(!x.equals("F"));
            
    }
      
}
    

