import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
     
        Scanner input = new Scanner(System.in);


        System.out.println("\nCrie sua Conta Bancária");

        System.out.println("\nInforme o número da sua conta bancária");
        int numero = input.nextInt();

        input.nextLine();
        
        System.out.println("\nInforme sua Agencia");
        String agencia = input.nextLine();

        System.out.println("\nInforme seu nome");
        String nomeCliente = input.nextLine();


        System.out.println("Saldo bancario:");
        double saldo = input.nextDouble();


        input.close();

        System.out.println(
            "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco," +
            "sua agencia é " + agencia + ", conta " + numero + " e seu saldo " + saldo +
            " já está disponivel para saque"
        );


    }
}
