import java.util.Scanner;
import java.util.Locale;

public class depositar {
    public void depositar_saldo (){

       double saldo = caixa_eletronico.getSaldo(), deposito, novoSaldo;
       Scanner input = new Scanner(System.in);
       input.useLocale(Locale.US);

       System.out.println("---------------------------------------------------------"); 
       System.out.println("                      DEPOSITAR                      \n\n");
       System.out.println("Seu saldo é: "+ saldo);
       System.out.println("Quanto deseja depositar?");
       deposito = input.nextDouble();
       novoSaldo=deposito+saldo;
       caixa_eletronico.setSaldo(novoSaldo);
       System.out.println("Seu novo saldo é: "+ novoSaldo +"\n");
       System.out.println("Dê ENTER para voltar ao menu!");
        input.nextLine(); 
        input.nextLine(); 
        System.out.println("VOLTANDO PARA O MENU!\n\n"); 
       System.out.println("---------------------------------------------------------"); 
    }
}
