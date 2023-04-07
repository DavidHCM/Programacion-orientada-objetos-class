public abstract class Shape3D {
    protected double x;
    protected double y;
    protected double z;

    public static final int DEFAULT_CORDS = 0;

    // Constructor
    public Shape3D(double x,double y,double z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
        move(x,y,z);
    }

    // Getters
    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double getZ()
    {
        return z;
    }

    // Setter
    public void move(double dx,double dy,double dz)
    {
        x += dx;
        y +=dy;
        z += dz;

        x = (x>0)? dx  : DEFAULT_CORDS;
        y = (y>0)? dy  : DEFAULT_CORDS;
        z = (z>0)? dz  : DEFAULT_CORDS;
    }

    // Datos abstractos
    public abstract double area();

    public abstract double volumen();

    // toString
    public String toString()
    {
        return "\nCoordenadas: <" + x + "," + y + "," + z + ">\n" + "Area: " + area() + "\nVolumen: " + volumen();
    }


}
