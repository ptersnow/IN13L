import java.util.Scanner;

public class Frequente {
  
  public static void main(String[] args) {
    int[] vet;
    int i, j, n;
    int idx, val, fre, max;
    
    Scanner leitor = new Scanner(System.in);
    
    System.out.print("Informe o tamanho do vetor: ");
    n = leitor.nextInt();
    vet = new int[10];
    
    for (i = 0; i < vet.length; i++) {
      System.out.print("Informe a posicao " + (i + 1) + ": ");
      vet[i] = leitor.nextInt();
    }
    
    max = 0;
    idx = 0;
    for (i = 0; i < vet.length; i++) {
      fre = 0;
      val = vet[i];
      
      for (j = i; j < vet.length; j++) {
        if (val == vet[j]) {
          fre++;
        }
      }
      
      if (fre > max) {
        idx = i;
        max = fre;
      }
    }
    
    System.out.print("O elemento mais frequente e: " + vet[idx]);
    System.out.print(" com " + max + " repeticoes no vetor.");
  }  
}