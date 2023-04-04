public class ExtendedWindow extends BasicWindow {
    public static final int MAX_X = 1200, MAX_Y =1080;

    protected String title;

    public ExtendedWindow(int x,int y,int w, int h, String title)
    {
        // El super tiene que ser la priemra linea del constructor padre y ya estara haciendo las comparaciones anteriores.
        super(x,y,w,h);
        this.title = title;

    }

    public ExtendedWindow(String title)
    {
        this(0,0,MIN_WIDTH,MIN_HEIGHT,title);
    }

    // Sobrescritura (override) del método display() de BasicWindow
    // Definir un método con mismo nombre y parámetros que otro en la clase base
    // Con la anotación @Override nos obligamos a sobrescribir correctamente
    // el método: si no lo escribimos bien: error de sintaxis

    @Override
    public void Display()
    {
        System.out.printf("Titulo: %s\n",title);
        // Por que asi se puede en la segunda linea?
        // Por que no es un constructor, donde aqui estoy llamando que haga todos los elementos que tiene el Display
        // Del BasicWindow por medio del super.Display(); que ya hice en el pasado.
        super.Display();
    }

    public void move(int dx, int dy)
    {
         x += dx;
         y += dy;

        x = x < 0 || x > MAX_X ? MAX_X : x;
        y = y < 0 || y > MAX_Y? MAX_Y : y;
    }
}
