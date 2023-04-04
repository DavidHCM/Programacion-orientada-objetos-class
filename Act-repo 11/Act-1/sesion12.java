import javax.swing.*;

/*
// Esto permite importar todos los elementos staticos de la clase.
import static javax.swing.JOptionPane.*;


public class sesion12 {
    public static void main(String[] args) {
        showMessageDialog(null,"Hola","Saludo",INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"hola","Saludo",INFORMATION_MESSAGE);
    }
}
 */

public class sesion12
{
    public static void main(String[] args)
    {
        Singleton d1 = Singleton.getInstance();
        Singleton d2 = Singleton.getInstance();

        d1.incX();
        d1.incX();
        d1.incX();

        d2.incX();


        System.out.println("los valores: " + d1.getX()+d2.getX());



    }
}