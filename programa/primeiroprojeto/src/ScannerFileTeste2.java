import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.Currency;
import java.util.Scanner;
import java.util.Timer;

public class ScannerFileTeste2 {

  static void main(String[] args)  {


    System.out.println(LocalDateTime.now());
    long soma = 0l;
    Scanner scanner = null;
    try {
      scanner = new Scanner(new File("myNumbers2"));
      while (scanner.hasNextLong()) {
        long valor = scanner.nextLong();
        soma += valor;
      }
      System.out.println("Soma: " + soma);
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } finally {
      scanner.close();
    }
    System.out.println(LocalDateTime.now());

  }

}
