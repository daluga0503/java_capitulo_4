import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dice si un número entero positivo introducido por teclado es capicúa. ");
        System.out.println("Intoduzca el número deseado (máximo 5 cifras): ");
        int numeroriginal;
        int digito;
        int numcopia;
        int invertido;
        numeroriginal = sc.nextInt();
        numcopia=numeroriginal;

        if(numeroriginal<0){
            System.out.println("EL número tiene que ser positivo. ");
        }

        if(numeroriginal>99999){
            System.out.println("El número tiene que ser de como máximo 5 dígitos. ");
        }

        if(numeroriginal>0){
            invertido=0;
            digito=numcopia%10;
            numcopia=numcopia/10;
            invertido = (invertido*10) + digito;
                System.out.println("El número invertido es  " + invertido);
                if(numeroriginal==invertido){
                System.out.println("El número es capicua.");
                } else {
                System.out.println("El número no es capicua.");
                }
            }
        sc.close();
        }
    }
    

