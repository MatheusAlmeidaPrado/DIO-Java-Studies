import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        int conta;
        String agencia = new String();
        String nomeCliente = new String();
        Double saldo;
        Locale localeBr = new Locale("pt", "BR");
        Scanner scanner = new Scanner(System.in).useLocale(localeBr);

        System.out.println("\n!Insira as informações seguintes para a 'criação' da sua conta bancária!");


        System.out.println("Por favor, digite o seu Nome Completo: ");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o número de sua Conta: ");
        conta = scanner.nextInt();
        System.out.println("Por favor, digite o número de sua Agência: ");
        agencia = scanner.next();
        System.out.println("Por favor, digite o número do seu Saldo (com vírgula): ");
        saldo = scanner.nextDouble();   //Já que estamos usando Locale pt-Br, o valor precisa ser inserido com ',' e não '.' !
        
        scanner.close();

        System.out.println("\nOlá " + nomeCliente +
        ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
        ", conta " + conta + " e seu saldo de R$ " + String.format("%.2f", saldo) + 
        " já está disponível para saque!\n");
    }
}
