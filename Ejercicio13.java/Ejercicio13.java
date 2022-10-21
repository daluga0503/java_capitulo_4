import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("En este programa vas a introducir tres números y serán ordenados por orden de mayor a menor.");
        System.out.println("Introduzca el primer número: ");
        int n1 = sc.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int n2 = sc.nextInt();
        System.out.println("Introduzca el tercer número: ");
        int n3 = sc.nextInt();

            if(n1>n2 && n2>n3){
                System.out.println(n1 + " ," + n2 + " ," + n3);
                } else {
                    if(n1>n2 && n2<n3){
                        System.out.println(n1 + " ," + n3 + " ," + n2);
                    } else {
                        if(n2>n3 && n3>n1){
                            System.out.println(n2 + " ," + n3 + " ," + n1);
                        } else {
                            if(n2>n1 && n1>n3){
                                System.out.println(n2 + " ," + n1 + " ," + n3);
                            } else {
                                if(n3>n1 && n1>n2){
                                    System.out.println(n3 + " ," + n1 + " ," + n2);
                                } else {
                                    if(n3>n2 && n2>n1){
                                        System.out.println(n3 + " ," + n2 + " ," + n1);
                                    }
                                }
                            }
                        }
                    }
                }
                sc.close();
    }
}
