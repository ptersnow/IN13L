import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {

    int i, n;
    Scanner leitor = new Scanner(System.in);

    System.out.print("Informe um valor inteiro e positivo: ");
    n = leitor.nextInt();

    if (n > 0) {
      System.out.print("[1");
      for (i = 2; i <= n; i++) {
        System.out.print("|" + i);
      }
      System.out.print("]");
    }
  }
}