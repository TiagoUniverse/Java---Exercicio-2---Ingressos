package Ingressos;

public class CamaroteSuperior extends Ingresso_VIP{

    protected String localizacao;

    public CamaroteSuperior() {
        super();
        this.localizacao = "Parte superior do palco";
    }

    public String imprimir_localizacao(){
        return localizacao;
    }

    @Override
    public double imprimeValor(){
        return preco + 700;
    }
}
