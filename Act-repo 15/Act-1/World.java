public class World {
    public static void main(String[] args) {
        Bird b1 = new Bird();
        b1.rise();
        b1.descend();
        b1.descend();
        b1.sleep();
        b1.move();
        b1.die();

        Bird b2 = new Bird();
        for(int i =0;i<25;i++)
        {
            b2.rise();
        }
    }
}