import java.util.Scanner;

public class DesafioAula03 {

  static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {

      System.out.println("Digite um número, pode ser positivo ou negativo");
      int numero = scanner.nextInt();
      if (numero > 0) {
        System.out.println("Número positivo");
      } else {
        System.out.println("Número negativo");
      }

      System.out.println("----------------------");

      System.out.println("Digite dois números inteiros");
      System.out.println("Digite o primeiro número inteiro");
      int primeiroNumero = scanner.nextInt();
      System.out.println("Digite o segundo número inteiro");
      int segundoNumero = scanner.nextInt();
      if (primeiroNumero == segundoNumero) {
        System.out.println("O primeiro número e o segundo número são iguais");
      } else {
        System.out.println("O primeiro número e o segundo número são diferentes");
      }
      if (primeiroNumero > segundoNumero) {
        System.out.println("Primeiro número é maior que o segundo número");
      } else {
        System.out.println("Segundo número é maior que o primeiro número");
      }

      System.out.println("----------------------");

      System.out.println("Escolha uma das opções para o cálculo de área");
      System.out.println("1. Calcular área do quadrada");
      System.out.println("2. Calcular área do círculo");
      int opcao = scanner.nextInt();
      if (opcao == 1) {
        System.out.println("Digite o valor do lado do quadrada");
        double ladoQuadrado = scanner.nextDouble();
        double areaQuadrado = ladoQuadrado * ladoQuadrado;
        System.out.println("Área do quadrado: " + areaQuadrado);
      } else {
        System.out.println("Digite o valor do raio do círculo");
        double raio = scanner.nextDouble();
        double areaCirculo = Math.PI * raio * raio;
        System.out.println("Área do círculo: " + areaCirculo);

      }

      System.out.println("----------------------");


      System.out.println("Tabuada");
      System.out.println("Digite um número");
      int numeroTabuada = scanner.nextInt();
      for (int i = 1; i <= 10; i++) {
        System.out.println(numeroTabuada + " + " + i + " = " + (numeroTabuada + i));
      }

      System.out.println("----------------------");

      System.out.println("Número par ou impar");
      System.out.println("Digite um número inteiro");
      int numeroParOuImpar = scanner.nextInt();
      if (numeroParOuImpar % 2 == 0) {
        System.out.println("O número " + numeroParOuImpar + " é par");
      } else {
        System.out.println("O número " + numeroParOuImpar + " é impar");
      }

      System.out.println("----------------------");

      System.out.println("Fatorial");
      System.out.println("Digite um número");
      int numeroFat = scanner.nextInt();
      int fatorial = 1;
      for (int i = 1; i <= numeroFat; i++) {
        fatorial *= i;
      }
      System.out.println("O fatorial de " + numeroFat + " é " + fatorial);


    }

  }

}
