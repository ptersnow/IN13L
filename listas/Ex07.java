import java.util.Scanner;

public class Ex07 {
  
  public static void main(String[] args) {
    int i, n;
    int fat = 1;
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Informe o valor a ser calculado: ");
    n = leitor.nextInt();
    
    for (i = 1; i <= n; i++) {
      fat *= i;
    }

    System.out.println(n + "! = " + fat);
  }  
}