public class ContaBancaria implements Conta {
  
   private String cliente;
   private int num_conta;
   private float saldo;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public ContaBancaria(String cliente, int num_conta, float saldo){
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }
    
    public void saque (float sacado){
       if(this.saldo-sacado<0){
           System.out.println("Valor invalido");
       }else{
           this.saldo = saldo - sacado;
       }
    }
       
    public void deposito (float depositado){
        this.saldo = this.saldo + depositado;
    }
        

}    
    
  
  