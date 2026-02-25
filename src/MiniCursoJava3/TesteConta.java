package MiniCursoJava3;

import java.util.Scanner;
import java.time.LocalDateTime;

public class TesteConta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- Cadastro de Conta ---");

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = leitor.nextDouble();
        Conta cc = new Conta(saldoInicial);

        System.out.print("Digite o número da agência: ");
        cc.setAgencia(leitor.nextInt());

        System.out.print("Digite o número da conta: ");
        cc.setNumero(leitor.nextInt());

        leitor.nextLine(); 

        // entrada dados cliente
        System.out.print("Digite o nome do cliente: ");
        String nome = leitor.nextLine();

        System.out.print("Digite a idade: ");
        int idade = leitor.nextInt();

        System.out.print("O cliente tem nome sujo? (true/false): ");
        boolean nomeSujo = leitor.nextBoolean();
        //dados
        cc.setDataAbertura(LocalDateTime.now());
        cc.setCliente(new Cliente(nome, idade, nomeSujo));

        // resultados
        System.out.println("\n--- Dados Cadastrados ---");
        System.out.println("Saldo: " + cc.recuperarSaldo());
        System.out.println("Cliente: " + cc.getCliente().getNome());
        System.out.println("Data de Abertura: " + cc.getDataAbertura());

        // operacao do saque
        System.out.print("\nQuanto deseja retirar? ");
        double valorSaque = leitor.nextDouble();
        cc.retirar(valorSaque);

        System.out.println("Novo saldo após saque: " + cc.recuperarSaldo());

        leitor.close();
    }
}
