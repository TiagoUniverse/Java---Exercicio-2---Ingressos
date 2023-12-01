package Ingressos;

public class Ingresso {

    protected double preco;

    public Ingresso() {
        this.preco = 200;
    }

    public double imprimeValor(){
        return this.preco;
    }

    public String tipoIngresso(){
        return null;
    }
}
