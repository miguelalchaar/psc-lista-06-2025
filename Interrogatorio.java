import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Interrogatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> perguntas = new ArrayList<>();
        List<String> nomesSuspeitos = new ArrayList<>();
        List<String> classificacoes = new ArrayList<>();

        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        mostrarInstrucoes();

        char repetir;

        do {
            System.out.print("\nDigite o nome do interrogado: ");
            String nome = sc.next();
            nomesSuspeitos.add(nome);

            int respostasPositivas = 0;

            for (String pergunta : perguntas) {
                System.out.println("\n" + pergunta);
                System.out.print("> ");
                int resposta = sc.nextInt();

                if (resposta == 1) {
                    respostasPositivas++;
                }
            }

            String classificacao;
            if (respostasPositivas == 2) {
                classificacao = "Suspeita";
            } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
                classificacao = "Cúmplice";
            } else if (respostasPositivas == 5) {
                classificacao = "Assassino";
            } else {
                classificacao = "Inocente";
            }

            classificacoes.add(classificacao);

            System.out.println("\n>>>> Deseja entrevistar mais um suspeito? <<<<");
            System.out.print("resposta (S/N): ");
            repetir = sc.next().toLowerCase().charAt(0);

        } while (repetir == 's');

        System.out.println("\n>>>> RELATÓRIO FINAL <<<<");
        for (int i = 0; i < nomesSuspeitos.size(); i++) {
            System.out.println(nomesSuspeitos.get(i) + " -> " + classificacoes.get(i));
        }

        sc.close();
    }

    public static void mostrarInstrucoes() {
        System.out.println("--- BEM-VINDO AO INTERROGATÓRIO -----");
        System.out.println("Por favor, responda a cada pergunta digitando o número correspondente:");
        System.out.println(" 1 para SIM");
        System.out.println(" 2 para NÃO");
        System.out.println("-------------------------------------\n");
    }
}
