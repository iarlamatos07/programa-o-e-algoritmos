import java.util.Scanner;
import java.util.Random;

public class Exe10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Informe sua IDADE: ");
        int idade = sc.nextInt();

        System.out.println("\nInforme o tipo de plano médico:\n1- Convênio\n2- Particular\n");
        int plano = sc.nextInt();
        String nomePlano = "";

        if (plano == 1){
            nomePlano = "Convênio";
           System.out.println("Seu plano: Convênio");
        }
        else if (plano == 2){
            nomePlano = "Particular";
           System.out.println("Seu plano: Particular");
        }
        else {
            System.out.println("Valor de plano inválido");

            System.exit(0);
        }

        System.out.println("\nInforme a especialidade desejada:\n1- Clinica Geral\n2- Pediatria\n3- Cardiologia\n4- Ortopedia\n");
        int especialidade = sc.nextInt();
        String nomeEspecialidade = "";

        switch (especialidade) {

            case 1: System.out.println("Especialidade: Clínica Geral"); nomeEspecialidade = "Clínica Geral";break;
            case 2: System.out.println("Especialidade: Pediatria"); nomeEspecialidade = "Pediatria"; break;
            case 3: System.out.println("Especialidade: Cardiologia"); nomeEspecialidade = "Cardiologia"; break;
            case 4: System.out.println("Especialidade: Ortopedia"); nomeEspecialidade = "Ortopedia"; break;
            case 5: System.out.println("Valor para Especialidade Inválido!"); System.exit(0); break;

        }

        System.out.println("\nIdade informada: " + idade);
        System.out.println("Plano médico escolhido: " + nomePlano);
        System.out.println("Especialidade: " + nomeEspecialidade);

        if (idade > 65){
            System.out.println("\nIDOSO: Atendimento Prioritário!");
        }
        else if (idade <= 12) {
            System.out.println("\nCRIANÇA: Atendimento Prioritário!");
        }
        else {
            System.out.println("\nAtendimento NORMAL!");
        }

        if (plano == 1 && idade < 60){
            System.out.println("ISENTO de taxa de consulta!");
        } else if (plano == 1 && idade > 60) {
            System.out.println("Taxa de consulta REDUZIDA: R$ 40,00.");
        } else {
            System.out.println("Taxa INTEGRAL de consulta: R$ 100,00.");
        }

        // Gerador de senha aleatória entre 1000 e 9999
        int senhaAleatoria = random.nextInt(9000) + 1000;
        System.out.println("\nSenha de atendimento: " + senhaAleatoria);

        System.out.println("Siga até a recepção para continuar seu procedimento. Obrigado(a)!");

        sc.close();
    }
}