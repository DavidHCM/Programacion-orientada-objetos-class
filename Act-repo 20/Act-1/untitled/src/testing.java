import javax.rmi.ssl.SslRMIClientSocketFactory;

public class testing
{
    public static void main(String[] args)
    {
        /*
        GDrawer <String> gdrawer1 = new GDrawer <String> ();
        GDrawer <String> gdrawer2 = new GDrawer<>(); // Notacion de diamante por que hace una diferencia de tipo

        GDrawer <Integer> gDrawer3 = new GDrawer<>();
        GDrawer <Short> gDrawer4 = new GDrawer<>();

        gdrawer1.put("Hola");
        System.out.println(gdrawer1.peek());
        System.out.println(gdrawer1.remove());
        System.out.println(gdrawer1.peek());
        gdrawer1.put("Adios");
        System.out.println(gdrawer1.remove());

        //=============================

        gDrawer3.put(2);
        System.out.println(gDrawer3.peek());

        //=============================

        GDrawer<Number> gDrawer5 = new GDrawer<>(); // Con este number podremos mandar cualquier numero que tendra cualquier tipo ded dato de la clase hija
        gDrawer5.put(874.5);
        System.out.println(gDrawer5.remove());
        gDrawer5.put(20_000L);
        System.out.println(gDrawer5.remove());
        gDrawer5.put(5.6f);
        System.out.println(gDrawer5.remove());

        System.out.println(gDrawer3);

         */

        //=============================
    /*
        BDrawer <String, Float> bDrawer = new BDrawer<>();

        bDrawer.put1("Mil Quinientos");
        bDrawer.put2(874.5f);

        System.out.println(bDrawer.remove1());
        System.out.println(bDrawer.remove2());
     */

        Persona ter1 = new Persona("1","2","3");
        GDrawer <Persona> test1 = new GDrawer<>();

        test1.put(ter1);
        System.out.println();
    }
}