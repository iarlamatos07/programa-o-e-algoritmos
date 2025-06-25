import java.util.Scanner;
public class contagemParticipantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro maior que zero: ");
        int numero = sc.nextInt();
        int contador = 1;

        while (contador <= numero){
            System.out.println("Participante número: " + contador);
            contador++;
        }

        sc.close();

    }
}
