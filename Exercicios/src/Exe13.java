import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = 0;

        System.out.print("Digite uma nota entre 0 e 10: ");
        senha = sc.nextInt();

        while (senha < 0  10) {
            System.out.println("Nota Inválida!");
            System.out.print("Nota Válida: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido!");
        sc.close();
    }
}