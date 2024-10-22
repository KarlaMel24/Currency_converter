package Methods;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Query_currency {
    public String getConvertedAmount (String currencyInitial, String currencyDesired, int value){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/732ce398f5dc206b861de744/pair/"
                        + currencyInitial+ "/" + currencyDesired + "/" + value))
                .build();

        {
            try {
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                JsonObject responseJson = new Gson().fromJson(response.body(), JsonObject.class);
                double conversionResult = responseJson.get("conversion_result").getAsDouble();
                String lastDate = responseJson.get("time_last_update_utc").getAsString();
                return conversionResult + " the last time update utc is: " + lastDate;
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}