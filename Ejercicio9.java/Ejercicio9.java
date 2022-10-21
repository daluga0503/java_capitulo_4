import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax^2 + bx + c = 0");
        double a;
        double b;
        double menosb;
        double c;
        System.out.println("Introduzca el valor de a: ");
        a = sc.nextDouble();
        System.out.println("introduzca el valor de b: ");
        b = sc.nextDouble();
        menosb= b*(-1);
        System.out.println("introduzca el valor de c: ");
        c = sc.nextDouble();

    double operacion = b*b-(4*a+c);
    double raiz = Math.sqrt(operacion);
    double x1= menosb+raiz/2*a;
    double x2 = menosb-raiz/2*a;

        if(operacion>=0 && a!=0){
            System.out.println("El valor de x1 = " + x1);
            System.out.println("El valor de x1 = " + x2);
        } else {
            System.out.println("Fallo al introducir los valores. ");
        }
        sc.close();
    }
}
