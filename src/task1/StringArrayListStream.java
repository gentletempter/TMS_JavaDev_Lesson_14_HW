package task1;

import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * The class demonstrates the work of Stream API with Strings
 */
public class StringArrayListStream {
    static String[] students = {"Антон", "Мария", "Алина", "Виталий", "Александр", "Стас", "Александр",
            "Кирилл", "Анатолий", "Ольга", "Владимир", "Кирилл", "Валентин", "Павел"};

    public static void getMyNameCount() {
        Stream<String> stringStream = Stream.of(students);
        System.out.println(stringStream.filter(s -> s.toLowerCase(Locale.ROOT).equals("антон")).count());
    }

    public static void startsWithA() {
        Stream<String> stringStream = Stream.of(students);
        stringStream.filter(s->s.toLowerCase(Locale.ROOT).startsWith("а")).forEach(System.out::println);
    }

    public static void getFirstFromSortedList() {
        Stream<String> stringStream = Stream.of(students);
        Optional<String> firstStudent = stringStream.sorted(String::compareToIgnoreCase).findFirst();
        if (firstStudent.isPresent()) {
            System.out.println(firstStudent.get());
        } else {
            System.out.println("Empty@");
        }
    }
}
