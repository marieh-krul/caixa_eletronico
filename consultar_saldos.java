import java.util.Locale;
import java.util.Scanner;

public class consultar_saldos {
    public void consultar_saldo(){
       double saldo = caixa_eletronico.getSaldo();
       Scanner input = new Scanner(System.in);
       input.useLocale(Locale.US);

       System.out.println("---------------------------------------------------------"); 
       System.out.println("                      CONSULTAR SALDO                      \n\n");
       System.out.println("Seu saldo é: "+ saldo+"\n");

       System.out.println("Dê ENTER para voltar ao menu!");
        input.nextLine(); 
        input.nextLine(); 
        System.out.println("VOLTANDO PARA O MENU!\n\n"); 

       System.out.println("---------------------------------------------------------"); 
    }
}
