package Ingressos;

public abstract class Ingresso {

    protected double valor;

    public Ingresso() {
        this.valor = 200;
    }

    public void imprimeValor(){
        System.out.println("O preço do ingresso é: " + valor);
    }

    public String tipoIngresso(){
        return null;
    }

    public abstract void ImprimeTudo();
}
