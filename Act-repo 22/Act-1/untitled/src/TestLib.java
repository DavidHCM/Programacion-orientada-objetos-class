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
        strVector.add("One");
        strVector.add("Seven");
        strVector.add("Eight");
        strVector.add("One");
        strVector.add("Ten");
         /*
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

        dtStack.add(new DateD());
        dtStack.add(new DateD(24,4,2023));
        dtStack.add(new DateD());
        dtStack.add(new DateD(1,1,2023));
        dtStack.add(new DateD(1,5,2023));

        LibGen.print(dtStack);

        System.out.println("-----------------------------------------------------");

        HashSet<String> strHashSet = new HashSet<>();

        strHashSet.add("Uno");
        strHashSet.add("Dos");
        strHashSet.add("Tres");
        strHashSet.add("Cuatro");
        strHashSet.add("Cinco");

        //LibGen.print(strHashSet);

        //------------------------------------------------------------------------
        HashSet<Integer> intHashSet = new HashSet<>();


        intHashSet.add(1500);
        intHashSet.add(2000);
        intHashSet.add(3000);

        LibGen.frequency(strVector,"Nine");
        LibGen.frequency(intHashSet,1500);

        System.out.println( LibGen.frequency(strVector,"One"));
        System.out.println( LibGen.frequency(intHashSet,3000));
        */

        //------------------------------------------------------------------------
        HashSet<Integer> intHashSet = new HashSet<>();


        intHashSet.add(1500);
        intHashSet.add(2000);
        intHashSet.add(3000);
        intHashSet.add(900);
        intHashSet.add(200);
        intHashSet.add(50);
        intHashSet.add(42320);
        intHashSet.add(12);

        System.out.println( LibGen.frequency(strVector,"One"));
        System.out.println( LibGen.frequency(intHashSet,1500));

        System.out.println(LibGen.greatestInteger(intHashSet));


        HashSet<Number> nmbSet = new HashSet<>();

        nmbSet.add(3.5);
        nmbSet.add(20);
        nmbSet.add(1_000_000_000);
        nmbSet.add(20000.345);

        System.out.println("El numero mas grande en general es: " + LibGen.greatestNumber(nmbSet));


    }
}