import java.util.Scanner;

public class Ex08 {
  public static void main(String[] args) {

    int sum;
    int[][] mat;
    int[][] res;
    int[][] mat2;
    int i, j, k, n, m, t;

    Scanner leitor = new Scanner(System.in);

    System.out.print("Informe o numero de casos de teste: ");
    t = leitor.nextInt();

    while(t-- > 0) {

      System.out.print("Informe o tamanho da matriz: ");
      m = leitor.nextInt();

      System.out.print("Informe o expoente: ");
      n = leitor.nextInt();

      res = new int[m][m];
      mat = new int[m][m];
      mat2 = new int[m][m];

      for (i = 0; i < m; i++) {
        for (j = 0; j < m; j++) {
          System.out.print("Informe a posicao [" + (i + 1) + "][" + (j + 1) + "]: ");
          mat[i][j] = leitor.nextInt();
          mat2[i][j] = mat[i][j];
        }
      }

      while(--n > 0) {
        for (i = 0; i < m; i++) {
          for (j = 0; j < m; j++) {

            sum = 0;
            for (k = 0; k < m; k++) {
              sum += mat2[i][k] * mat[k][j];
            }

            res[i][j] = sum;
          }
        }

        for (i = 0; i < m; i++) {
          for (j = 0; j < m; j++) {
            mat[i][j] = res[i][j];
          }
        }
      }

      for (i = 0; i < m; i++) {
        for (j = 0; j < m; j++) {
          System.out.print(mat[i][j] + " ");
        }
        System.out.println();
      }
    }
  }
}