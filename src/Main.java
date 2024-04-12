import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PessoaJuridica pj01 = new PessoaJuridica("João", "Av. Silvia QD:07", "(64) 99111-1111)", "00.000.000/0000-00");
        PessoaJuridica pj02 = new PessoaJuridica("Mathias", "Av. Silvia QD:07", "(64) 99222-2222)", "11.111.111/1111-11");
        PessoaJuridica pj03 = new PessoaJuridica("Crhistian", "Av. Silvia QD:07", "(64) 99341-3793)", "33.333.333/3333-33");
        PessoaJuridica pj04 = new PessoaJuridica("Medeiros", "Av. Silvia QD:07", "(64) 99341-7777)", "44.444.444/4444-44");
        PessoaFisica pf01 = new PessoaFisica("Hugo", "Av. Silvia QD:07", "(64) 99555-0101)", "555.555.555-55");
        PessoaFisica pf02 = new PessoaFisica("Igor", "Av. Silvia QD:07", "(64) 99666-0202)", "666.666.666.66");
        PessoaFisica pf03 = new PessoaFisica("José", "Av. Silvia QD:07", "(64) 99341-7899)", "777.777.777-77");
        PessoaFisica pf04 = new PessoaFisica("Marcio", "Av. Silvia QD:07", "(64) 99341-4444)", "888.888.888-88");

        ContaCorrente cCor01 = new ContaCorrente(pj01, "11111111", "001", 01);
        ContaEmpresarial cEmp01 = new ContaEmpresarial(pj02, "11111111", "001", 01, 450);
        ContaEspecial cEsp01 = new ContaEspecial(pj03, "33333333", "001", 01, 480);
        ContaCorrente cPou01 = new ContaCorrente(pj04, "44444444", "002", 02);
        ContaPoupanca cCor02 = new ContaPoupanca(pf01, "55555555", "001", 01);
        //ContaEmpresarial cEmp02 = new ContaEmpresarial(pf02, "66666666", "002", 02, 550);
        ContaEspecial cEsp02 = new ContaEspecial(pf03, "77777777", "001", 01, 520);
        ContaPoupanca cPou02 = new ContaPoupanca(pf04, "88888888", "002", 02);

        imprimeContas(cCor01);
        imprimeContas(cEmp01);
        imprimeContas(cEsp01);
        imprimeContas(cPou01);
        imprimeContas(cCor02);
        //imprimeContas(cEmp02);
        imprimeContas(cEsp02);
        imprimeContas(cPou02);

        Scanner scan = new Scanner(System.in);

        int op = 1;
        while(op != 0){
            System.out.print("Digite um valor: ");
            op = scan.nextInt();

            if(op == 1){
                ValidaDeposito(cEsp01.depositar(100));
            } else if (op == 2) {
                ValidaSaque(cEsp01.sacar(100));
            }
            else if (op == 3) {
                ValidaTransferencia(cEsp01.transferencia(480, cEsp02));
            }
            imprimeContas(cEsp01);
            imprimeContas(cEsp02);
        }

    }

    public static void imprimeContas(Conta conta){
        System.out.println("\n\n==================== Contas ====================");
        System.out.println("Nome da Conta: "+conta.getTitular().getNome());
        System.out.println("CPF/CNPJ: "+conta.getTitular().getEndereco());
        System.out.println("Endereco: "+conta.getTitular().getEndereco());
        System.out.println("Telefone: "+conta.getTitular().getTelefone());
        System.out.println("Numero: "+conta.getNumero());
        System.out.println("Agencia: "+conta.getAgencia());
        System.out.println("Banco: "+conta.getBanco());
        System.out.println("Saldo R$: "+conta.getSaldo());
        System.out.println("================================================");
    }

    public static void ValidaTransferencia(Boolean verifica){
        if(verifica == true){
            System.out.println("\n\nTransferencia Realizada com Sucesso!");
        }else{
            System.out.println("\n\nTransferencia não realizada!");
        }
    }

    public static void ValidaSaque(Boolean verifica){
        if(verifica == true){
            System.out.println("\n\nSaque realizado com Sucesso!");
        }else{
            System.out.println("\n\nSaque não realizado!");
        }
    }

    public static void ValidaDeposito(Boolean verifica){
        if(verifica == true){
            System.out.println("\n\nDepósito Realizado com Sucesso!");
        }else{
            System.out.println("\n\nDepósito não realizado!");
        }
    }
}