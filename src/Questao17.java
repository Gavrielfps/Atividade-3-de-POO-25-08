import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qtdPrestacoes = 0;
        double totalPago = 0;

        while (true) {
            System.out.print("Digite o valor da prestação (0 para sair): ");
            double valor = input.nextDouble();
            if (valor == 0) break;

            System.out.print("Digite os dias de atraso: ");
            int dias = input.nextInt();

            double valorPago = valorPagamento(valor, dias);
            System.out.println("Valor a ser pago: R$ " + valorPago);

            qtdPrestacoes++;
            totalPago += valorPago;
        }

        System.out.println("\nRelatório do dia:");
        System.out.println("Quantidade de prestações: " + qtdPrestacoes);
        System.out.println("Valor total pago: R$ " + totalPago);

        input.close();
    }

    public static double valorPagamento(double valor, int dias) {
        if (dias == 0) {
            return valor;
        } else {
            return valor + (valor * 0.03) + (valor * 0.001 * dias);
        }
    }
}
