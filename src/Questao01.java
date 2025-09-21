import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = input.nextDouble();

        if (n1 > n2) {
            System.out.println("O maior número é: " + n1);
        } else if (n2 > n1) {
            System.out.println("O maior número é: " + n2);
        } else {
            System.out.println("Os números são iguais.");
        }
        input.close();
    }
}