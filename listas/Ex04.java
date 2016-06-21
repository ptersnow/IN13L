import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {

    int i, n;
    Scanner leitor = new Scanner(System.in);

    System.out.print("Informe um valor inteiro e positivo: ");
    n = leitor.nextInt();

    if (n == 1) {
      System.out.print("1");
    } else if (n > 0) {
      for (i = 1; i <= n; i++) {
        System.out.print(i + ",");
      }
      
      for (i = n - 1; i > 1; i--) {
        System.out.print(i + ",");
      }

      System.out.print("1");
    }
  }
}