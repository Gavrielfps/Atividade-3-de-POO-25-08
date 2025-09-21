import java.util.ArrayList;
import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        while (true) {
            System.out.print("Digite uma nota (-1 para sair): ");
            double nota = input.nextDouble();
            if (nota == -1) break;
            notas.add(nota);
        }

        int qtd = notas.size();
        System.out.println("Quantidade de valores lidos: " + qtd);

        System.out.print("Valores: ");
        for (double n : notas) System.out.print(n + " ");
        System.out.println();

        System.out.println("Valores invertidos:");
        for (int i = qtd-1; i >= 0; i--) System.out.println(notas.get(i));

        double soma = 0;
        for (double n : notas) soma += n;
        double media = soma / qtd;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        int acimaMedia = 0, abaixoSete = 0;
        for (double n : notas) {
            if (n > media) acimaMedia++;
            if (n < 7) abaixoSete++;
        }

        System.out.println("Valores acima da média: " + acimaMedia);
        System.out.println("Valores abaixo de sete: " + abaixoSete);

        System.out.println("Programa encerrado.");

        input.close();
    }
}
