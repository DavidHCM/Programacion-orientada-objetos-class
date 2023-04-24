import java.util.List;

public class LibGen
{

    public static void print(List<?> list)
    {
        for(int i=0;i<list.size();i++)
        {
            // El 2d nos sirve para alinear con espacios apatir de el lado izquierdo
            System.out.printf("(%2d) %s\n",i+1,list.get(i));
        }
    }



}
