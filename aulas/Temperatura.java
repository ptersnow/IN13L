import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		int op;
		double tempConvertida = 0.0;
		Scanner leitor = new Scanner(System.in);

		do {

			System.out.println("Opcoes: ");
			System.out.println("\t[1]: Fahrenheit -> Celsius");
			System.out.println("\t[2]: Celsius -> Fahrenheit");
			System.out.println("\t[0]: Sair");
			System.out.print("Informe a opcao: ");
			op = leitor.nextInt();

			switch (op) {
				case 0:
					break;
				case 1:
					tempConvertida = convertFToC();
					break;
				case 2:
					tempConvertida = convertCToF();
					break;
				default:
					System.out.println("Opcao invalida");
			}

			if (op != 0) {
				System.out.println();
				System.out.println("Resultado: " + tempConvertida);
			}
		} while(op != 0);
	}

	public static double convertFToC() {
		double temperatura, resultado;
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe a temperatura: ");
		temperatura = leitor.nextDouble();
		resultado = (temperatura - 32) * 5 / 9;

		return resultado;
	}

	public static double convertCToF() {
		double temperatura, resultado;
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe a temperatura: ");
		temperatura = leitor.nextDouble();
		resultado = (temperatura * 9 / 5) + 32;

		return resultado;
	}
}