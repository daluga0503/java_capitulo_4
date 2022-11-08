import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cargo perteneciente:");
        System.out.println("1. Programador junior.");
        System.out.println("2. Programador senior.");
        System.out.println("3. Jefe de proyecto.");

        int sueldobase=0;

        System.out.print("Introduzca el cargo(1-3): ");
        int cargo = sc.nextInt();

        System.out.print("¿Cuántos dias has estado de viaje visitando clientes: ");
        int dias = sc.nextInt();
        int dietas=dias*30;

        System.out.println("Introduzca su estado civil (1- Soltero, 2- Casado):");
        int estado = sc.nextInt();
        double irpf=0;

        switch (cargo) {
            case 1:
                sueldobase=950;
                break;
                case 2:
                sueldobase=1200;
                break;
                case 3:
                sueldobase=1600;
                break;
        
            default:
                break;
        }

        double sueldobruto=sueldobase+dietas;



        if (estado == 1) { // Soltero
            irpf = 25;
          } else if (estado == 2) { // Casado
            irpf = 20;
            } else {
            System.out.println("No ha elegido correctamente el estado civil.");
            }

            double cuantiaIrpf = (sueldobruto * irpf) / 100;
            double sueldoneto=sueldobruto-cuantiaIrpf;

            System.out.printf("Sueldo base: %16s\n", sueldobase);
            System.out.printf("Dietas (%d viajes): %10s\n", dias,dietas);
            System.out.printf("Sueldo bruto: %15s\n", sueldobruto);
            System.out.printf("Retención IRPF (%.0f):   %.2f\n",irpf,cuantiaIrpf);
            System.out.printf("Sueldo neto:          %.2f ", sueldoneto);

        
        sc.close();
    }
}
