import java.util.Scanner;

public class CalculaMinMax {

  public static void main(String[] args) {
    int n;
    int[] vet;
    
    Scanner leitor = new Scanner(System.in);
    
    System.out.print("Informe o tamanho do vetor: ");
    n = leitor.nextInt();

    vet = new int[n];
    minMax(vet);
  }

  public static int minMax (int[] vetor) {

    int i, min, max;
    Scanner leitor = new Scanner(System.in);

    for (i = 0; i < vetor.length; i++) {
      System.out.print("Informe a posicao " + (i + 1) + ": ");
      vetor[i] = leitor.nextInt();
    }
    
    min = max = vetor[0];
    for (i = 0; i < vetor.length; i++) {
      
      if (vetor[i] > max) {
        max = vetor[i];
      }
      
      if (vetor[i] < min) {
        min = vetor[i];
      }
    }

    System.out.println();
    System.out.println("min: " + min);
    System.out.println("max: " + max);
  }

}