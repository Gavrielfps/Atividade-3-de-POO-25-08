import java.util.Scanner;
import java.util.Arrays;

public class Questao12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nome do atleta: ");
        String nome = input.nextLine();

        double[] saltos = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "º salto: ");
            saltos[i] = input.nextDouble();
        }

        System.out.println("\nAtleta: " + nome);
        System.out.println("Saltos: " + Arrays.toString(saltos));

        double melhor = Arrays.stream(saltos).max().getAsDouble();
        double pior = Arrays.stream(saltos).min().getAsDouble();

        double soma = 0;
        for (double s : saltos) soma += s;
        double media = (soma - melhor - pior) / 3;

        System.out.println("Melhor salto: " + melhor + " m");
        System.out.println("Pior salto: " + pior + " m");
        System.out.println("Média dos demais saltos: " + media + " m");
        System.out.println("\nResultado:");
        System.out.println(nome + ": " + media + " m");

        input.close();
    }
}
