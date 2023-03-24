public class Jet extends Vehicle implements Flyable
{
    private static final double HEIGHT_UP = 10;

    private static final double HEIGHT_DOWN = 5;

    private double height = 0;


    @Override
    public void rise()
    {
        height += HEIGHT_UP;
        if(height >= MAX_HEIGHT)
        {
            height = MAX_HEIGHT;
        }
        System.out.println("Jet rises at: " + height);
    }

    @Override
    public void descend()
    {
        height += HEIGHT_DOWN;
        if(height < 0 )
        {
            height = 0;
        }
        System.out.println("Jet descends at: " + height);
    }

    @Override
    public double getHeight()
    {
        return height;
    }

}
