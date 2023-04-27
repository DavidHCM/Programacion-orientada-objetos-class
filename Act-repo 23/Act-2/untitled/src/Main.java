import java.util.Date;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        Date dat = new Date();

        TreeSet<Date> datTreeSet = new TreeSet<>();

        datTreeSet.add(dat);
        datTreeSet.add(new Date(30,4,2023));


    }
}