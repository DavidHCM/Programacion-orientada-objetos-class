import java.util.Collection;
import java.util.List;

public class LibGen
{

    // Caso 1
    public static void print(List<?> list)
    {
        for(int i=0;i<list.size();i++)
        {
            // El 2d nos sirve para alinear con espacios apatir de el lado izquierdo
            System.out.printf("(%2d) %s\n",i+1,list.get(i));
        }
    }


    // Caso 2
    public static <T> int frequency(Collection<T> collection, T object)
    {
        int sent=0;
        for (Object o:collection)
        {
            if(object.equals(o));
            {
                sent++;
            }
        }
        return sent;
    }

    // Caso 3
    public static int greatestInteger(Collection<Integer> collection)
    {
        Integer G = null;
        for(Integer i: collection)
        {
            if(G == null || i > G)
            {
                G = i;
            }
        }

        return G;
    }

    // Caso 4
    public static double greatestNumber(Collection<Number> collection)
    {
        Number G = null;
        for (Number T: collection)
        {
            if(G == null || T.doubleValue() > G.doubleValue())
            {
                G = T;
            }
        }

        return G.doubleValue();
    }


    // Caso 5
    public static double greatestNumber(Collection<? extends Number> collection)
    {

    }


}
