import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;

        while ((senha = sc.nextInt()) != 1234)
            System.out.println("Senha incorreta. Tente novamente:");

        System.out.println("Acesso permitido.");
        sc.close();
    }
}
