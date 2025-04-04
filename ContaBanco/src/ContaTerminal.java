import java.util.Scanner;

public class ContaTerminal {
    
     public static void main(String[] args) {
        // Cria o objeto Scanner para leitura do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicita e recebe os dados do usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do nextInt

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();

        // Exibe a mensagem formatada
        System.out.println("Olá " + nomeCliente + 
            ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
            ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fecha o scanner
        scanner.close();
    }
    }

