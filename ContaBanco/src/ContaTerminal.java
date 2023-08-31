//Importar a classe Scanner
import java.util.Scanner;
import java.util.Locale;


public class ContaTerminal {
    public static void main(String[] args) {
        //Declaração de variáveis
        int numero;
        String agencia, nome, sobrenome;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //Exibir as mensagens para o usuário
        System.out.println("Digite o Número da conta: ");
        //Obter pelo scanner os valores digitados no terminal
        numero = scanner.nextInt();

        System.out.println("Digite o Número da Agência: ");
        agencia = scanner.next();

        System.out.println("Digite o Nome do cliente: ");
        nome = scanner.next();

        System.out.println("Digite o Sobrenome do cliente: ");
        sobrenome = scanner.next();

        System.out.println("Valor do Saldo: ");
        saldo = scanner.nextDouble();

        //Exibir a mensagem da conta criada
        System.out.println("========================== ");
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numero);
        System.out.println("Cliente: " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("========================== ");

        



    }
}