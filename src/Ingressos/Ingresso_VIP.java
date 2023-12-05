package Ingressos;

public class Ingresso_VIP extends Ingresso {

    private double adicional;

    public Ingresso_VIP() {
        super();
        this.adicional = 25;
    }


    public double valorVIP(){
        return (valor * 2) + adicional * 2;
    }
    @Override
    public void imprimeValor(){
        System.out.println("Valor do Ingresso VIP: R$,.2f\n" + valorVIP());
    }

    @Override
    public String tipoIngresso(){
        return "Ingresso VIP";
    }

    @Override
    public void ImprimeTudo(){
        System.out.println("Ingresso VIP:");
        System.out.println("Valor do Ingresso VIP: R$,.2f\n" + valorVIP());
    }

}
