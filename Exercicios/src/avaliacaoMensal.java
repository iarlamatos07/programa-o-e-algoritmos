import  java.util.Scanner;
public class avaliacaoMensal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;

        // Repita para sempre até alguém mandar parar
        while (true) {
        System.out.println("Digite a nota da Avaliação Mensal (valor entre 0 e 10):");
        nota = sc.nextDouble();

            if (nota >= 0 && nota <= 10){
                System.out.println(nota + " é uma Nota Válida.");

                    //pare o laço
                    break;
        }   else {
                System.out.println(nota + " é uma Nota Inválida." + "Tente Novamente!\n");
        }
    }
        sc.close();
}

}
