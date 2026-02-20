import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhar {

  static void main(String[] args) {

    int numeroAleatorio = new Random().nextInt(100);
    System.out.println(numeroAleatorio);
    int tentativas = 1;
    boolean adivinhou = false;

    try (Scanner scanner = new Scanner(System.in)) {

      while (tentativas <= 5) {

        System.out.println("Digite um número de 0 a 100");
        int numeroDigitado = scanner.nextInt();
        if (numeroDigitado == numeroAleatorio) {
          adivinhou = true;
          break;
        }
        tentativas++;

      }

      if (adivinhou){
        System.out.println("Você adivinhou o número " + numeroAleatorio);
      } else {
        System.out.println("Você não adivinhou o número " + numeroAleatorio);
      }


    }

  }

}
