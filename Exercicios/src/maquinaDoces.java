import java.util.Scanner;
public class maquinaDoces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo;
        System.out.print("Insira o valor de crédito inicial: R$ ");
        saldo = sc.nextDouble();

        while (saldo >= 1.00) {
            System.out.println("\nMENU DE PRODUTOS:");
            System.out.println("1- Bala (R$ 1.00)");
            System.out.println("2- Chocolate (R$ 2.50)");
            System.out.println("3- Refrigerante (R$ 4.00)");
            System.out.println("4- Sair");
            System.out.printf("Saldo atual: R$ %.2f\n", saldo);
            System.out.print("Escolha um produto: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    if (saldo >= 1.00) {
                        saldo -= 1.00;
                        System.out.println("Você comprou uma bala!");
                    } else {
                        System.out.println("Crédito insuficiente para bala.");
                    }
                    break;
                case 2:
                    if (saldo >= 2.50) {
                        saldo -= 2.50;
                        System.out.println("Você comprou um chocolate!");
                    } else {
                        System.out.println("Crédito insuficiente para chocolate.");
                    }
                    break;
                case 3:
                    if (saldo >= 4.00) {
                        saldo -= 4.00;
                        System.out.println("Você comprou um refrigerante!");
                    } else {
                        System.out.println("Crédito insuficiente para refrigerante.");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando compras...");
                    saldo = 0; // Finaliza o loop
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        System.out.printf("\nSaldo restante: R$ %.2f\n", saldo);
        System.out.println("Obrigado por utilizar a máquina de doces!");
        sc.close();
    }
}