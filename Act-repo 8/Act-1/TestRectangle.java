import org.w3c.dom.css.Rect;

public class TestRectangle {
      public static void main(String[] args) {
            /*
            Rectangle r1 = new Rectangle();
            Rectangle r2 = new Rectangle();
            System.out.println(r1.area());

            r1.height = 15.2;
            r1.base = 7.5;

            System.out.println(r1.area());

            r2.base = 32.52;
            r2.height = 7.24;
            System.out.println(r2.area());

            Rectangle [] arrRect = new Rectangle[5];

            arrRect[0] = new Rectangle();
            arrRect[1] = new Rectangle();

            arrRect[1].print();
            System.out.println(" ");
            r1.print();


            //Ejemplo de intstancia de apuntador
            r2 = r1;
            r2.print();
            //Aqui podemos ver que van al mismo espacio de meomoria:
            System.out.println(r1.area());
            System.out.println(r2.area());

             */

            //Parte de la sesion 8
            /*
            Rectangle r1 = new Rectangle(10,6.5);
            Rectangle r2 = new Rectangle(r1.perimeter() / 2.0,r1.getHeight() * 2.0);
            Rectangle r3 = new Rectangle(r2.getBase(),r1.area());
            Rectangle r4 = new Rectangle();

            r1.print();
            r1.setBase(-5.0);
            r1.setHeight(200);
            r1.print();

            r3.print();
            r4.print();


             */

            //Parte de la sesion 9:

            //Imprmir direccion de memoria en el anterior caso para impresion de objetos
            //Pero ahora con el method overriding usamos el mismo nombre pero lo sobrescribimos.

            Rectangle r1 = new Rectangle(10,6.5);
            Rectangle r2 = new Rectangle(r1.perimeter() / 2.0,r1.getHeight() * 2.0);

            String s1 = "Hola";
            //Tengo que declarar una varibale objeto
            Object o1 = s1;
            String s3 = null;

            r2.setBase(r1.getBase());
            r2.setHeight(r1.getHeight());
            //Aqui estoy imprimiendo la direaccion de memoria del metodo.

            //N numero de objetos puede usar el mismo codigo.
            Rectangle r3 = r2.clone();
            if(r1.equals(r3)) System.out.println("r1 es igual a r3");

            r1.setBase(99.9);
            r2.setBase(53.4);

            if(!(o1 instanceof String)){
                  System.out.println("o1 es una objeto de String");
                  String s2 = (String)o1;
                  System.out.println("o1 tiene un len de: " + s2.length());
            }
            else{
                  System.out.println("o1 no es una objeto de String");
            }


            if(!(o1 instanceof Rectangle)){
                  System.out.println("o1 es una objeto de Rectangle");
            }
            else{
                  System.out.println("o1 no es una objeto de Rectangle");
            }

            System.out.println(r1);



      }

}
