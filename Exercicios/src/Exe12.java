import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = 0;

        System.out.print("Digite a senha: ");
        senha = sc.nextInt();

        while (senha != 1234) {
            System.out.println("Senha incorreta!");
            System.out.print("Digite a senha novamente: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido!");
        sc.close();
    }
}