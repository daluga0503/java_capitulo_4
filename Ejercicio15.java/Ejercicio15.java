import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("En este programa vamos a realizar pirámides según lo deseado");
        System.out.println("Si quieres una pirámide con el vértice hacia arriba pulse: 1");
        System.out.println("Si quieres una pirámide con el vértice hacia abajo pulse: 2");
        System.out.println("Si quieres una pirámide con el vértice hacia la izquierda pulse: 3");
        System.out.println("Si quieres una pirámide con el vértice hacia la derecha pulse: 4");
        int num = sc.nextInt();

        switch(num) {
            case 1:
                System.out.println("      *       ");
                System.out.println("    * * *     ");
                System.out.println("  * * * * *   ");
                System.out.println("* * * * * * * ");
                break;
            case 2:
            System.out.println("* * * * * * * ");
            System.out.println("  * * * * *   ");
            System.out.println("    * * *     ");
            System.out.println("      *       ");
                break;
            case 3:
            System.out.println("       *");
            System.out.println("     * *");
            System.out.println("   * * *");
            System.out.println(" * * * *");
            System.out.println("   * * *");
            System.out.println("     * *");
            System.out.println("       *");
                break;
            case 4:
            System.out.println("*        ");
            System.out.println("* *      ");
            System.out.println("* * *    ");
            System.out.println("* * * *  ");
            System.out.println("* * *    ");
            System.out.println("* *      ");
            System.out.println("*        ");
                break;
                default:
    }
    sc.close();
}
}
