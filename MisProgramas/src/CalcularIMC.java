import java.util.Scanner;

public class CalcularIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();
        
        System.out.print("Ingrese su altura en metros (ej. 1.75): ");
        double altura = scanner.nextDouble();
        
        double imc = peso / (altura * altura);
        
        System.out.printf("Su Índice de Masa Corporal (IMC) es: %.2f\n", imc);
        
        scanner.close();
    }
}