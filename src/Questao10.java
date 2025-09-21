import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int n = input.nextInt();

        System.out.println("Tabuada de " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        input.close();
    }
}
