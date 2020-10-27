/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

/**
 *
 * @author denis
 */
class Conta {
    int numero;
    String titular;
    double saldo;
    //... outros atributos ...
    
    //Método de sacar sem retorno
    /*
    void saca(double quantidade){
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }
    */
    //Método de sacar com retorno
    boolean saca(double valor){
        if(this.saldo < valor){
            return false;
        }else{
            this.saldo -= valor;
            return true;
        }
    }
    void deposita (double quantidade){
        this.saldo += quantidade;
    }
    
    //
    boolean transferePara(Conta destino, double valor){
        boolean retirou = this.saca(valor);
        if(retirou == false){
            //não deu pra sacar
            return false;
        }else{
            destino.deposita(valor);
            return true;
        }
    }
}
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Criando a conta
        Conta minhaConta;
        minhaConta = new Conta();
        
        //Criando segunda conta
        Conta meuSonho;
        meuSonho = new Conta();
        
        //Criando terceira conta
        //Conta testeConta;
        //testeConta = new Conta();
        
        //Alterando os valores de minhaConta
        minhaConta.titular = "Denisson";
        minhaConta.saldo = 1000.0;
        minhaConta.numero = 555;
        //System.out.println("Saldo Atual: R$"+ minhaConta.saldo);
        
        //Alterando os valores de meuSonho
        meuSonho.titular = "Freitas";
        meuSonho.saldo = 1500000;
        meuSonho.numero = 777;
        
        //Saca 200 reais.
        minhaConta.saca(200);
        System.out.println("Saldo Atual: R$"+ minhaConta.saldo);
        
        minhaConta.deposita(500);
        System.out.println("Saldo Atual: R$"+ minhaConta.saldo);
        
        Conta testeConta = minhaConta;
        testeConta.deposita(500);
        System.out.println(testeConta.saldo);
        
        meuSonho.transferePara(minhaConta, 100000);
        System.out.println("Saldo Atual: R$" + minhaConta.saldo);
        System.out.println(meuSonho.saldo);
        
    }
    
}
