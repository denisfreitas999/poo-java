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
public class GerenciaContasBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //====================== CONTA 01 ==================================
        Conta conta01 = new Conta();
        conta01.saldo = 1000;
        conta01.nomeTitular = "Denisson";
        conta01.agencia = "555-77";
        conta01.numeroConta = 999;
        conta01.dataDeAbertura = "27/10/2020";
        
        //====================== CONTA 02 ==================================
        Conta conta02 = new Conta();
        conta02.saldo = 1000;
        conta02.nomeTitular = "Denisson";
        conta02.agencia = "555-77";
        conta02.numeroConta = 999;
        conta02.dataDeAbertura = "27/10/2020";
        
        //====================== CONTA 03 ==================================
        Conta conta03 = new Conta();
        conta01 = conta03;
        
        //============================ INÍCIO TESTES ======================
        /*
        //saldo inicial
        System.out.println("Saldo inicial: R$" + conta01.saldo);
        
        //operação de saque
        conta01.saca(300);
        System.out.println("Saldo após o saque: R$" + conta01.saldo);
        
        //operação de deposito
        conta01.deposita(500);
        System.out.println("Saldo após o depósito: R$" + conta01.saldo);
        
        //rendimento
        System.out.println("Rendimento: R$" + conta01.rendimento());
        */
        //=========================== FIM TESTES =============================
        
        //===Utilizando o sout para exibição diretamente na classe main  ======
        /*
        conta01.deposita(500);
        System.out.println("Saldo Atual: R$" + conta01.saldo);
        System.out.println("Rendimento mensal: R$" + conta01.rendimento());
        System.out.println("Nome do titular: " + conta01.nomeTitular);
        System.out.println("Número da agência: " + conta01.agencia);
        System.out.println("Número da conta: " + conta01.numeroConta);
        System.out.println("Data de abertura: " + conta01.dataDeAbertura);
        */
        
        System.out.println(conta02.recuperaDadosParaImpressao());
        System.out.println(""); // pula linha
        
        // ==================== TESTES DE COMPARAÇÃO 01 ======================
        if(conta01 == conta02){
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }
        
        System.out.println(""); // pula linha
        
        // ==================== TESTES DE COMPARAÇÃO 02 ======================       
        if(conta01 == conta03){
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }

        
        
    }
    
}
