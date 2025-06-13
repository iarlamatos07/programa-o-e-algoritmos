import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        Scanner objeto = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = objeto.nextDouble();

        if (nota < 5) {
            System.out.println("Insatisfatório");
        } else if (nota >= 5 && nota <= 6.9) {
            System.out.println("Regular");
        } else if (nota >= 7 && nota <= 8.9) {
            System.out.println("Bom");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Excelente");
        } else {
            System.out.println("Tipo de nota inválida");
        }

        objeto.close();
    }
}
