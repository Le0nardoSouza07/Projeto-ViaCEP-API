import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        ArrayList<CEP> cepsBuscados = new ArrayList<>();
        ViaCEPService servico = new ViaCEPService();
        CEPRepositorio repositorio = new CEPRepositorio();
        System.out.println("CONSULTOR DE CEP");
        String cep = " ";
        while (!cep.equalsIgnoreCase("sair")){
            System.out.println("Digite o CEP ou 'SAIR' para fechar a aplicação: ");
            cep = input.nextLine();
            if (cep.equalsIgnoreCase("SAIR")){
                break;
            }
            try {
                CEP cepObj = servico.buscarCep(cep);
                cepsBuscados.add(cepObj);
                System.out.println(cepObj);
            }catch (CepInvalidoException e){
                System.out.println(e.getMessage());
            }
        }
        repositorio.salvarCep(cepsBuscados);
    }

}