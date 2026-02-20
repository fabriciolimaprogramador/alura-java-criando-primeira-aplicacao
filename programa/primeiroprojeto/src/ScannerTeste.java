import java.util.Scanner;

public class ScannerTeste {

  static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número inteiro");
    int i = scanner.nextInt();
    System.out.println(i);
    scanner.close();

  }


}
