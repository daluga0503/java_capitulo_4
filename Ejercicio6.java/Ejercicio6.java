import java.util.Scanner;


public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float altura;
        float g = 9.8f;
        System.out.print("Introduce la altura: ");
        altura = sc.nextInt();
        if (altura>=0){
            System.out.printf("El objeto tarda en caer %.2f" + Math.sqrt(2*altura/g));
        }
        else
            System.out.print("La altura no puede ser negativa");
            sc.close();
    }
    }


