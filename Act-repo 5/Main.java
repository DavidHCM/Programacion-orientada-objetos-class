import javax.swing.*;
import java.util.Scanner;

public class Main {

    //Sesion 5
    //Operadores aritmeticos unitarios
    public static void main(String[] args) {
        //Ejemplo de for
        /*
        float PI = 3.1415f;

        //Ejemplo 1:imprime caracteres
        for (char c1 = 'A'; c1 <= 'Z'; c1++) {
            System.out.print(c1);
        }
        //Ejemplo 2: imprime el seno de ángulos en radianes (de 0° a 180°)
        for (double X = 0; X < PI; X += PI / 180) {
            System.out.println(Math.sin(X));

        }

         */


        //----------------------------


        //Ejemplo de uso de break, sintaxis:
        /*
        //Ejemplo 1:
        do {
            sentencias;
            if(ExLog1) {
                sentencias 2;
                break;
            }
        } while(ExLog2);

        //Ejemplo 2 de lo mismo sin break:
        do {
            sentencias;
            if(!ExLog1) {
                sentencias 2;
            }
        } while(ExLog2 && !ExLog2);
         */

        //----------------------------

        //Mismo ejemplo con continue; para saltar iteraciones
        /*
        do {
            sentencias;
            if(ExLog1) {
                sentencias 2;
                continue;
            }
        } while(ExLog2);

        Ejemplo 2 sin continue:
                do {
            sentencias;
            if(!ExLog1) {
                sentencias 2;
            }
        } while(ExLog2);
         */

        //----------------------------

        // Ejercicio 1:
        Scanner sc = new Scanner(System.in);


        int sent = 1,iter = 0,intent = 0;
        do {
            String pass1 = "iteso123";
            String pass = JOptionPane.showInputDialog("Ingrese la password: ");
            if(pass == null){
                intent = 1;
                break;
            }


            if (pass1.equals(pass)) {
                JOptionPane.showMessageDialog(null, "Acertaste en: " + iter + " intentos", "Password", JOptionPane.INFORMATION_MESSAGE);
                sent = 0;
                break;

            } else {
                JOptionPane.showMessageDialog(null, "Clave incorrecta", "Password", JOptionPane.ERROR_MESSAGE);
                iter++;
            }

            if(intent == 1){
                JOptionPane.showMessageDialog(null, "Lo intentaste", "Password", JOptionPane.ERROR_MESSAGE);

            }

        } while (sent != 0);


        //Ejercicio 2:
        /*
        String iter = JOptionPane.showInputDialog("Ingrese las iteraciones: ");
        int iter1 = Integer.parseInt(iter);
        double Pi = 0,num = 4,den = 1,op = 1;

        for(int i = 0;i<=iter1;i++){
            Pi += op * (num / den);
            den += 2;
            op *= -1;
        }
        JOptionPane.showMessageDialog(null,"El valor acercado es: " + Pi,"PI",JOptionPane.INFORMATION_MESSAGE);
        */

    }
}