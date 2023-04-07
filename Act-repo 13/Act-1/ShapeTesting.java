import java.awt.*;

public class ShapeTesting
{
    public static final int NUMFIG = 10;
    public static void main(String[] args)
    {
        /*
        Sphere testS1 = new Sphere(10,10,10,2.3);
        System.out.println(testS1);

        Cylinder testC1 = new Cylinder(15,15,15,4.7,5.9);
        System.out.println(testC1);

        Box testB1 = new Box(20,20,20,5,10,15);
        System.out.println(testB1);
        */

        Shape3D [] myShapes = new Shape3D[NUMFIG];

        double v =0;
        for(int i=0;i<myShapes.length;i++)
        {
            if(i % 3 == 0)
            {
                myShapes[i] = new Sphere(i*5,i*5,i*5,i*10);
            }
            else if( i % 3 == 1)
            {
                myShapes[i] = new Cylinder(i*7,i*7,i*7,i*20,i*20);
            }
            else
            {
                myShapes[i] = new Box(i*10,i*10,i*10,i*30,i*35,i*40);
            }
        }

        for(int j =0;j< myShapes.length;j++)
        {
            System.out.println(myShapes[j]);
        }
    }
}