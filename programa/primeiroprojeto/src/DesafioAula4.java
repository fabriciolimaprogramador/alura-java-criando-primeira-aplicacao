import java.util.InputMismatchException;
import java.util.Scanner;

//Aplicação financeira
public class DesafioAula4 {

  static void main(String[] args) {

    boolean erro = false;

    try (Scanner scanner = new Scanner(System.in)) {


      String nomeCliente = null;
      String tipoContaCliente = null;
      double saldoInicial = 0.0;

      boolean dadosIncorretos = true;
      do {

        try {
          System.out.println("Digite o nome do cliente");
          nomeCliente = scanner.nextLine();
          if (nomeCliente == null || nomeCliente.trim().equals("")) {
            continue;
          }

          dadosIncorretos = false;

        } catch (Exception e) {
          System.out.println("Dados incorretos: " + e.getMessage());
        }

      } while (dadosIncorretos);

      dadosIncorretos = true;
      do {

        try {
          System.out.println("Digite o tipo de conta do cliente CORRENTE ou POUPANÇA");
          tipoContaCliente = scanner.nextLine();
          if (tipoContaCliente == null || tipoContaCliente.trim().equals("")) {
            continue;
          }
          if (!(tipoContaCliente.trim().equalsIgnoreCase("CORRENTE") || tipoContaCliente.trim().equalsIgnoreCase("POUPANÇA"))) {
            continue;
          }

          dadosIncorretos = false;

        } catch (Exception e) {
          System.out.println("Dados incorretos: " + e.getMessage());
        }


      } while (dadosIncorretos);


      dadosIncorretos = true;
      while (dadosIncorretos) {

        try {
          System.out.println("Digite o saldo inicial do cliente");
          saldoInicial = scanner.nextDouble();

          if (saldoInicial < 0.0) {
            System.out.println("Saldo não pode ser negativo");
            continue;
          }

          dadosIncorretos = false;

        } catch (InputMismatchException e) {
          System.out.println("Digite um valor numérico para o saldo inicial");
          scanner.nextLine();
        }

      }

      System.out.println("******************************************************************");
      System.out.println("Dados iniciais do cliente:");
      System.out.println();
      System.out.println("Nome: " + nomeCliente);
      System.out.println("Tipo conta: " + tipoContaCliente);
      System.out.println(String.format("Saldo inicial: R$ %.2f", saldoInicial));
      System.out.println("******************************************************************");

      while (true) {
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

        try {

          if (opcao == 2) {
            System.out.println("Digite o valor a ser recebido");
            double valorRecebido = scanner.nextDouble();
            if (valorRecebido < 0.0) {
              System.out.println("Valor a ser recebido não pode ser negativo");
              continue;
            }
            saldoInicial += valorRecebido;
            continue;
          }

          if (opcao == 3) {
            System.out.println("Digite o valor a ser transferido");
            double valorTransferido = scanner.nextDouble();
            if (valorTransferido < 0.0) {
              System.out.println("Valor a ser transferido não pode ser negativo");
              continue;
            }

            if (valorTransferido > saldoInicial) {
              System.out.println("Saldo insuficiente para ser transferico");
              continue;
            }
            saldoInicial -= valorTransferido;
          }
        } catch (InputMismatchException e) {
          System.out.println("Digite um valor numérico");
          scanner.nextLine();
        }


      }

    }

  }

}
