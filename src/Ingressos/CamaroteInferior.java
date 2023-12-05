package Ingressos;

public class CamaroteInferior extends Ingresso_VIP{

    protected String localizacao;

    public CamaroteInferior() {
        super();
        this.localizacao = "Parte superior do palco";
    }

    public double valorTotal(){
        return (valor * 2);
    }

    public void imprimir_localizacao(){
        System.out.println("A localização do camarote se encontra em: " + localizacao);
    }

    @Override
    public void imprimeValor(){
        System.out.println("Valor do Ingresso VIP: R$,.2f\n" + valorTotal());
    }

    @Override
    public void ImprimeTudo(){
        System.out.println("Camarote Inferior");
        System.out.println("Valor do Ingresso VIP: R$,.2f\n" + valorTotal());
    }

}
