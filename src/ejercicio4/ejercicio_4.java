package ejercicio4;
import java.util.Scanner;
public class ejercicio_4 {
    public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa tu calificacion ");
            double a = sc.nextDouble();
            if(a<70){
                System.out.println("Usted esta reprobado ");
            }
            else if(a>=70 && a<=100){
                System.out.println("Usted esta aprobado");
            }
        }
    }

