import java.util.Scanner;

public class ContaTerminal {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digiti o numero da conta.");
            int NumeroDaConta = scanner.nextInt();
        System.out.println("Digiti o numero da agencia.");
            String agencia = scanner.next();
        System.out.println("Digiti o Primeiro nome.");
            String PrimeiroNome = scanner.next();
        System.out.println("Digiti o nome Sobrenome.");
            String SobreNome = scanner.next();
        System.out.println("Digiti o saldo.");
            Double Saldo = scanner.nextDouble();
         String NomeDoCliente = PrimeiroNome + " " + SobreNome;


        System.out.printf("Olá " + NomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", \n conta " + NumeroDaConta + " e seu saldo é " + Saldo + ", já está disponível para saque.");
           
    }
}
