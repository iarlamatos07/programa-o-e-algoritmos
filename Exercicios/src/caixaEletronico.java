import java.util.Scanner;
public class caixaEletronico {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 1000;
        int senhaC = 4321;
        int senha;

    System.out.print("\n-- Bem Vindo ao Caixa Eletrônico --\n");

    while (true) {
        System.out.print("\nDigite sua senha: ");
        senha = sc.nextInt();

        if (senha == senhaC) {
            break;
        }
        System.out.println("Senha Incorreta. Tente novamente.");

        }
    }
}
