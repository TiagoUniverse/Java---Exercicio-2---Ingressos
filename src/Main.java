import Ingressos.CamaroteInferior;
import Ingressos.CamaroteSuperior;
import Ingressos.Ingresso_Normal;
import Ingressos.Ingresso_VIP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha, escolhaCompra;

        do{
            System.out.println("Compra de ingresso:");
            System.out.println("1- Ingresso Normal");
            System.out.println("2- Ingresso VIP");
            System.out.println("3- Camarote inferior");
            System.out.println("4- Camarote Superior");
            System.out.println("0 - Fechar o programa");
            System.out.println("-------------");
            System.out.println("");
            escolha = scanner.nextInt();

            escolhaCompra = processarEscolha(escolha, scanner);


        } while (escolha != 0 && escolhaCompra != 1);


        if (escolhaCompra == 1){
            System.out.println("Fechando a compra. Bom show!");
        }



        scanner.close();
    }

    private static int processarEscolha(int escolha, Scanner scanner) {
        String escolhaCompra;

        switch(escolha){
            case 0:
                System.out.println("Fechando o programa.");
                break;
            case 1:
                Ingresso_Normal normal = new Ingresso_Normal();
                normal.ImprimeTudo();
                break;
            case 2:
                Ingresso_VIP vip = new Ingresso_VIP();
                vip.ImprimeTudo();
                break;
            case 3:
                CamaroteInferior inferior = new CamaroteInferior();
                inferior.ImprimeTudo();
                break;
            case 4:
                CamaroteSuperior superior = new CamaroteSuperior();
                superior.ImprimeTudo();
                break;
            default:
                System.out.println("Erro na escolha");
                break;
        }

        if(escolha != 0){
            System.out.println("Deseja comprar? S/ N");
            escolhaCompra = scanner.next();


            switch(escolhaCompra){
                case "S":
                case "s":
                    System.out.println("Compra com sucesso!");
                    System.out.println("");

                    return 1;
                default:
                    System.out.println("Compra cancelada");
                    System.out.println("");
                    break;
            }

        }


        return 0;
    }


}