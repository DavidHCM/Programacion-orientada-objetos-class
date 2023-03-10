//Estos son llamados clases

//Comentarios exclusivos de Java. /** y */
/** El "System" lo vemos como una clase, el "out" como un objeto y el "print" como un metodo.\
 * Uno es con salto de linea y otro sin salto de linea
 *
 */

//Depende de donde comentes dependera de donde se posicion y ayude la documentacion
public class Main {
    /**
     * Aqui se nota los usos del @
     * @param args
     * @return Regresa al vacio por que finaliza la ejecucion del programa.
     */


    //Estos son llamados los metodos
    public static void main(String[] args) {

        System.out.println("Hello world!");
        /*
         * El usar el @ ayuda a buscar diferentes elementos del entorno para usarse.
         * Y recordar usar el JavaDoc
         */

        //------------------------------------------------------------------------
        /*
        Convenciones a utilizar:
        Clases, interfaces, excepciones y enumeraciones: PascalCase
        Atributos y métodos: camelCase
        Constantes: ALL_CAPS
        Paquetes: lowercase.lowercase...
        Variables locales: camelCase O small_caps
         */

        //Ejemplos de declaracion de variables (Es igual a C)
        /*
        Sintaxis:
        tipodato identificador [= valor];
        tipodato identificador, [= valor1], identificador, [= valor2], ...;
        Ejemplos:
        int edad = 39;
        double area, base = 5.7, altura;
        Error de sintaxis: leer una variable a la que no se le ha asignado un valor:
        area = base * altura;

         */
        //Ejemplo

        int edad = 39;
        
        double area, base = 2.7, altura = 3.2;

        area = base * altura;
        System.out.println("El area es: " + area);
        System.out.printf("El area con decimales indicados es: %.3f\n", area);
        //Puedo usar acentos.
        System.out.println("El edád es: " + edad);
        //----------------------------------------
        //Tipos de datos:
        //Tipos atomicos: Enteros;
        //Se pueden alamcenar los numeros en Decimal, Hexadecimal, Octal, Binario. Y tambien para separar digitos el usar _
        // int usa 32 bits
        //Con el long se necesita especificar un L al final del numero, ejemplo: 90000000000L
        //Reales;
        //float de 32 bits
        //double de 64 bits
        //Si quiero indicar un numero float se indica con una F en el numero al final.
        //Logicos;
        //Tipo de dato de verdadero o falso, osea booleano.
        //Se usa con boolean, y es de un byte. Se usa "true" o "false".
        //Caracter;
        //char con tamano de 2 bytes, solo haciendolo con comillas simples 'a', '3', '#'
        //Tambien se puede con un numero en rango de 0 .... 62,000
        //Unicode;
        //Se pueden representar signos como PY con 960.
        //Ejemplo; char c = 960; (Es necesario configurarlo para esto)

        char c = 960;
        System.out.println("\n" + c);

        //Cadenas de texto;
        //Esto es con una clase llamada string.
        //Una variable string mejor visto como un objeto que sirve para manipularlo.
        //La unica otra manera es solo con comillas dobles. Ejemplo con cadena de caracteres

        String s1 = " Hola ";
        char c1 = s1.charAt(3); //c1 = '1'

        //Longitud
        int len = s1.length();  // len = 6;

        String s2 = s1.toUpperCase(); //s2 = " HOLA "

        String s3 = s2.trim();  // s3 = "HOLA"


    }
}
