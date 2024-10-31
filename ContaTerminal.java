import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem-vindo ao banco no seu terminal!!!");

        System.out.println("Vamos dar início ao seu cadastro");

        System.out.println(" ");

        System.out.println("Primeiro digite o número da sua conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Agora digite o número da sua agência:");
        String numeroAgencia = scanner.next();
        
        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite o seu saldo:");
        int saldo = scanner.nextInt();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia+ ", conta " + numeroConta + " e seu saldo " + saldo+ " já está disponível para saque");
        scanner.close();
    }
}