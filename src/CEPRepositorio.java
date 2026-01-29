import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CEPRepositorio {
    public void salvarCep(ArrayList<CEP> cepsBuscados) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            FileWriter arquivoCeps = new FileWriter("ceps.txt");
            arquivoCeps.write(gson.toJson(cepsBuscados));
            arquivoCeps.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar os CEPs no arquivo");
        }
    }
}
