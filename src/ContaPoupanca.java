public class ContaPoupanca extends ContaCorrente{


    public ContaPoupanca(PessoaFisica titular, String nro, String agencia, int banco) {
        super(titular, nro, agencia, banco);
    }

    public boolean rendimento(){
        Double valorRendimento = (0.5 / 100) * super.getSaldo();

        super.setSaldo(super.getSaldo() + valorRendimento);
        return true;
    }
}
