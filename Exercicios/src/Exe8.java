import java.util.Scanner;
public class Exe8 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Temperatura corporal do paciente: ");
    double temperatura = sc.nextDouble();

    if (temperatura < 36){
        System.out.print("Possível Hipotermia!");
    } else if (temperatura >= 36 && temperatura <= 37.4) {
        System.out.print("Temperatura Normal!");        
    } else if (temperatura >= 37.5 && temperatura <= 38.5) {
        System.out.print("Febre Leve");
    } else if (temperatura >= 38.6 && temperatura <= 39.9) {
        System.out.print("Febre Alta");
    } else { System.out.print("Valor Irreal para Febre"); }
}

}
