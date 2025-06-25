import java.util.Scanner;
public class pesquisaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = 1, contador = 0;

        System.out.println("Digite as idades dos alunos (0 para encerrar):");

        while (idade != 0) {
            System.out.print("Informe a idade: ");
            if ((idade = sc.nextInt()) != 0) contador++;
        }

        System.out.println("\nQuantidade de alunos entrevistados: " + contador);
        sc.close();
    }
}