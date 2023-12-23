package subsistema2.cep;

public class CepApi {
    
private static CepApi instance =  new CepApi();
    
    // deixar o contrutor como privado
    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){
        return instance;
    }

    public String recuperarCidade(String cep){
        return "Olinda";
    }
    public String recuperarEstado(String cep){
        return "PE";
    }
}