import java.util.Scanner;

//Aplicação financeira
public class DesafioAula4 {

  static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {

      System.out.println("Digite o nome do cliente");
      String nomeCliente = scanner.nextLine();

      System.out.println("Digite o tipo de conta do cliente CORRENTE ou POUPANÇA");
      String tipoContaCliente = scanner.nextLine();

      System.out.println("Digite o saldo inicial do cliente");
      double saldoInicial = scanner.nextDouble();

      System.out.println("******************************************************************");
      System.out.println("Dados iniciais do cliente:");
      System.out.println();
      System.out.println("Nome: " + nomeCliente);
      System.out.println("Tipo conta: " + tipoContaCliente);
      System.out.println(String.format("Saldo inicial: R$ %.2f", saldoInicial));
      System.out.println("******************************************************************");

      while (true){
        System.out.println();
        System.out.println();
        System.out.println("Operações");
        System.out.println();
        System.out.println("1- Consultar saldos");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair");
        System.out.println();
        System.out.println("Digite a opção desejada:");

        int opcao = scanner.nextInt();
        if (opcao == 4) {
          break;
        }

        if (opcao > 4) {
          System.out.println("Opção inválida");
          continue;
        }

        if (opcao == 1) {
          System.out.println(String.format("Saldo atual: R$ %.2f", saldoInicial));
          continue;
        }

        if (opcao == 2) {
          System.out.println("Digite o valor a ser recebido");
          double valorRecebido = scanner.nextDouble();
          saldoInicial += valorRecebido;
          continue;
        }

        if (opcao == 3) {
          System.out.println("Digite o valor a ser transferido");
          double valorTransferido = scanner.nextDouble();
          if (valorTransferido > saldoInicial) {
            System.out.println("Saldo insuficiente para ser transferico");
            continue;
          }
          saldoInicial -= valorTransferido;
        }

      }

    }

  }

}
