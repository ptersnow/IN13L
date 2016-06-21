import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    
    double imc, peso, altura;
    Scanner leitor = new Scanner(System.in);

    System.out.print("Informe o peso: ");
    peso = leitor.nextDouble();
    System.out.println();

    System.out.print("Informe a altura: ");
    altura = leitor.nextDouble();
    System.out.println();

    imc = peso / (altura * altura);
    if (imc < 18.5) {
      System.out.println("Abaixo do peso");
    } else if (imc <= 24.9) {
      System.out.println("Peso normal");
    } else if (imc <= 29.9) {
      System.out.println("Sobrepeso");
    } else if (imc <= 34.9) {
      System.out.println("Obesidade de grau I");
    } else if (imc <= 39.9) {
      System.out.println("Obesidade de grau II");
    }
  }
}