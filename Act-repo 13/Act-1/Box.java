public class Box extends Shape3D
{
    protected double width;

    protected double height;
    protected double depth;

    // Constructor
    public Box(double x,double y,double z,double width,double height,double depth)
    {
        super(0,0,0);
        this.width = 0;
        this.height = 0;
        this.depth = 0;
        resize(width,height,depth);
    }


    // Getters
    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    public double getDepth()
    {
        return depth;
    }

    // Setter
    public void resize(double dw,double dh,double dd)
    {
        width += dw;
        height += dh;
        depth += dd;

        width = (dw > 0)? width: 0;
        height = (dh > 0)? height: 0;
        depth = (dd > 0)? depth: 0;
    }


    // Calculo
    @Override
    public double area()
    {
        return 2* height * (width + depth);
    }
    @Override
    public double volumen()
    {
        return width*height*depth;
    }


    // toString
    public String toString()
    {
        return "\nBOX\n" + "Anchura:" + width + "\nAltura: " + height + "\nProfundidad: " + depth + super.toString();
    }
}
