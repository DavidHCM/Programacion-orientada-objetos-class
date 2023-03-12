import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Arreglos multidimensionales:

        //Aqui podemos ver que podemos inicializar la matriz sin indicar parametros de dimensiones pero.
        //Se tiene que especificar al inicializarla con dandole uno o unos valores.
        /*
        char[][] texto =
                {
                {'h','o','l','a'},
                {'m','u','n','d','o'},
                {'t','e'},
                {'s','a','l','u','d','o'}
                };


        System.out.println(texto.length);
        System.out.println(texto[0].length);
        System.out.println(texto[1].length);
        System.out.println(texto[2].length);
        System.out.println(texto[3].length);
        */
        //------------------------------------------------

        //Igualacion de arreglos:
        //Para clonar tendriamos que hacer texto1 = texto.clone();
        /*
        Esto es para una matriz que se tiene que copiar dentro de un for para poder clonar las rows y cols


        m1 = m2.clone();
        for(int row = @; row < ml.length; row ++) {
        mi[row] = m2[row].clone();

        for(... next dimension ...)
         */

        //------------------------------------------------
        //Ciclo for each
        /*
        double [] gastos = {1.1,2.2,3.3,4.4,5.5,6.7,7.7,8.8,9.9};
        double totalGastado = 0;
        //Ocupo una variable que almacenara y el array con el que trabajara.
        //Ademas que con este tiene un parametro donde ira sumando en 1 posicion.
        //Lo podemos ver como que gasto toma cada elemento del array y no lo modifica.
        for(double gasto : gastos)
        {
            totalGastado += gasto;
            gasto *= 1.16;
            System.out.println(gasto);
        }
        System.out.println(totalGastado);

         */

        //------------------------------------------------
        //Clase arrays:
        /*
        double [] gastos = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
        double [] gastos2 = {5.5,2.2,3.3,7.7,1.1,6.6,4.4,8.8,10.10};
        double clave = 3.3;

        //Aqui podemos ver la sintaxis donde es con un array y un valor o variable que tienen que ser del mismo tipo
        int pos = Arrays.binarySearch(gastos,11);
        System.out.println(pos);

        //Aqui tenemos un intento donde debemos de ordenarlo primero para despues buscar algo.
        Arrays.sort(gastos2);
        int pos1 = Arrays.binarySearch(gastos2,clave);
        System.out.println(pos1);

        //Aqui podemos copiarlo donde ponemos que vamos a copiar y la longitud nueva de la copia.
        double [] copia = Arrays.copyOf(gastos2,gastos2.length);

        for(double valor : copia){
            System.out.println(valor);
        }

        String copiaString = Arrays.toString(gastos);
        System.out.println(copiaString);

         */

        //------------------------------------------------
        //Ejercicio 3:

        int [][] matT = new int[4][];
        int i,j;
        for(i=0;i<4;i++)
        {
            for(j=0;i<4;j++)
            {
                 matT[i][j] = (int)(Math.random() * (20 - 2) + 2);
            }
        }





        //------------------------------------------------
        //Ejercicio 4:

        /*
        Scanner sc =new Scanner(System.in);

        System.out.println("Cuantas calificaciones se van a capturar?");
        int longi = sc.nextInt();

        float []cal = new float[longi];

        for(int i= 0;i<longi;i++){
            System.out.println("Ingresa la califiacion: ");
            float calfici = sc.nextFloat();
            cal[i] = calfici;
        }

        Arrays.sort(cal);
        int logitud = longi/2;
        System.out.println(cal[logitud]);
        */





    }
}