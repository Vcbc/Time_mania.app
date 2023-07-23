package util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import model.Resultado;
import org.json.JSONObject;

public class Api_resultado  {

    public String request() {
        String url = "https://loteriascaixa-api.herokuapp.com/api/timemania/latest";

        try {

            URI endereco = URI.create(url);
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();
            System.out.println(body);
           
            
            // NO LAÇO FOR ESTOU TRANSFORMANDO A DEZENA DE OBJECT PARA STRING E PEDINDO QUAL O TIPO DA DEZENA
            // MAS PRECISO SETAR A DEZENA COMO INTEGER NO ATRIBUTO DEZENA DA CLASSE RESULTADO
            
           JSONObject objeto = new JSONObject(body);
           
           
            System.out.println(objeto.get("timeCoracao"));
            System.out.println(objeto.get("dezenas"));
            
            List <Object> dezenas = new ArrayList<>();
            
            for (Object dezena : objeto.getJSONArray("dezenas")) {
                dezenas.add(Integer.valueOf((String)dezena));
                
                System.out.println(dezenas);
                System.out.println(dezena.getClass());
                
            }
            Resultado resultado = new Resultado();
            
           System.out.println(resultado.getDezena1());
           
           
          
            return body;

        } catch (IOException | InterruptedException ex) {
            throw new RuntimeException(ex);
        }

    }
}
