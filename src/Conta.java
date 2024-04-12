public class Conta{
    private Pessoa titular;
    private String numero;
    private String agencia;
    private int banco;
    private double saldo;

    public Conta(Pessoa titular, String nro, String agencia, int banco){
        this.titular = titular;
        this.numero = nro;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = 0.0;
    }

    public Pessoa getTitular() {
        return this.titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String nro) {
        this.numero = nro;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getBanco() {
        return this.banco;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean depositar(double valor) {
        if(valor > 0){
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor){
        saldo -= valor;
        return true;
    }

    public boolean transferir(double valor, Conta contaDestino){
        contaDestino.depositar(valor);
        return true;
    }
}
