import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite N: ");
        int n = input.nextInt();

        double h = 0;
        for (int i = 1; i <= n; i++) {
            h += 1.0 / i;
        }

        System.out.println("O valor de H com " + n + " termos é: " + h);

        input.close();
    }
}
