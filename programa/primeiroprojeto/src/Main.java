public class Main{

  public static void main() {
    System.out.println("Esse é o Screen Match");
    System.out.println("Filme: Top Gun: Maverick");
    int anoDeLancamento = 2022;
    System.out.println("Ano de lançamento: " + anoDeLancamento);
    boolean incluidoNoPlano = true;
    double notaDoFilme = 8.1;
    double media = (9.8 + 6.3 + 8.0) / 3;
    System.out.println(media);

    String sinopse;
    sinopse = "Filme de aventura com galã dos anos 80";
    System.out.println(sinopse);

    //Text Blocks
    sinopse = """
            Filme 1
            Filme 2
            Filme 3
            """;
    System.out.println(sinopse);

    String mensagem = String.format("Meu nome é %s, minha idade é %d, tenho %.2f de altura", "Fabricio", 52, 1.73);
    System.out.println(mensagem);


    mensagem = String.format("""
            Meu nome é %s, minha idade é %d, tenho %.2f de altura        
            """, "Fabricio", 52, 1.73);
    System.out.println(mensagem);

    mensagem = """
            Meu nome é %s, minha idade é %d, tenho %.2f de altura        
            """.formatted("Fabricio", 52, 1.735);
    System.out.println(mensagem);

  }

}