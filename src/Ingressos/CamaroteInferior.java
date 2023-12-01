package Ingressos;

public class CamaroteInferior extends Ingresso_VIP{

    protected String localizacao;

    public CamaroteInferior() {
        super();
        this.localizacao = "Parte inferior do palco";
    }

    public String imprimir_localizacao(){
        return  localizacao;
    }

    @Override

}
