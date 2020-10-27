/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricadecarros;

/**
 *
 * @author denis
 */

class Motor{
    int potencia;
    String tipo;
}

class Carro{
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;
    Motor motor = new Motor();
    
    //liga o carro
    void liga() {
        System.out.println("O carro está ligado");
    }
    
    //acelera uma certa quantidade
    void acelera(double quantidade){
        double velocidadeNova = this.velocidadeAtual + quantidade;
        this.velocidadeAtual = velocidadeNova;
    }
    
    //devolve a marcha do carro
    int pegaMarcha(){
        if(this.velocidadeAtual < 0){
            return -1;
        }else if((this.velocidadeAtual >= 0) && (this.velocidadeAtual < 40)){
            return 1;
        }else if((this.velocidadeAtual >= 40) && (this.velocidadeAtual < 80)){
            return 2;
        }else{
            return 3;
        }
    }
}


public class FabricaDeCarros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro meuCarro = new Carro();
        meuCarro.cor = "Preto";
        meuCarro.modelo = "Brasilia Amarela";
        meuCarro.velocidadeAtual = 0;
        meuCarro.velocidadeMaxima = 80;
        meuCarro.motor.potencia = 220;
        meuCarro.motor.tipo = "V8";
        
        //liga carro
        meuCarro.liga();
        
        //acelara o carro
        meuCarro.acelera(20);
        System.out.println("A velocidade Atual é: " + meuCarro.velocidadeAtual);
        System.out.println(meuCarro.motor.potencia);
        
    }
    
}
