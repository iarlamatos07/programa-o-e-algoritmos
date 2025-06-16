import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo;

        System.out.print("Insira o valor de crédito inicial: R$ ");
        saldo = sc.nextDouble();

        int opcao = 0;

        while (saldo >= 1.00 && opcao != 4) {
            System.out.println("\n--- Menu de Produtos ---");
            System.out.println("1 - Bala (R$ 1.00)");
            System.out.println("2 - Chocolate (R$ 2.50)");
            System.out.println("3 - Refrigerante (R$ 4.00)");
            System.out.println("4 - Sair");
            System.out.printf("Seu saldo atual: R$ %.2f\n", saldo);
            System.out.print("Escolha um produto (1 a 4): ");
            opcao = sc.nextInt();

            double preco = 0;

            switch (opcao) {
                case 1:
                    preco = 1.00;
                    break;
                case 2:
                    preco = 2.50;
                    break;
                case 3:
                    preco = 4.00;
                    break;
                case 4:
                    System.out.println("Encerrando compras.");
                    continue;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            if (saldo >= preco) {
                saldo -= preco;
                System.out.print("Você comprou um(a) ");
                switch (opcao) {
                    case 1: System.out.print("Bala"); break;
                    case 2: System.out.print("Chocolate"); break;
                    case 3: System.out.print("Refrigerante"); break;
                }
                System.out.printf(". Saldo restante: R$ %.2f\n", saldo);
            } else {
                System.out.println("Saldo insuficiente para essa compra.");
            }
        }

        if (saldo < 1.00) {
            System.out.println("Saldo insuficiente para novas compras.");
        }

        System.out.printf("Compra finalizada. Saldo restante: R$ %.2f\n", saldo);
        sc.close();
    }
}
