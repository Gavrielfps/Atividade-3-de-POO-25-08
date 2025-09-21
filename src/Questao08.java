import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da sua hora: ");
        double valorHora = input.nextDouble();
        System.out.print("Digite a quantidade de horas no mês: ");
        double horas = input.nextDouble();

        double salarioBruto = valorHora * horas;
        double ir = 0;
        String percIR = "Isento";

        if (salarioBruto <= 900) {
            ir = 0;
            percIR = "Isento";
        } else if (salarioBruto <= 1500) {
            ir = salarioBruto * 0.05;
            percIR = "5%";
        } else if (salarioBruto <= 2500) {
            ir = salarioBruto * 0.10;
            percIR = "10%";
        } else {
            ir = salarioBruto * 0.20;
            percIR = "20%";
        }

        double inss = salarioBruto * 0.10;
        double sindicato = salarioBruto * 0.03;
        double fgts = salarioBruto * 0.11;

        double totalDesc = ir + inss + sindicato;
        double salarioLiquido = salarioBruto - totalDesc;

        System.out.printf("Salário Bruto: (%.2f * %.2f) : R$ %.2f%n", valorHora, horas, salarioBruto);
        System.out.printf("(-) IR (%s) : R$ %.2f%n", percIR, ir);
        System.out.printf("(-) INSS (10%%) : R$ %.2f%n", inss);
        System.out.printf("(-) Sindicato (3%%) : R$ %.2f%n", sindicato);
        System.out.printf("FGTS (11%%) : R$ %.2f%n", fgts);
        System.out.printf("Total de descontos : R$ %.2f%n", totalDesc);
        System.out.printf("Salário Líquido : R$ %.2f%n", salarioLiquido);

        input.close();
    }
}
