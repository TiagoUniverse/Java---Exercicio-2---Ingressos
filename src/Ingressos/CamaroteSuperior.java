package Ingressos;

public class CamaroteSuperior extends Ingresso_VIP{
    protected String localizacao;

    public CamaroteSuperior() {
        super();
        this.localizacao = "Parte superior do palco";
    }

    public double valorTotal(){
        return (valor * 3);
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
        System.out.println("Camarote Superior");
        System.out.println("Valor do Ingresso VIP: R$,.2f\n" + valorTotal());
    }


}
