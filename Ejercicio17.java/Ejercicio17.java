
import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dice cuál es la última cifra de un número entero introducido por teclado.");
        System.out.println("Introduce el número entero deseado: ");
        int n = sc.nextInt();
            System.out.println("La última cifra del número introducido es el: " + n%10);
            sc.close();
        }

    }

