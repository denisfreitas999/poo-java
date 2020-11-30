/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import java.util.*;
import java.lang.Math;

/**
 *
 * @author denis
 */



//====================================================================
class Avaliador { //começa aqui
    private int topo;
    private boolean vet [];

    Avaliador (int n) {
        vet = new boolean[n];
        topo = 0;
    }

    public boolean toBoolean (String s) {
        if (s.equals("true")) {
            return true;
        }
        else {
            return false;
        }
    }

    public void empilha (boolean dado) {
        vet[topo++] = dado;
    }

    public void desempilha (String operador) {
        if (operador.equals ("^")) {
            boolean op1 = vet[topo-2];
            boolean op2 = vet[topo-1];
            topo = topo -2;
            vet[topo++] = op1 && op2;
        }
        else if (operador.equals ("v")) {
            boolean op1 = vet[topo-2];
            boolean op2 = vet[topo-1];
            topo = topo -2;
            vet[topo++] = op1 || op2;
        }
        else if (operador.equals ("=>")) {
            boolean op1 = vet[topo-2];
            boolean op2 = vet[topo-1];
            topo = topo -2;
            vet[topo++] = !op1 || op2;
        }
        else if (operador.equals ("<=>")) {
            boolean op1 = vet[topo-2];
            boolean op2 = vet[topo-1];
            topo = topo -2;
            vet[topo++] = (!op1 || op2) && (op1 || !op2);
        }
        else {
            boolean op1 = vet[topo-1];
            topo = topo -1;
            vet[topo++] = !op1;
        }
        
    }

    public boolean getResult () {
        if (topo > 0)
            return vet[topo-1];
        else
            return false;
    }

    public boolean eval (String s, String prop[][]) {
        String tokens[] = s.split(",");
        Avaliador p = new Avaliador (tokens.length);
        for (int i=0; i<tokens.length; i++) {
            if (tokens[i].equals("^"))
                p.desempilha("^");
            else if (tokens[i].equals("v"))
                p.desempilha("v");
            else if (tokens[i].equals("=>"))
                p.desempilha("=>");
            else if (tokens[i].equals("<=>"))
                p.desempilha("<=>");
            else if (tokens[i].equals("~"))
                p.desempilha("~");
            else if (tokens[i].equals("true") ||
                     tokens[i].equals("false"))
                p.empilha(Boolean.parseBoolean(tokens[i]));
            else {
                for (int j=0; j<prop.length; j++)
                    if (prop[j][0].equals(tokens[i])){
                        p.empilha(Boolean.parseBoolean(prop[j][1]));
                        break;
                    }
            }  
        }
        return p.getResult();
    }
} // termina aqui
//===============================================================


class TabelaSimbolos{
  String[] simbolos;
  int aux;
  int aux2;
  //String[][] instancias = new String[(int) Math.pow(2,simbolos.length)][2];

  TabelaSimbolos(int maxsimbolos){
    simbolos = new String[maxsimbolos];
  }
  void insert(String proposicao){
    if(simbolos[aux] != proposicao){
      simbolos[aux] = proposicao;
    }
    aux++;
  } 
  
  String next(String arr []){
    
  }
}

class Prova {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String entrada = "";
    while(!entrada.equals("F")){
      
      entrada = sc.nextLine();
      String expressoes[] = entrada.split(",");
      int q_prop = 0;

      for(int i =0;i<expressoes.length;i++){
        if(!expressoes[i].equals("v") && !expressoes[i].equals("^") && !expressoes[i].equals("~") && !expressoes[i].equals("=>") && !expressoes[i].equals("<=>") && !expressoes[i].equals("true") && !expressoes[i].equals("false")){
          q_prop++;
        }
      }

      TabelaSimbolos tabela = new TabelaSimbolos(q_prop);

      for(int i =0;i<expressoes.length;i++){
        if(!expressoes[i].equals("v") && !expressoes[i].equals("^") && !expressoes[i].equals("~") && !expressoes[i].equals("=>") && !expressoes[i].equals("<=>") && !expressoes[i].equals("true") && !expressoes[i].equals("false")){
          tabela.insert(expressoes[i]);
        }
      }

      System.out.println(Arrays.deepToString(tabela.simbolos));
      //System.out.println(q_prop);



    }
  }
}