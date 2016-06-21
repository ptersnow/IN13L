import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    
    double n1, n2, n3, n4, media;
    Scanner leitor = new Scanner(System.in);

    System.out.print("Informe a primeira nota: ");
    n1 = leitor.nextDouble();
    System.out.println();

    System.out.print("Informe a segunda nota: ");
    n2 = leitor.nextDouble();
    System.out.println();

    System.out.print("Informe a terceira nota: ");
    n3 = leitor.nextDouble();
    System.out.println();

    System.out.print("Informe a quarta nota: ");
    n4 = leitor.nextDouble();
    System.out.println();

    media = (n1 + n2 + n3 + n4) / 4;
    if (media >= 7) {
      System.out.println("Aprovado");
    } else if (media > 5) {
      System.out.println("Recuperacao");      
    } else {
      System.out.println("Reprovado");
    }
  }
}