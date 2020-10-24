/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetoresmesesdatas;

/**
 *
 * @author denis
 */
public class VetoresMesesDatas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Agos",
            "Set","Out","Nov","Dez"};
        int datas[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i = 0; i < mes.length; i++){
            System.out.println("O mês de "+ mes[i] +" têm "+ datas[i] +" dias.");
        }
    }
    
}
