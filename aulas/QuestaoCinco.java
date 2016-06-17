import java.util.Scanner;

public class QuestaoCinco {

	public static void mostrar (int n, boolean r) {

		if (r) {
			for (int i = 1; i <= n; i++){
				System.out.println("");
				for (int j = 1; j <= i; j++){
					System.out.print(j);
				}
			}
		}
		else {
			for (int i = n; i > 0; i--){
				System.out.println("");
				for (int j = 1; j <= i; j++){
					System.out.print(j);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();


		/*for (int i = 1; i <= n; i++){
			System.out.println("");
			for (int j = 1; j <= i; j++){
				System.out.print(j);
			}
		}

		for (int i = n; i > 0; i--){
			System.out.println("");
			for (int j = 1; j <= i; j++){
				System.out.print(j);
			}
		}*/

		mostrar(n, true);
		mostrar(n, false);
		mostrar(n, true);
		mostrar(n, false);
	}
}