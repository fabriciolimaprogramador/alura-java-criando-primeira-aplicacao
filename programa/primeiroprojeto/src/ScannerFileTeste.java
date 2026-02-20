import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileTeste {

  static void main(String[] args)  {

    Scanner scanner = null;
    try {
      scanner = new Scanner(new File("myNumbers"));
      while (scanner.hasNextLong()) {
        long valor = scanner.nextLong();
        System.out.println(valor);
      }
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } finally {
      scanner.close();
    }

  }

}
