package ejercicio2;
import java.util.Scanner;
public class ejercicio_2 {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      double sum,res,mul,div;
      System.out.println("Ingresa el primer numero");
      double n1 = sc.nextDouble();
      System.out.println("Ingresa el segundo numero");
      double n2 = sc.nextDouble();
      sum = n1 + n2;
      res = n1 - n2;
      mul = n1 * n2;
      div = n1 / n2;
      System.out.println("Suma = "+sum);
      System.out.println("Resta = "+res);
      System.out.println("Multiplicacion = "+mul);
      System.out.println("Divicion = "+div);
  }  
}
