import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {
    
    int i, j, n;
    Scanner leitor = new Scanner(System.in);

    System.out.print("Informe um valor entre 1 e 100: ");
    n = leitor.nextInt();

    for (i = 1; i <= n; i++) {
      for (j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }

    for (i = n - 1; i >= 1; i--) {
      for (j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}