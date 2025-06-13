import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro maior que zero: ");
        int N = sc.nextInt();

        while (N <= 0) {
            System.out.print("Número inválido. Digite um número inteiro maior que zero: ");
            N = sc.nextInt();
        }

        int contador = 1;
        while (contador <= N) {
            System.out.println("Participante número: " + contador++);
        }

        sc.close();
    }
}
