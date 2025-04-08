import java.util.Scanner;

public class Atvd01 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double peso;
        System.out.print("Digite o seu peso: ");
        peso = input.nextDouble();

        double altura;

        System.out.print("Digite a sua altura: ");
        altura = input.nextDouble();

        double imc = peso / (altura * altura); // Calcula o IMC e armazena na variável imc
        
        System.out.println("Seu IMC é " + imc); // Imprime o valor correto do IMC

        if (imc < 18.5) {
            System.out.println("Abaixo do peso normal");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Obesidade grau I");
        } else if (imc < 40) {
            System.out.println("Obesidade grau II");
        } else {
            System.out.println("Obesidade grau III");
        }

        input.close();
    }
}