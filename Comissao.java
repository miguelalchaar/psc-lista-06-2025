import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Comissao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> salarios = new ArrayList<>();

        System.out.println("Digite as vendas brutas dos vendedores (-1 para encerrar):");

        while (true) {
            System.out.print("Vendas brutas: R$");
            double vendas = sc.nextDouble();

            if (vendas == -1) {
                break;
            }

            double salario = 200 + (0.09 * vendas);
            salarios.add(salario);
        }

        int[] faixas = new int[9];

        for (double salario : salarios) {
            int indice;

            if (salario >= 1000) {
                indice = 8;
            } else {
                indice = (int) salario / 100 - 2;
            }

            if (indice >= 0 && indice < faixas.length) {
                faixas[indice]++;
            }
        }

        System.out.println("\n>>> Distribuição dos salários: <<<");

        String[] intervalos = {
            "R$200 - R$299", 
            "R$300 - R$399", 
            "R$400 - R$499",
            "R$500 - R$599",
            "R$600 - R$699",
            "R$700 - R$799",
            "R$800 - R$899",
            "R$900 - R$999",
            "R$1000 em diante"
        };

        for (int i = 0; i < faixas.length; i++) {
            System.out.println(intervalos[i] + ": " + faixas[i] + " vendedor(es)");
        }

        sc.close();
    }
}
