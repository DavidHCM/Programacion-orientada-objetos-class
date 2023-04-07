public class Sphere extends Shape3D{

    protected double radius;

    // Constructor
    public Sphere(double x,double y,double z,double radius)
    {
        super(x,y,z);
        this.radius = 0;
        resize(radius);
    }




    // Getters
    public double getRadius()
    {
        return radius;
    }

    // Setter
    public void resize(double rad)
    {
        radius += rad;

        radius = (rad > 0)? radius: 0;
    }

    // Calculo
    @Override
    public double area()
    {
        return 4 * Math.PI * Math.pow(radius,2);
    }
    @Override
    public double volumen()
    {
        return (4/3) * Math.PI * Math.pow(radius,3);
    }


    // toString

    public String toString()
    {
       return "\nESFERA\n" + "Radio: " + radius + super.toString();
    }

}
