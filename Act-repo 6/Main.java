import javax.swing.*;
import java.util.Scanner;

public class Main {
    //Sesion 5.1
    public static void main(String[] args) {
        //Sesion de inicio con try/catch


        //------------------------------------------------------
        //EJEMPLO 1
        /*
        String vel = JOptionPane.showInputDialog("Ingresa la velocidad");


        //Aqui intentara hacer tod0 el codigo que podria tener alguna funcion que provoque una exception.
        try {
            double vel1 = Double.parseDouble(vel);
            if(vel1 <= 90){
                JOptionPane.showMessageDialog(null, "Todo en orden", "Velocidad con try", JOptionPane.INFORMATION_MESSAGE);

            }else{
                JOptionPane.showMessageDialog(null, "Foto multa", "Velocidad con try", JOptionPane.ERROR_MESSAGE);
            }
            //Se usa el formato donde si se captura una excepcion entonces ejecturar lo que esta dentro
            //De usarlo de manera general entonces seria con Exception ex. Pero si ocupo algo mas preciso entonces toma prioridad antes del catch general
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Formato ingresado no valido", "Velocidad con try", JOptionPane.INFORMATION_MESSAGE);
        }
        //Despues de capturar o no la exception entonces seguira corriendo el programa.
        */
        //--------------------------------------------------------------
        //EJEMPLO 2
        /*
        String vel = JOptionPane.showInputDialog("Ingresa la velocidad");
        //
        double vel1 = -1;
        try {
            vel1 = Double.parseDouble(vel);

        } catch (NumberFormatException ex) {
            if(vel1 < 0){
                JOptionPane.showMessageDialog(null, "Formato ingresado no valido", "Velocidad con try", JOptionPane.INFORMATION_MESSAGE);

            }else if(vel1 <= 90){
                JOptionPane.showMessageDialog(null, "Todo en orden", "Velocidad con try", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Foto multa", "Velocidad con try", JOptionPane.ERROR_MESSAGE);
            }

        }
        */
        //--------------------------------------------------------------

        //EJEMPLO 3
        /*
        int sent = 1;
        float precio;
        do {
            String pObj = JOptionPane.showInputDialog("Ingresa el precio del producto");
            if(pObj == null){
                break;
            }
            try{
                precio = Float.parseFloat(pObj);
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"El error fue que presionate enter ","Error",JOptionPane.ERROR_MESSAGE);
                continue;
            }
            if(precio < 0){
                JOptionPane.showMessageDialog(null,"El error fue de aritmetica al no ser valido","Error",JOptionPane.ERROR_MESSAGE);
                continue;
            }
            else{
                JOptionPane.showMessageDialog(null,"El precio con iva es: "+ (precio*1.16),"Error",JOptionPane.INFORMATION_MESSAGE);
                sent =0;
            }

        } while (sent != 0);
        */
        //--------------------------------------------------------
        //DECLARACION DE ARREGLOS
        Scanner entrada=new Scanner(System.in);
        int C,i,j;
        double matA[][];
        double matB[][];
        double matC[][];
        //Se puede hacer asi tambien: double matA[][] = new double[2][3];

        matA = new double[2][3];
        matB = new double[2][3];
        matC = new double[2][3];

        matA[0][0] = 3.2;
        matA[0][1] = 7.5;
        matA[0][2] = 4.9;
        matA[1][0] = 9.8;
        matA[1][1] = 4.0;
        matA[1][2] = 6.4;

        matB[0][0] = 2.1;
        matB[0][1] = 8.4;
        matB[0][2] = 3.2;
        matB[1][0] = 5.0;
        matB[1][1] = 3.8;
        matB[1][2] = 2.7;



        for(i=0;i<matA.length;i++){
            for(j=0;j<matA[0].length;j++){
                matC[i][j]=matA[i][j] + matB[i][j];
            }
        }

        for(i=0;i<matA.length;i++){
            for(j=0;j<matA[0].length;j++){
                System.out.println(matC[i][j]);
            }
        }








    }
}