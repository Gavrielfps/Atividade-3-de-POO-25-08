import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] sistemas = {
                "Windows Server",
                "Unix",
                "Linux",
                "Netware",
                "Mac OS",
                "Outro"
        };

        int[] votos = new int[6];

        while (true) {
            System.out.println("1-Windows\n" +
                    "2-unix\n" +
                    "3-linux\n" +
                    "4-netware\n" +
                    "5-macos\n" +
                    "6-outro\n");
            System.out.print("Qual o melhor SO para servidores? (1-6, 0 encerra): ");
            int voto = input.nextInt();
            if (voto == 0) break;
            if (voto >= 1 && voto <= 6) {
                votos[voto-1]++;
            } else {
                System.out.println("Opção inválida!");
            }
        }

        int total = 0;
        for (int v : votos) total += v;

        System.out.println("\nSistema Operacional     Votos   %");
        System.out.println("------------------------------------");
        int vencedor = 0;
        for (int i = 0; i < votos.length; i++) {
            double perc = (total == 0) ? 0 : (votos[i] * 100.0 / total);
            System.out.printf("%-20s %5d   %.1f%%%n", sistemas[i], votos[i], perc);
            if (votos[i] > votos[vencedor]) vencedor = i;
        }
        System.out.println("------------------------------------");
        System.out.println("Total de votos: " + total);
        System.out.println("\nO Sistema Operacional mais votado foi o " +
                sistemas[vencedor] + ", com " + votos[vencedor] +
                " votos, correspondendo a " +
                (votos[vencedor] * 100.0 / total) + "% dos votos.");

        input.close();
    }
}
