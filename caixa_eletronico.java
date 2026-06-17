import java.util.Scanner;
import java.util.Locale;

public class caixa_eletronico {

    public static double saldo = 2000.00;

    public static double getSaldo() {
        return saldo;
    }

    public static void setSaldo(double novoSaldo) {
        saldo = novoSaldo;
    }

    public static void main(String[] args) {
        int saida;
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        consultar_saldos consulta = new consultar_saldos();
        depositar depositar = new depositar();
        sacar_saldo sacar = new sacar_saldo();

        do {
            System.out.println("============ CAIXA ELETRÔNICO ============");
            System.out.println("|1 - Consultar saldo                     |");
            System.out.println("|2 - Depositar                           |");
            System.out.println("|3 - Sacar                               |");
            System.out.println("|4 - Sair                                |");
            System.out.println("==========================================");
            System.out.println("O que você deseja fazer? ");
            saida = input.nextInt();
            switch (saida){
                case 1:
                    consulta.consultar_saldo();
                break;
                case 2:
                    depositar.depositar_saldo();
                break;
                case 3:
                    sacar.sacar();
                break;
                case 4:
                    System.out.println("---------------------------------------------------------");
                    System.out.println("\nFECHANDO O SISTEMA!\n");
                    System.out.println("---------------------------------------------------------");
                break;
                default:
                    System.out.println("---------------------------------------------------------");
                    System.out.println("\n\nVocê digitou um número sem função! Tente Novamente!");
                    System.out.println("Dê ENTER para voltar ao menu!");
                    input.nextLine(); 
                    input.nextLine(); 
                    System.out.println("VOLTANDO PARA O MENU!\n\n"); 
                    System.out.println("---------------------------------------------------------");
                break;
            }

        } while (saida!=4);
    }
}