import java.util.Scanner;

public class SalarioNeto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el salario bruto mensual: ");
        double salarioBruto = scanner.nextDouble();
        
        System.out.print("Ingrese el porcentaje de impuestos (ej. 16): ");
        double porcentajeImpuestos = scanner.nextDouble();
        
        System.out.print("Ingrese las deducciones adicionales: ");
        double deduccionesAdicionales = scanner.nextDouble();
        
        // Fórmulas matemáticas aplicadas
        double impuesto = salarioBruto * (porcentajeImpuestos / 100);
        double salarioNeto = salarioBruto - impuesto - deduccionesAdicionales;
        
        System.out.println("\n--- Desglose de Salario ---");
        System.out.printf("Monto de impuesto retenido: %.2f\n", impuesto);
        System.out.printf("El salario neto final es: %.2f\n", salarioNeto);
        
        scanner.close();
    }
}
