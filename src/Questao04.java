import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double a = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = input.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double c = input.nextDouble();

        double maior = Math.max(a, Math.max(b, c));
        System.out.println("O maior número é: " + maior);

        input.close();
    }
}
