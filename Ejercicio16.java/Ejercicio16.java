import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Esto es un programa que nos indica si hay probabilidad de que nuestra pareja nos está siendo infiel.  El programa irá haciendo preguntas que el usuario contestará con verdadero o falso. Cada pregunta contestada como verdadero sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. A continuación se listan las preguntas del test.");
    int cont;
    cont=0;
    System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    System.out.println(" a) Verdadero.  b) Falso. ");
    String respuesta1=sc.next();
    if(respuesta1.equals ("Verdadero")){
    cont +=3;
    }


    System.out.println("Ha aumentado sus gastos de vestuario.");
    System.out.println(" a) Verdadero.  b) Falso. ");
    String respuesta2=sc.next();
    if(respuesta2.equals ("Verdadero")){
    cont +=3;
        }
        
        System.out.println("Ha perdido el interés que mostraba anteriormente por ti");
    System.out.println(" a) Verdadero.  b) Falso. ");
    String respuesta3=sc.next();
    if(respuesta3.equals ("Verdadero")){
    cont +=3;
        }

        System.out.println("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).");
        System.out.println(" a) Verdadero.  b) Falso. ");
        String respuesta4=sc.next();
        if(respuesta4.equals ("Verdadero")){
        cont +=3;
            }

            System.out.println(". No te deja que mires la agenda de su teléfono móvil. ");
            System.out.println(" a) Verdadero.  b) Falso. ");
            String respuesta5=sc.next();
            if(respuesta5.equals ("Verdadero")){
            cont +=3;
            }


            System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante. ");
            System.out.println(" a) Verdadero.  b) Falso. ");
            String respuesta6=sc.next();
            if(respuesta6.equals ("Verdadero")){
            cont +=3;
            }

            System.out.println(". Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a. ");
            System.out.println(" a) Verdadero.  b) Falso. ");
            String respuesta7=sc.next();
            if(respuesta7.equals ("Verdadero")){
            cont +=3;
            }


            System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo. ");
            System.out.println(" a) Verdadero.  b) Falso. ");
            String respuesta8=sc.next();
            if(respuesta8.equals ("Verdadero")){
            cont +=3;
            }


            System.out.println(". Has notado que últimamente se perfuma más. ");
            System.out.println(" a) Verdadero.  b) Falso. ");
            String respuesta9=sc.next();
            if(respuesta9.equals ("Verdadero")){
            cont +=3;
            }


            System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo. ");
            System.out.println(" a) Verdadero.  b) Falso. ");
            String respuesta10=sc.next();
            if(respuesta10.equals ("Verdadero")){
            cont +=3;
            }
            sc.close();

            if(cont <= 10){
                System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
            }else{
                if(cont > 10 && cont <=22 ){
                    System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
                } else{
                    if(cont > 22 ){
                        System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza. ");
                    }
                }
            }
    }
}
