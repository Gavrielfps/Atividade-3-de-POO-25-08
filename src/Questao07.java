import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        double salario = input.nextDouble();
        double perc;

        if (salario <= 280) {
            perc = 20;
        } else if (salario <= 700) {
            perc = 15;
        } else if (salario <= 1500) {
            perc = 10;
        } else {
            perc = 5;
        }

        double aumento = salario * perc / 100;
        double novoSalario = salario + aumento;

        System.out.println("Salário antes do reajuste: R$ " + salario);
        System.out.println("Percentual aplicado: " + perc + "%");
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Novo salário: R$ " + novoSalario);

        input.close();
    }
}
