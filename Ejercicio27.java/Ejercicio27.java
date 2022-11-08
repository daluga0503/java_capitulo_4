import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija un sabor (manzana, fresa o chocolate):");
        String sabor = sc.next();
        double precio=0;
        double precionata = 2.50;
        Double precionombre=2.75;

        switch (sabor) {
            case "manzana":
                precio=18;
                break;
                case "fresa":
                precio=16;
                break;
                case "chocolate":
                    System.out.print("¿Chocolate negro o blanco: ");
                    String tipochocolate=sc.next();
                
                    switch (tipochocolate) {
                        case "negro":
                            precio=14;
                            break;
                            case "blanco":
                            precio=15;
                            break;
                    
                        default:
                            break;
                        }
                            break;
            
                default:
                break;

        }

        System.out.print("¿Deseas añadirle nata? (si o no): ");
        String nata= sc.next();
        if(nata .equals("si")){
            System.out.println("Con nata:  " + precionata);
        }else{
            if(nata .equals("no")){
                precionata=0.00;
            }
        }

        System.out.print("¿Deseas añadirle un nombre? (si o no): ");
        String nombre= sc.next();
        if(nombre .equals("si")){
            System.out.println("Con nombre:  " + precionombre);
        }else{
            if(nombre .equals("no")){
                precionombre=0.00;
            }
        }


double preciototal=precio+precionata+precionombre;
System.out.printf("Total:  %.2f",preciototal);
sc.close();
    }
}
