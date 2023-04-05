public class Bird extends Animal implements Flyable{

    private static final double HEIGHT_UP = 4;

    private static final double HEIGHT_DOWN = 2.5;

    private double height = 0;

    private double stats = 12;


    @Override
    public void rise()
    {

        height += HEIGHT_UP;
        if(height >= MAX_HEIGHT)
        {
            height = MAX_HEIGHT;
        }
        System.out.println("Bird rises at: " + height);
    }

    @Override
    public void descend()
    {
        height -= HEIGHT_DOWN;
        if(height < 0 )
        {
            height = 0;
        }
        System.out.println("Bird descends at: " + height);
    }

    @Override
    public double getHeight()
    {
        return height;
    }

    public void move()
    {
        System.out.println("The bird moves");
    }

}
