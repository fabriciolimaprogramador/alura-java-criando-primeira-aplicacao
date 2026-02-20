import java.util.Scanner;

public class Loop {

  static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {

      double media = 0.0;
      double nota = 0.0;

      for (int i = 0; i < 3; i++) {
        System.out.println("Digite sua avaliação para o filme");
        nota = scanner.nextDouble();
        media += nota;
      }

      System.out.println("Média: " + media/3);

    }

  }

}
