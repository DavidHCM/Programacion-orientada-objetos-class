public class Vehicle
{

    private static double SPEED_INC = 10;
    private static double BREAK_SPEED = 5;
    private static double FUEL_WASTE = 2.5;
    protected double fuel=0;
    protected double speed=0;

    public void speedUp()
    {
        System.out.println("Speeding up");

        if(fuel > 0)
        {
            speed += SPEED_INC;
            fuel -= FUEL_WASTE;
        }
        else
        {
            System.out.println("There is no more fuel");
        }

    }

    public void slowDown()
    {
        System.out.println("Slowing down");
        if(speed > 0)
        {
            speed -= BREAK_SPEED;
        }
        else
        {
            System.out.println("You cant slow down more");
        }


    }

    public double getSpeed()
    {
        return speed;
    }

    public double getFuel()
    {
        return fuel;
    }

    public void loadFuel(double f)
    {
        System.out.print("Fuel status: " + fuel);
        fuel += f;
    }

}
