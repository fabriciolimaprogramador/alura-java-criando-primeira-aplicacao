public class Desafio01 {

  static void main(String[] args) {

    double nota1 = 6.8;
    double nota2 = 8.9;
    double media = (nota1 + nota2) / 2;
    System.out.println(String.format("Média das notas: %.2f",media));

    double variavelDouble = 8.9;
    int variavelInt = (int) variavelDouble;
    System.out.println(String.format("Variavel double %.2f. Variavel int %d",variavelDouble, variavelInt));

    char variavelChar = 'x';
    String variavelString = "Valor ";
    System.out.println(variavelString + variavelChar);

    double precoProduto = 5.67;
    int quantidade = 10;
    double valorTotal = precoProduto * quantidade;
    System.out.println(String.format("Valor total: %.2f",valorTotal));

    double valorEmDolares = 15.0;
    double valorDoDolar = 4.94;
    double valorDolarParaReais = valorEmDolares * valorDoDolar;
    System.out.println(String.format("Valor convertido: %.2f",valorDolarParaReais));

    double precoOriginal = 6.89;
    double percentualDesconto = 10;
    double valorDesconto = precoOriginal * percentualDesconto / 100;
    double precoComDesconto = precoOriginal - valorDesconto;
    System.out.println(String.format("Preço com desconto: %.2f",precoComDesconto));


  }

}
