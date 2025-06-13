import java.util.Scanner;
public class Exe9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n1: segunda\n2: terça\n3: quarta\n4: quinta\n5: sexta\n6: sábado\n7: domingo");

        System.out.print("\n\nEntre com um número entre 1 e 7, relativo ao dia da semana, para saber qual departamento está funcionando hoje: ");
        int departamento = sc.nextInt();

        switch (departamento){

            case 1:
                System.out.print("Atendimento Geral!");
                break;
            case 2:
                System.out.print("Funcionando hoje: Suporte Técnico!");
                break;
            case 3:
                System.out.print("Funcionando hoje: Financeiro!");
                break;
            case 4:
                System.out.print("Funcionando hoje: Recursos Humanos!");
                break;
            case 5:
                System.out.print("Funcionando hoje: Vendas!");
                break;
            case 6:
                System.out.print("Funcionando hoje: Marketing!");
                break;
            case 7:
                System.out.print("Fechado (Final de Semana)!");
                break;
            default:
                System.out.print("Valor de Departamento Inválido!");
        }
    }
}
