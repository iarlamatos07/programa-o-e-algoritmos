import java.util.Scanner;
public class conceitoNota {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Entre com a nota do aluno: ");
            double nota = sc.nextDouble();

            if (nota > 0 && nota < 60){
                System.out.println("Conceito: F");
            } else if (nota >= 60 && nota <= 69) {
                System.out.println("Conceito: D");
            } else if (nota >= 70 && nota <= 79) {
                System.out.println("Conceito: C");
            } else if (nota >= 80 && nota <= 89) {
                System.out.println("Conceito: B");
            } else if (nota >= 90 && nota <= 100){
                System.out.println("Conceito: A");
            } else {
                System.out.println("Nota Inválida");
            }
    }
}

