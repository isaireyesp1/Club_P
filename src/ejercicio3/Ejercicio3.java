package ejercicio3;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ejercicio3 {
    public static void main(String[] args){
        String a = JOptionPane.showInputDialog("Ingresa tu nombre");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nom = sc.nextLine();
        
        if(nom.equalsIgnoreCase("isai")){
            System.out.println("Bienvendo "+nom);
            System.out.println("Admin");
        }
        else {
            System.out.println("Bienvenido "+nom);
        }
    }
}

/*

package ejercicio3;
import javax.swing.JOptionPane;
public class Ejercicio3 {
    public static void main(String[] args){
      String a = JOptionPane.showInputDialog("Ingresa tu nombre");
      System.out.println("Bienvenido "+ a);
    }
}

*/
