import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args) {

    long fat;
    int i, n, t;
    Scanner leitor = new Scanner(System.in);
    
    System.out.print("Informe o numero de casos de teste: ");
    t = leitor.nextInt();

    while(t-- > 0) {
      System.out.print("Informe o valor a ser calculado: ");
      n = leitor.nextInt();
      
      fat = 1;
      for (i = 1; i <= n; i++) {
        fat *= i;
      }

      System.out.println(n + "! = " + fat);
    }
  }
}