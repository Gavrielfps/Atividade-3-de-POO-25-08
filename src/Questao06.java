import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o turno (M/V/N): ");
        String turno = input.next().toUpperCase();

        switch (turno) {
            case "M":
                System.out.println("Bom Dia!");
                break;
            case "V":
                System.out.println("Boa Tarde!");
                break;
            case "N":
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Valor Inválido!");
        }
        input.close();
    }
}
