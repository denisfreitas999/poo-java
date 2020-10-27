/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciacontasbanco;

/**
 *
 * @author denis
 */
public class Conta {
    // Declarações
    String nomeTitular;
    int numeroConta;
    String agencia;
    double saldo;
    String dataDeAbertura;
    
    //Funções
    boolean saca(double valor){
        if(this.saldo < valor){
            return false;
        }else{
            this.saldo -= valor;
            return true;
        }
    }
    
    void deposita(double valor){
        this.saldo += valor;
    }
    
    double rendimento(){
        this.saldo *= 0.1;
        return this.saldo;
    }
    
   String recuperaDadosParaImpressao(){
       String dados;
       dados = "Titular: " + this.nomeTitular;
       dados += "\nConta: " + this.numeroConta;
       dados += "\nAgência: " + this.agencia;
       dados += "\nSaldo: " + this.saldo;
       dados += "\nData de abertura: " + this.dataDeAbertura;
       dados += "\nSaldo: R$" + this.saldo;
       dados += "\nRendimento Mensal: R$" + this.rendimento();
       return dados;      
   }
    
}
