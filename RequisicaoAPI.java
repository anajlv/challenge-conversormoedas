import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RequisicaoAPI {

    public static String buscarCotacao(String base) {
        try {
            String urlString = "https://open.er-api.com/v6/latest/" + base;
            URL url = new URL(urlString);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            StringBuilder resposta = new StringBuilder();
            String linha;
            while ((linha = reader.readLine()) != null) {
                resposta.append(linha);
            }
            reader.close();

            return resposta.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}