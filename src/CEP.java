public class CEP {
    private String cep;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private int ddd;

    @Override
    public String toString() {
        return  "CEP: " + cep +
                "\nRua: " + rua  +
                "\nBairro: " + bairro +
                "\nCidade: " + cidade  +
                "\nEstado: " + estado +
                "\nDDD: " + ddd;
    }

    public CEP(CEPJson cepEmJson) {
        this.cep = cepEmJson.cep();
        this.rua = cepEmJson.logradouro();
        this.bairro = cepEmJson.bairro();
        this.cidade = cepEmJson.localidade();
        this.estado = cepEmJson.estado();
        this.ddd = cepEmJson.ddd();
    }
}
