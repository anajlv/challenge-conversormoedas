import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConversorMoedas {

    static final String API_KEY = "4865de82c47508cc5e185e5f";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Conversor de Moedas ====");
        System.out.println("Escolha uma opção:");
        System.out.println("1. Real para Dólar");
        System.out.println("2. Dólar para Real");
        System.out.println("3. Euro para Real");
        System.out.println("4. Real para Euro");
        System.out.println("5. Dólar para Euro");
        System.out.println("6. Euro para Dólar");
        int opcao = scanner.nextInt();

        System.out.print("Digite o valor a ser convertido: ");
        double valor = scanner.nextDouble();

        String base = "", target = "";

        switch (opcao) {
            case 1 -> { base = "BRL"; target = "USD"; }
            case 2 -> { base = "USD"; target = "BRL"; }
            case 3 -> { base = "EUR"; target = "BRL"; }
            case 4 -> { base = "BRL"; target = "EUR"; }
            case 5 -> { base = "USD"; target = "EUR"; }
            case 6 -> { base = "EUR"; target = "USD"; }
            default -> {
                System.out.println("Opção inválida!");
                return;
            }
        }

        String respostaJson = RequisicaoAPI.buscarCotacao(base);
        if (respostaJson == null) {
            System.out.println("Erro ao consultar a API.");
            return;
        }

        double taxa = ConversorJSON.extrairTaxa(respostaJson, target);
        double resultado = valor * taxa;

        System.out.printf("Valor convertido: %.2f %s\n", resultado, target);
    }
}