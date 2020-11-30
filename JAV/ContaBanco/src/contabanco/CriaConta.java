package contabanco;


public class CriaConta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public CriaConta(){
        this.status = false;
        this.saldo = 0;
    }
    
    public void abreConta(String tipoDeConta, String nome, int num){
        setNumConta(num);
        setDono(nome);
        setStatus(true);
        setTipo(tipoDeConta);
        if("cc".equals(getTipo())){
            setSaldo(50f);
        }
        if("cp".equals(getTipo())){
            setSaldo(150f);
        }
    }
    public void fechaConta(){
        if(getSaldo() == 0){
            setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }else if(getSaldo() > 0){
            System.out.println("Existe saldo em sua conta, é necessário sacá-lo: R$ " + getSaldo());
        }else{
            System.out.println("Existem pedencias em sua conta: R$ " + getSaldo());
        }
    }
    
    public void depositar(float valor){
        if(isStatus() == true && valor > 0f){
          setSaldo(getSaldo() + valor) ;  
        }else{
            System.out.println("Deposito indisponível, conta inexistente ou valor de deposito nulo/negativo.");
        }  
    }
    
    public void sacar(float valor){
        if(isStatus() == true && valor > 0){
            setSaldo(getSaldo() - valor) ;
        }else{
            System.out.println("Saque indisponível, conta inexistente ou valor de saque nulo/negativo.");
        }
    }
    
    public void pagarMensal(){
        if("cc".equals(getTipo())){
            setSaldo(getSaldo() - 12f);
        }
        if("cp".equals(getTipo())){
            setSaldo(getSaldo() - 20f);
        }
    }
    
    public void estadoAtual(){
        System.out.println("------------------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: R$ " + this.getSaldo());
        System.out.println("Status: " + isStatus());
    }
    //=================================================================

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
