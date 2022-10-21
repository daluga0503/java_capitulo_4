import java.util.Scanner;

public class Ejercicio18 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dice cuál es la primera cifra de un número entero introducido por teclado.");
        System.out.println("Introduce el número entero de como máximo 5 cifras deseado: ");
        int n = sc.nextInt();

                if(n<10){
                    System.out.println("La primera cifra del número intoducido es: " + n);
                } 

                    if(n> 9 && n<100){
                    System.out.println("La primera cifra del número intoducido es: " + n/10);
                } 

                if(n>99 && n<1000){
                    System.out.println("La primera cifra del número intoducido es: " + n/100);
                }

                if(n>999 && n<10000){
                    System.out.println("La primera cifra del número intoducido es: " + n/1000);
                }
                if(n>9999 && n<100000){
                    System.out.println("La primera cifra del número intoducido es: " + n/10000);
                }
            sc.close();
        }

    }

