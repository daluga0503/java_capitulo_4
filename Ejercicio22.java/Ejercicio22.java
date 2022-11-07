import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuánto queda para el fin de semana?(viernes a las 15h)");
        System.out.print("Introduzca el día de la semana (1. Lunes, 2. Martes, 3. Miércoles, 4.Jueves, 5.Viernes): ");
        int dia=sc.nextInt();
        int diaintroducido=0;

        switch (dia) {
            case 1:
                diaintroducido=1;
                System.out.println("Lunes");
                break;
            
            case 2:
                diaintroducido=2;
                System.out.println("Martes");
                break;
            case 3:
                diaintroducido=3;
                System.out.println("Miércoles");
                break;
            case 4:
                diaintroducido=4;
                System.out.println("Jueves");
                break;
            case 5:
            diaintroducido=5;
            System.out.println("Viernes");
            break;

            default:
                System.out.println("Datos incorrectos.");
        }

        System.out.print("Introduzca la hora: ");
        int hora = sc.nextInt();
        System.out.print("Introduzca los minutos: ");
        int minutos = sc.nextInt();

        int minactual = (diaintroducido*24*60)+(hora*60)+minutos;
        int minfinde = (5*24*60)+(15*60);
        int resto= minfinde-minactual;

        System.out.println("El tiempo restantante para el fin de semana es de: " + resto);



    }
}
