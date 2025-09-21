import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Montar a tabuada de: ");
        int n = input.nextInt();
        System.out.print("Começar por: ");
        int inicio = input.nextInt();
        System.out.print("Terminar em: ");
        int fim = input.nextInt();

        System.out.println("Vou montar a tabuada de " + n + " começando em " + inicio + " e terminando em " + fim + ":");
        for (int i = inicio; i <= fim; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        input.close();
    }
}
