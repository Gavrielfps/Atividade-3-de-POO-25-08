import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = input.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = input.nextDouble();

        double media = (n1 + n2) / 2;

        if (media == 10) {
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        input.close();
    }
}
