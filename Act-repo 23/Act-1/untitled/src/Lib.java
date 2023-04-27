public class Lib
{
    public static double distance(int temp,double ... numbers) {
        double sum = 0;
        for(double n : numbers)
        {
            sum += Math.abs(temp - n);
        }

        return sum / numbers.length;
    }



}
