import java.util.Scanner;

public class VetorExemplo {
  
  public static void main(String[] args) {
    int i;
    int[] vet;
    
    Scanner leitor  new Scanner(System.in);
    
    vet = new int[10];
    
    for (i = 0; i < vet.length; i++) {
      System.out.print("Informe a posicao " + (i + 1) + ": ");
      vet[i] = leitor.netxInt();
    }
    
    System.out.println("Valores inseridos: ");
    for (i = 0; i < vet.length; i++) {
      System.out.print(vet[i] + " ");
    }
  }  
}