import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        //TO DO: Conhecer e Importar a classe Scanner

        //Exibir mensagens para o usuário

        //Obter pelo Scanner os valores digitados no terminal

        //Exibir mensagem para o usuário

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 249.90;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite seu nome:");
        nomeCliente = scanner.next();

        System.out.println("Por favor digite sua agência:");
        agencia = scanner.next();

        System.out.println("Por favor digite o número da sua conta:");
        numeroConta = scanner.nextInt();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque");
    }
}