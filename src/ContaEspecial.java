public class ContaEspecial extends Conta{
    private double chequeEspecial;

    public ContaEspecial(Pessoa titular, String nro, String agencia, int banco, double chequeEspecial) {
        super(titular, nro, agencia, banco);
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public boolean saque(double valor) {
        if(valor > 0 && (super.getSaldo() - valor) >= -getChequeEspecial()){
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
