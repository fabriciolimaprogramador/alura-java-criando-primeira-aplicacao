import java.util.Scanner;

public class LoopWhile {

  static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {

      double media = 0.0;
      double nota = 0.0;
      int totalDeNotas = 0;

      while (nota != -1) {
        System.out.println("Digite sua avaliação para o filme ou -1 para encerrar");
        nota = scanner.nextDouble();
        if (nota != -1) {
          media += nota;
          totalDeNotas++;
        }
      }

      if (totalDeNotas > 0) {
        System.out.println("Média: " + media/totalDeNotas);
      }


    }

  }

}
