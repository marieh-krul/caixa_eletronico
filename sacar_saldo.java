import java.util.Locale;
import java.util.Scanner;

public class sacar_saldo {
    public void sacar(){

       double saldo = caixa_eletronico.getSaldo(), retirada, novoSaldo;
       Scanner input = new Scanner(System.in);
       input.useLocale(Locale.US);

       System.out.println("---------------------------------------------------------"); 
       System.out.println("                          SACAR                           \n\n");
       System.out.println("Seu saldo é: "+ saldo);
       System.out.println("Quanto deseja retirar?");
       retirada = input.nextDouble();
       if (saldo>retirada){
            novoSaldo=saldo-retirada;
            caixa_eletronico.setSaldo(novoSaldo);
            System.out.println("Seu novo saldo é: "+ novoSaldo +"\n");
       } else {
            System.out.println("Você não possui saldo para efetuar a retirada! Tente novamente!");
       }
       
       System.out.println("Dê ENTER para voltar ao menu!");
        input.nextLine(); 
        input.nextLine(); 
        System.out.println("VOLTANDO PARA O MENU!\n\n"); 
       System.out.println("---------------------------------------------------------"); 
    }
}
    

