import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConversorJSON {

    public static double extrairTaxa(String json, String target) {
        JsonObject objeto = JsonParser.parseString(json).getAsJsonObject();
        JsonObject rates = objeto.getAsJsonObject("rates");
        return rates.get(target).getAsDouble();
    }
}