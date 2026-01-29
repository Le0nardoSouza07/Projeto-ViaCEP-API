import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCEPService {

    public CEP buscarCep(String cep) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String endereco = "https://viacep.com.br/ws/" + cep + "/json/";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() != 200) {
                throw new CepInvalidoException("O CEP informado é inválido");
            }
            CEPJson cepJson = gson.fromJson(response.body(), CEPJson.class);
            if (cepJson.erro()) {
                throw new CepInvalidoException("CEP não encontrado");
            }
            CEP cepObj = new CEP(cepJson);
            return cepObj;
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro ao consultar o CEP");
        }
    }
}
