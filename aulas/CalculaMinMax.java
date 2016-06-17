import java.util.Scanner;

public class CalculaMinMax {
  
  public static void main(String[] args) {
    int i, n;
    int[] vet;
    int min, max;
    
    Scanner leitor = new Scanner(System.in);
    
    System.out.print("Informe o tamanho do vetor: ");
    n = leitor.nextInt();

    vet = new int[n];
    
    for (i = 0; i < vet.length; i++) {
      System.out.print("Informe a posicao " + (i + 1) + ": ");
      vet[i] = leitor.netxInt();
    }
    
    min = max = vet[0];
    System.out.println("Valores inseridos: ");
    for (i = 0; i < vet.length; i++) {
      System.out.print(vet[i] + " ");
      
      if (vet[i] > max) {
        max = vet[i];
      }
      
      if (vet[i] < min) {
        min = vet[i];
      }
    }
    
    System.out.println("Máximo: " + max);
    System.out.println("Mínimo: " + min);
  }  
}
