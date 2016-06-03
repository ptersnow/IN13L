import java.util.Scanner;

public class CalculaMinMax {
  
  public static void main(String[] args) {
    int i;
    int[] vet;
    int min, max;
    
    Scanner leitor = new Scanner(System.in);
    
    vet = new int[10];
    
    for (i = 0; i < vet.length; i++) {
      System.out.print("Informe a posicao " + (i + 1) + ": ");
      vet[i] = leitor.nextInt();
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