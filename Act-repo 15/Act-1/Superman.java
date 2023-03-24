public class Superman extends Man implements Flyable
{
    private int power = 20;

    private static final double HEIGHT_UP = 20;

    private static final double HEIGHT_DOWN = 15;

    private double height = 0;

    public void runFast()
    {
        System.out.println("Superman runs fast");
    }

    public void losePower(int krypto)
    {
        power -= krypto;
        if(power <= 0)
        {
            power = 0;
        }
        System.out.println("Superman loses power, current power: " + power);

        if(power == 0)
        {
            die();
        }

    }


    @Override
    public void rise()
    {
        height += HEIGHT_UP;
        if(height >= MAX_HEIGHT)
        {
            height = MAX_HEIGHT;
        }
        System.out.println("Superman rises at: " + height);
    }

    @Override
    public void descend()
    {
        height += HEIGHT_DOWN;
        if(height < 0 )
        {
            height = 0;
        }
        System.out.println("Superman descends at: " + height);
    }

    @Override
    public double getHeight()
    {
        return height;
    }

}
