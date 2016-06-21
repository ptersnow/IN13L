import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    
    int[] vet;
    int i, j, n;
    int idx, con, fre, max, media, mediana;
    Scanner leitor = new Scanner(System.in);

    System.out.print("Informe o tamanho do vetor: ");
    n = leitor.nextInt();

    media = 0;
    vet = new int[n];
    for (i = 0; i < n; i++) {
      System.out.print("Informe a posicao " + (i + 1) + ": ");
      vet[i] = leitor.nextInt();

      media += vet[i];
    }

    media /= n;

    idx = max = 0;
    for (i = 0; i < n - 1; i++) {
      con = 0;
      fre = vet[i];

      for (j = i + 1; j < n; j++) {
        if (fre == vet[j]) {
          con++;
        }
      }

      if (con > max) {
        max = con;
        idx = i;
      }
    }

    if (n % 2 == 0) {
      mediana = (n / 2) - 1;
    } else {
      mediana = n / 2;
    }

    System.out.println("Moda: " + vet[idx]);
    System.out.println("Mediana: " + vet[mediana]);
    System.out.println("Media: " + media);

  }
}