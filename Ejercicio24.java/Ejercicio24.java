import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cargo perteneciente:");
        System.out.println("1. Programador junior.");
        System.out.println("2. Programador senior.");
        System.out.println("3. Jefe de proyecto.");

        System.out.print("Introduzca el cargo(1-3): ");
        int cargo = sc.nextInt();

        System.out.print("¿Cuántos dias has estado de viaje visitando clientes: ");
        int dias = sc.nextInt();

        System.out.println("Introduzca su estado civil (1- Soltero, 2- Casado):");
        int estado = sc.nextInt();


        switch (cargo) {
            case 1:
                int sueldo_base_1 = 950;
                int dietas = dias*30;
                int sueldo_bruto_1 = sueldo_base_1+(dias*30);
                System.out.printf("Sueldo base: %10s \n", sueldo_base_1);
                System.out.printf("Dietas (%d viajes)  %.2.f \n", dias, dietas);
                System.out.printf("Sueldo bruto: %10s \n", sueldo_bruto_1);
                
                break;

            case 2:
                
                break;

            case 3:
                
                break;
        
            default:
                break;
        }
    }
}
