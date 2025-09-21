import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double valor = input.nextDouble();

        if (valor > 0) {
            System.out.println("O número é positivo.");
        } else if (valor < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
        input.close();
    }
}
