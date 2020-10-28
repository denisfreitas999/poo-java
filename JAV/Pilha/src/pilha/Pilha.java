/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author denis
 */
public class Pilha {
    
    int elementos[];//estrutura que vai armazenar os elementos da pilha, vetor
    int topo;// indica o índice da posição do vetor em que se encontra o último
             // elemento da pilha
    public Pilha(){ //construtor
        elementos = new int[10];
        topo = -1; //posição inválida do vetor
    }
    
    //empilha o elemento no topo da lista
    public void push(int e){
        if(isFull()){
            throw new RuntimeException("Stack OverFlow!");
        }
        topo++;
        elementos[topo] = e;
    }
    
    //desempilha o elemento no topo da lista
    public int pop(){ 
        if(isEmpty()){
            throw new RuntimeException("Empty Stack!");
        }
        int e;
        e = elementos[topo];
        topo--;
        return e;
    }
    
    //verifica se a pilha está vazia
    public boolean isEmpty(){ 
        if(topo == -1){
            return true;
        }else{
            return false;
        }
    }
    
    //verifica se a pilha está cheia
    public boolean isFull(){ 
        if(topo == elementos.length - 1){
            return true;
        }else{
            return false;
        }
    }
    
    //retorna o elemento do topo da pilha
    public int top(){ 
        if(isEmpty()){
            throw new RuntimeException("Empty Stack!");
        }
        return elementos[topo];
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Pilha p = new Pilha();
            
       for(int i =1; i < 6 ; i++){
           p.push(i);
       }
        
        while(!p.isEmpty()){
            int elemento = p.pop();
            System.out.println("Desempilhei o: "+elemento);
        }
        
        int e = p.pop();
        
    }
    
}
