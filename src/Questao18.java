import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] perguntas = {
                "Telefonou para a vítima?",
                "Esteve no local do crime?",
                "Mora perto da vítima?",
                "Devia para a vítima?",
                "Já trabalhou com a vítima?"
        };

        int cont = 0;
        for (String p : perguntas) {
            System.out.print(p + " (s/n): ");
            String resp = input.next().toLowerCase();
            if (resp.equals("s")) cont++;
        }

        if (cont == 2) {
            System.out.println("Classificação: Suspeita");
        } else if (cont == 3 || cont == 4) {
            System.out.println("Classificação: Cúmplice");
        } else if (cont == 5) {
            System.out.println("Classificação: Assassino");
        } else {
            System.out.println("Classificação: Inocente");
        }

        input.close();
    }
}
