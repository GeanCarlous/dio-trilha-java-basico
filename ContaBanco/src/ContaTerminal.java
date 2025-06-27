import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagenspara o nosso usuário

        // Obter pela scanner os valores digitados pelo usuário no terminal

        // Exibir a mensagem de conta criada com sucesso

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Banco, para criar sua conta forneça as seguintes informações!");

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();
        while (nomeCliente.isEmpty()) {
            System.out.println("O nome não pode ser vazio. Por favor, insira um nome válido.");
            nomeCliente = scanner.nextLine();
        }

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();
        while (agencia.isEmpty()) {
            System.out.println("O número da agência não pode ser vazio. Por favor, insira um valor válido.");
            agencia = scanner.nextLine();
        }

        System.out.println("Por favor, digite o número da Conta: ");
        int numeroConta = scanner.nextInt();
        while (numeroConta < 0) {
            System.out.println("O numero da conta não pode ser negativo. Por favor, insira um valor válido.");
            numeroConta = scanner.nextInt();
        }

        System.out.println("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();
        while (saldo < 0) {
            System.out.println("O saldo não pode ser negativo. Por favor, insira um valor válido.");
            saldo = scanner.nextDouble();
        }


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque!");
        scanner.close();
    }
}