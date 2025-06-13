import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        Scanner objeto = new Scanner(System.in);

        System.out.print("Digite a nota do aluno para obter o conceito: ");
        double notaAluno = objeto.nextDouble();

        if (notaAluno < 60) {
            System.out.println("Conceito: F");
        } else if (notaAluno >= 60 && notaAluno <= 69) {
            System.out.println("Conceito: D");
        } else if (notaAluno >= 70 && notaAluno <= 79) {
            System.out.println("Conceito: C");
        } else if (notaAluno >= 80 && notaAluno <= 89) {
            System.out.println("Conceito: B");
        } else {
            System.out.println("Conceito: A");
        }

        objeto.close();
    }
}