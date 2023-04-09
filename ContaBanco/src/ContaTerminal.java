import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Seja Bem-vindo ao Terminal de usuário do Banco Box.");

        System.out.println("Digite o seu nome completo: ");
        String nomeCompleto = sc.nextLine();

        System.out.println("Digite o número da sua Agência: ");
        String agencia = sc.nextLine();

        System.out.println("Digite o número da sua conta: ");
        int numero = sc.nextInt();

        System.out.println("Digite o valor que deseja sacar: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        sc.close();
    }
}
