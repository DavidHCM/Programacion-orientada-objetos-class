public class Singleton {

    private static Singleton instance = null;
    private int x = 0;

    private Singleton()
    {

    }

    public static Singleton getInstance() {
        if(instance == null) instance = new Singleton();
        return instance;
    }

    public void incX()
    {
        x++;
    }

    public int getX()
    {
        return x;
    }



}
