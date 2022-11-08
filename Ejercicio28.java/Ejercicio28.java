import java.util.Scanner;
public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa jugaremos al piedra, papel o tijeras.");
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String jugada1 = sc.next();
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        String jugada2 = sc.next();
        int resultado;
            if(jugada1.equals(jugada2)){
                System.out.println("Empate");
            }else{
                if(jugada1 .equals("piedra") && jugada2.equals("papel")){
                    System.out.println("Gana el jugador 2.");
                }else{
                    if(jugada1 . equals("piedra") && jugada2.equals("tijera")){
                        System.out.println("Gana el jugador 1.");
                    }else{
                        if(jugada1.equals("papel") && jugada2.equals("piedra")){
                            System.out.println("Gana el jugador 1.");
                        }else{
                            if(jugada1.equals("papel") && jugada2.equals("tijera")){
                                System.out.println("Gana el jugador 2.");
                    }else{
                        if(jugada1.equals("tijera") && jugada2.equals("piedra")){
                            System.out.println("Gana el jugador 2.");
                    }else{
                        if(jugada1.equals("tijera") && jugada2.equals("papel")){
                            System.out.println("Gana el jugador 1.");
                    }else{
                        System.out.println("Error al introducir las jugadas.");
                    }
                        }
                }
            }
            }
        }
    }
    sc.close();
}
}
