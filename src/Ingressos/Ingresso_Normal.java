package Ingressos;

public class Ingresso_Normal extends Ingresso{

    public Ingresso_Normal() {
        super();
    }

    public void imprimeTipo(){
        System.out.println("Ingresso normal");
    }
    @Override
    public void ImprimeTudo() {
        System.out.println("Ingresso Normal:");
        System.out.println("Valor do Ingresso VIP: R$,.2f\n" + valor);
    }
}
