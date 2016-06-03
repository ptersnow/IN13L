import java.util.Scanner;

public class Mod {
  
  public static void main(String[] args) {
    int i;
    int aux, div;
    Scanner leitor = new Scanner(System.in);
    
    do {
      System.out.print("Informe o dividendo (0 para sair): ");
      aux = leitor.nextInt();
      System.out.print("Informe o divisor: ");
      div = leitor.nextInt();
      
      if (aux != 0) {
        if (aux mod div == 0) {
          System.out.println("O numero " + aux + " e divisivel por " + div);
        } else {
          System.out.println("O numero " + aux + " nao e divisivel por " + div);
        }
      }
    } while(aux != 0);
  }  
}