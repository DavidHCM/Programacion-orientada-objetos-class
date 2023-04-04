public class BasicWindow {
    public static final int MIN_WIDTH = 10, MIN_HEIGHT =15;

    protected int x,y;
    protected int width,height;

    public BasicWindow(int x,int y,int w,int h)
    {
        this.x = (x < 0) ? 0 : x ;
        this.y = (y < 0) ? 0 : y ;

        width = (w < MIN_WIDTH) ? MIN_WIDTH : w ;
        height = ( h < MIN_HEIGHT) ? MIN_HEIGHT : h ;
    }

    public BasicWindow()
    {
        this(0,0,MIN_WIDTH,MIN_HEIGHT);
    }

    public void Display()
    {
        System.out.printf("Locacion: X:%d, Y:%d\n",this.x,this.y);
        System.out.printf("Size: W:%d, H:%d\n",this.width,this.height);
    }

    public void Resize(int dw, int dh)
    {
        width += dw;
        height += dh;

        width = width >= MIN_WIDTH ? width : MIN_WIDTH;
        height = height >= MIN_HEIGHT? height : MIN_HEIGHT;

    }

}
