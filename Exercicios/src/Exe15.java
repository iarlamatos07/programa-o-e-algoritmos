import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        int contador = 0;

        System.out.println("Digite as idades dos alunos. Digite 0 para encerrar.");

        while (true) {
            System.out.print("Informe a idade: ");
            idade = sc.nextInt();

            if (idade == 0) {
                break;
            }

            contador++;
        }

        System.out.println("\nQuantidade de alunos entrevistados: " + contador);
        sc.close();
    }
}
