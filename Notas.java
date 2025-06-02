import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();
        double entrada;

        System.out.println("Digite as notas (-1 para encerrar):");

        while (true) {
            System.out.print("> ");
            entrada = sc.nextDouble();

            if (entrada == -1) {
                break;
            }

            notas.add(entrada);
        }

            int quantidade = notas.size();

            double soma = 0;
            for (double nota : notas) {
                soma += nota;
            }

            double media = soma / quantidade;

            System.out.println("\nQuantidade de notas: " + quantidade);

            System.out.print("\n> Notas na ordem original: ");
            for (double nota : notas) {
                System.out.print(nota + "\t");
            }
            System.out.println();

            System.out.print("\n> Notas na ordem inversa: ");
            for (int i = notas.size() - 1; i >= 0; i--) {
                System.out.print(notas.get(i) + "\t");
            }
            System.out.println();

            System.out.println("\n> Soma das notas: " + soma);
            System.out.printf("Média das notas: %.2f\n", media);

            int acimaDaMedia = 0;
            int abaixoDeSete = 0;

            for (double nota : notas) {
                if (nota > media) {
                    acimaDaMedia++;
                }
                if (nota < 7) {
                    abaixoDeSete++;
                }
            }

            System.out.println("Quantidade de notas acima da média: " + acimaDaMedia);
            System.out.println("Quantidade de notas abaixo de sete: " + abaixoDeSete);
            System.out.println("\n>>>> Programa encerrado. Obrigado! <<<<");
            
            sc.close();
        }
    }
