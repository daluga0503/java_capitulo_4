import java.util.Scanner;


public class Ejercicio11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la hora en formatos 24 h y te diré cuantos segundos queda para la medianoche.");
        System.out.println("Introduzca la hora deseada: ");
        int hora;
        hora = sc.nextInt();
        System.out.println("Introduca los minutos: ");
        int min;
        min = sc.nextInt();

            if( hora > 24 || min > 60){
                System.out.println("Datos introducidos incorrectos");
            } else {
                int seg = (24-hora)*3600 + (60-min)*60;
                System.out.println("Quedan: " + seg + " segundos.");
            }
    sc.close();
    }
}
