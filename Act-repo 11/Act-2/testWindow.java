public class testWindow {
    public static void main(String[] args) {
        BasicWindow bw1 = new BasicWindow();
        ExtendedWindow bw2 = new ExtendedWindow("Ventana Extendida");
        bw1.Display();
        bw1.Resize(11,16);
        bw1.Display();

        bw2.move(1199,-15);
        bw2.Display();




    }
}