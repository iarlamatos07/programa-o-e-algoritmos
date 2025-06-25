import java.util.Scanner;
public class VetorFor {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        numeros[0] = 1;
        numeros[1] = 8;
        numeros[2] = 7;
        numeros[3] = 11;
        numeros[4] = 9;
        numeros[5] = 5;
        numeros[6] = 77;
        numeros[7] = 30;
        numeros[8] = 12;
        numeros[9] = 4;

        for (int i = 0; i <= 10; i++) {
            System.out.println("Valor: " + numeros[i]);
        }
    }
}