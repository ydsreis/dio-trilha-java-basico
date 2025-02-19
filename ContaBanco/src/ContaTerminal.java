import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Olá, por favor digite o numero da sua conta.");
        numero = scan.nextInt();
        scan.nextLine();

        System.out.println("Por favor digite o numero da agência.");
        agencia = scan.nextLine();

        System.out.println("Por favor digite o seu nome.");
        nomeCliente = scan.nextLine();

        System.out.println("Por favor digite o seu saldo");
        saldo = scan.nextDouble();

        System.out.println("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$" +saldo +" e já está disponível para saque");
        
        scan.close();

    }
}
