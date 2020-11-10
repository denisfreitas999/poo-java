/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novapilha;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author denis
 */
public class NovaPilha {

    int elementos [];
    int topo;
    
    public NovaPilha(int n){
        elementos = new int[n];
        topo = -1;
    }
    
    public void empilha(int e){
        topo++;
        elementos[topo] = e;
    }
    
    public int desempilha(){
        int e;
        e = elementos[topo];
        topo--;
        return e;   
    }
    
    public boolean estaVazia(){
        return topo == -1;       
    }
    
    public boolean estaCheia(){
        if(topo == elementos.length - 1){
                System.out.println("Pilha cheia");
                return true;
            }else{
                return false;
            }
    }
    
    public int elementoTopo(){
        return elementos[topo];
    }
    
    public int tamanhoDaPilha(){
        return topo + 1;    
    }
    
    public static void main(String[] args) {

       Scanner leia = new Scanner(System.in);
       int capacidade = 0;
       int n;
       String x = "";
       ArrayList valores = new ArrayList();
       
       do{
           x = leia.nextLine();
           
           String partes[] = x.split(" ",2);
           String aux = partes[0];
           //System.out.println(aux);
           if(aux.equals("C")){
                capacidade = Integer.parseInt(partes[1]);
                //System.out.println(capacidade);
                NovaPilha pilha = new NovaPilha(capacidade);
               while(!x.equals("F")){
                    x = leia.nextLine();
                    switch(x.charAt(0)){
                        case 'C':            
                            System.out.println("Pilha já criada");                    
                            break; 
                        case 'I':
                            if(!pilha.estaCheia()){
                                String particao[] = x.split(" ",2);
                                n = Integer.parseInt(particao[1]);
                                pilha.empilha(n);
                                valores.add(n);
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
                        case 'R':
                            if(pilha.estaVazia()){
                                System.out.println("Pilha vazia");
                            }else{
                                pilha.desempilha();
                                int h = valores.size()-1;
                                if(h > -1){
                                    valores.remove(valores.get(h));
                                }
                            }
                            break;
                        default:
                            break;   
                    }
                }
           }else if(x.equals("F")){
               break;
           }else{
               System.out.println("Pilha inexistente");
           }
           
       }while(!x.equals("F"));
       
       
    }   
}
