import java.util.Scanner;

public class Exe17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int SENHA_CORRETA = 4321;
        double saldo = 1000.00;
        int senhaDigitada;

        System.out.println("=== Bem-vindo ao Caixa Eletrônico ===");

        // Loop de autenticação
        do {
            System.out.print("Digite sua senha: ");
            senhaDigitada = sc.nextInt();
            if (senhaDigitada != SENHA_CORRETA) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (senhaDigitada != SENHA_CORRETA);

        int opcao = 0;

        // Menu principal com while + switch
        while (opcao != 4) {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo atual é: R$ %.2f\n", saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double deposito = sc.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.printf("Depósito realizado. Novo saldo: R$ %.2f\n", saldo);
                    } else {
                        System.out.println("Valor inválido para depósito.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor para saque: R$ ");
                    double saque = sc.nextDouble();
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.printf("Saque realizado. Novo saldo: R$ %.2f\n", saldo);
                    } else {
                        System.out.println("Saque inválido. Verifique o valor.");
                    }
                    break;
                case 4:
                    System.out.println("Sessão encerrada. Obrigado por utilizar o caixa eletrônico.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}
