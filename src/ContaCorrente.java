public class ContaCorrente extends Conta {

    public ContaCorrente(Pessoa titular, String nro, String agencia, int banco) {
        super(titular, nro, agencia, banco);
    }

    public boolean saque(double valor) {
        if(valor > 0 && super.getSaldo() >= valor){
            return super.sacar(valor);
        }
        return false;
    }

    public boolean transferencia(double valor, Conta destino) {
        if(this.saque(valor)){
            return super.transferir(valor, destino);
        }
        return false;
    }
}