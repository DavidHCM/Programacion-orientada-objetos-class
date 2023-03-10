//Import de la libreria de JOptionPane
import javax.sound.midi.SysexMessage;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        /*
        //String Pools
        //Al momento de crear dos string que son identicos sus elementos entonces su apuntador sera en el mismo lugar en memoria.
        String str1 = "Hola";
        String str2 = "Hola";
        //Pero si le pido que me haga un nuevo string que tenga los mismos elementos, entonces crea una nueva direccion de memoria para el string aunque tenga los mismos elementos.
        String str3 = new String("Hola");
        String str4 = new String("Adios");


        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equals("Hola"));

        //De esta manera no es recomendado.
        System.out.println("Hola".equals(str1));

        //Con operador de negacion donde veo si es igual, entonces se niega el resultado.
        System.out.println(!str1.equals(str4));


        //Intento con "if", aunque seria mejor solo usar equales y no intentarlo con un if y un ==. Principalmete aqui busco ver si la ubiacion es la misma.
        if(str1 == str2){
            System.out.println("Son iguales las ubicaciones.");
        }
        else{
            System.out.println("Son diferentes las ubicaciones.");
        }

        //Aqui verifico si es igual la ubiacion de los dos.
        if(str1 == str3){
            System.out.println("Son iguales las ubicaciones.");
        }
        else{
            System.out.println("Son diferentes las ubicaciones.");
        }

        //Intento como deberia ser con equals(), donde verifico el contenido mas que no la ubicacion.
        if(str1.equals(str3)){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("Son diferentes.");
        }

        if(str1.equals(str4)){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("Son diferentes.");
        }
        */
        //--------------------------------------------------

        //Impresion en cuadro de dialogo.

        //Sintaxis
        /*
        Sintaxis:
        JOptionPane.showMessageDialog(
        componente, Componente visual
        mensaje,
        Objeto: se invocará el método toString() del objeto
        titulo,
        Cadena de texto
        tipo_mensaje Número entero
        );
         */

        //--------------------------------------


        //Aqui tenemos los siguientes datos en orden: La posicion de la ventana, El texto dentro del cuadroo, El titulo del cuadro, El icono a mostrar (este ultimo se pudo haber puesto solo un 0).

        //JOptionPane.showMessageDialog(null, "Division entre 0", "Error aritemtico", JOptionPane.ERROR_MESSAGE);

        //Los cuadros de dialogo solo admiten cadenas de texto.
        //Entonces para imprimir valor numericos o logicos tenemos que convertirlos a un String.
        double PI = 3.141592;
        //String msg = "" + PI ; //msg = "3.141592";
        double radio = 9.5;
        /*
        //Aqui seria sin concatenar todo sin formato:
        String msg = "Radio = " + radio + "\n" + "Area = " + (PI * radio * radio) ;

        JOptionPane.showMessageDialog(null,msg,"Resultado",JOptionPane.ERROR_MESSAGE);

        */
        //__________________________________________________________


        //Se podria hacer el cuadro de texto usando un formato en un string.
        /*
        //Formato de cadenas.
        double base =2.3;
        double altura = 3.7;

        //Aqui estoy dando un formato el string.
        String salida = String.format("%.1f",base * altura / 2);

        System.out.println(base * altura / 2);
        System.out.printf("%.1f\n",(base * altura / 2));

        System.out.println(salida);
        */
        //Como seria con formato:

        //String str = String.format("Radio = %.1f\n Area = %.1f",radio,PI * radio * radio);

        //JOptionPane.showMessageDialog(null,str,"Resultado",JOptionPane.INFORMATION_MESSAGE);

        //Entrada de datos en JOptionPane:

        //Texto
        /*
        String entrada = JOptionPane.showInputDialog("Escribe tu nombre");

        JOptionPane.showMessageDialog(null,"Hola " + entrada,"Tu nombre",JOptionPane.INFORMATION_MESSAGE);

        //Entrada de datos con un valor numerico (lo convertiremos a un string)
        String s1 = "9.5", s2 = "10000000";
        double d = Double.parseDouble(s1); // d = 9.5
        long I = Long.parseLong(s2);  // I = 10,000,000
        //Con base a 10
        int i = Integer.parseInt("A5",16); //i = 0xA5 = 165
        */

        //Ejemplo de convertir el elemento obtenido de string a un entero:
        String strEdad = JOptionPane.showInputDialog("Tu edad: ");
        int edad = Integer.parseInt(strEdad);

        JOptionPane.showMessageDialog(null,"Tu edad es: " + edad + ", y dentro de un ano tendras: " + (edad + 1),"Tu edad",JOptionPane.PLAIN_MESSAGE);


        //------------------------------------------------------



    }
}