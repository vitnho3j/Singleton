public class Corrida {

    private Corrida(){};
    private static Corrida instance = new Corrida();
    public static Corrida getInstance(){
        return instance;
    }

    private String nomeCarro;
       private String nomePassageiroAtual;


    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeMotorista) {
        this.nomeCarro = nomeMotorista;
    }

    public String getNomeClienteAtual() {
        return nomePassageiroAtual;
    }

    public void setNomeClienteCarro(String nomePassageiro) {
        this.nomePassageiroAtual = nomePassageiro;
    }
}
