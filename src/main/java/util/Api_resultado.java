package util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import model.Resultado;

public class Api_resultado  {

    public String request() {
        String url = "https://apiloterias.com.br/app/resultado?loteria=timemania&token=AAB1k4dlp9YHD51";

        try {

            URI endereco = URI.create(url);
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();
            System.out.println(body);

            Resultado resultado = new Resultado();
            ObjectMapper mapper = new ObjectMapper();
            String atributos = mapper.readValue(body, resultado.class);
            System.out.println(atributos);
            return body;

        } catch (IOException | InterruptedException ex) {
            throw new RuntimeException(ex);
        }

    }
}
