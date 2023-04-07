public class Cylinder extends Shape3D
{
    protected double radius;

    protected double height;

    // Constructor
    public Cylinder(double x,double y,double z,double radius,double height)
    {
        super(x,y,z);
        this.radius = 0;
        this.height = 0;
        resize(radius,height);
    }



    // Getters
    public double getRadius()
    {
        return radius;
    }

    public double getHeight()
    {
        return height;
    }

    // Setter
    public void resize(double rad,double drh)
    {
        radius += rad;
        height += drh;

        radius = (rad > 0)? radius: 0;
        height = (drh > 0)? height: 0;
    }

    // Calculo
    @Override
    public double area()
    {
        return (2* Math.PI * Math.pow(radius,2)) + (2*height *Math.PI * radius);
    }
    @Override
    public double volumen()
    {
        return height * Math.PI * Math.pow(radius,2);
    }

    // toString

    public String toString()
    {
        return "\nCILINDRO\n" + "Radio: " + radius + "\nAltura: " + height + super.toString();
    }
}
