import java.util.*;

public class TestLib {
    public static void main(String[] args)
    {
        Vector<String> strVector = new Vector<>();

        strVector.add("One");
        strVector.add("Two");
        strVector.add("Three");
        strVector.add("Four");
        strVector.add("Five");
        strVector.add("Six");
        strVector.add("Seven");
        strVector.add("Eight");
        strVector.add("Nine");
        strVector.add("Ten");

        LibGen.print(strVector);

        System.out.println("-----------------------------------------------------");

        ArrayList<Double> dblArrayList = new ArrayList<>();

        dblArrayList.add(3.2);
        dblArrayList.add(6.5);
        dblArrayList.add(1.45);
        dblArrayList.add(2.5);
        dblArrayList.add(9.83);

        LibGen.print(dblArrayList);

        System.out.println("-----------------------------------------------------");

        LinkedList<Integer> ltrLinkedList = new LinkedList<>();


        System.out.println("-----------------------------------------------------");

        Stack<DateD> dtStack = new Stack<>();

    }
}