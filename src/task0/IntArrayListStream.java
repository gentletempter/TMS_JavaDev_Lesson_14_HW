package task0;

import java.util.ArrayList;
import java.util.OptionalDouble;

/**
 * The class demonstrates the work of Stream API with Integer values
 */
public class IntArrayListStream {
    static ArrayList<Integer> myList = arrayListInitialization();

    public static void removeDuplicates() {
        myList.stream()
                .distinct()
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

    public static void getEvenFromRange() {
        myList.stream()
                .filter(x -> x >= 7 && x <= 17)
                .filter(x -> (x % 2) == 0)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

    public static void elementsMultiplication() {
        myList.stream()
                .map(x -> x * 2)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

    public static void getSortedLimit() {
        myList.stream()
                .sorted()
                .limit(4)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

    public static void getCountOfElements() {
        System.out.println(myList.stream().count());
    }

    public static void getAverage() {
        OptionalDouble average = myList.stream()
                .mapToInt(x -> x).average();
        if (average.isPresent()) {
            System.out.println(average.getAsDouble());
        }
    }

    private static ArrayList<Integer> arrayListInitialization() {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add((int) (Math.random() * 20));
        }
        System.out.println("Generated list==>" + myList);
        return myList;
    }
}
