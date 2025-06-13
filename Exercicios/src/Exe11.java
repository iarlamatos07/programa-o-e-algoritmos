import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        int soma = 0;
        int contador = 1;

        while (contador <= 5) {
            soma += contador;
            contador++;
        }

        System.out.println("A soma dos cinco primeiros números inteiros positivos é: " + soma);
    }
}
