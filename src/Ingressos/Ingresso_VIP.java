package Ingressos;

public class Ingresso_VIP extends Ingresso {

    public Ingresso_VIP() {
        super();
    }

    @Override
    public double imprimeValor(){
        return preco + 300;
    }

    @Override
    public String tipoIngresso(){
        return "Ingresso VIP";
    }
}
