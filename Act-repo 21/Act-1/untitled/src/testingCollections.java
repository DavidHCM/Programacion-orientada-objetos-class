import java.util.Vector;

public class testingCollections {
    public static void main(String[] args) {
        //1.- Crear una lista dinámica sincronizada que almacene cadenas de texto
        Vector<String> test = new Vector<>();


        // Añadir los elementos: "uno", "dos", ... "seis"
        test.add(0,"uno");
        test.add(1,"dos");
        test.add(2,"tres");
        test.add(3,"cuatro");
        test.add(4,"cinco");
        test.add(5,"seis"); // No es necesario indicar el indice en este.


        //2.- Imprimir todos los elementos añadidos con un ciclo for e índice
        for(int i=0;i<test.size();i++)
        {
            System.out.println(test.get(i));
        }

        //3.- Reemplazar el elemento "cuatro" por "dos".
        test.set(test.indexOf("cuatro"),"dos");

        //4.- Imprimir la posición de los elementos "dos" y "cuatro"
        System.out.println("Elemento dos: " + test.indexOf("dos"));
        System.out.println("Elemento dos: " + test.indexOf("cuatro"));

        //5.- Reemplazar todos los elementos por su mayúscula

        for(int i = 0;i<test.size();i++)
        {
            test.set(i,test.get(i).toUpperCase());
        }


        //6.- Reemplazar todos los elementos por su mayúscula
        for (String s: test)
        {
            System.out.println(s);
        }

        //7.- Vaciar la lista con llamadas sucesivas a remove

        while(test.size() > 0 )
        {
            test.remove(0);
        }

        
    }
}