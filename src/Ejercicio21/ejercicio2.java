package Ejercicio21;
import javax.swing.JOptionPane;
public class ejercicio2 {
    public static void main(String[] args){
     double sum,res,mul,div;
     String num1 = JOptionPane.showInputDialog("Ingresa el segundo numero ");
     double n1 = Double.valueOf(num1);
     String num2 = JOptionPane.showInputDialog("Ingresa el segundo numero ");
     double n2 = Double.valueOf(num2);
     sum = n1 + n2;
     res = n1 - n2;
     mul = n1 * n2;
     div = n1 / n2;
     JOptionPane.showMessageDialog(null, "Suma = "+sum+"\nResta = "+res+"\nMultiplicacion = "+mul+"\nDivicion = "+div);
      
}
}