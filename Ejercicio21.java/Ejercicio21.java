import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a calcular la nota media en la asignatura de Programación.");
        System.out.print("Introduzca la nota del primer examen: ");
        int nota1 = sc.nextInt();
        System.out.print("Introduzca la nota del segundo examen: ");
        int nota2 = sc.nextInt();
        double media = (double)(nota1+nota2)/2;

        if(media<5){
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto).");
            String recuperacion = System.console().readLine();
                if(recuperacion .equals("apto")){
                media = 5;
                }
        }
        System.out.printf("Tu nota de Prgramación es de: " + media);

sc.close();
    }
}

