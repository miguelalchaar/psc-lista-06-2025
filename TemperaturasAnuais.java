import java.util.ArrayList;
import java.util.Scanner;

public class TemperaturasAnuais {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> temperaturas = new ArrayList<Double>();
        String[] nomesMeses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        System.out.println("-> Digite a temperatura média de cada mês do ano (°C): ");

        for (int i = 0; i < 12; i++) {
            System.out.print("> Temperatura média de " + nomesMeses[i] + ": ");
            double temp = sc.nextDouble();
            temperaturas.add(temp);
        }

        double somaDasTemperaturas = 0;
        for (double soma : temperaturas) {
            somaDasTemperaturas += soma;
        }

        double mediaAnual = somaDasTemperaturas / temperaturas.size(); 

        System.out.println("\n----------------------------------------");
        System.out.printf("Média anual das temperaturas: %.2f°C\n", mediaAnual);
        System.out.println("----------------------------------------\n");

        System.out.println("-> Temperaturas acima da média anual:");

        boolean acimaMedia = false;
        for (int i = 0; i < temperaturas.size(); i++) {
            
            if (temperaturas.get(i) > mediaAnual) {

                System.out.printf("%d - %s: %.2f°C\n", (i + 1), nomesMeses[i], temperaturas.get(i));
                acimaMedia = true;
            }
        }

        if (!acimaMedia) {
            System.out.println("Nenhuma temperatura ficou acima da média anual.");
        }

        sc.close(); 
    }
}