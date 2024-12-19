package myapp.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIString {

    public static void main(String[] args) {

        String biodata = "Harry potter study in hogwarts!";
        String[] colors = {"Red", "Green", "Blue", "Pink", "Brown" ,"Black", "blur"};


//  ================== Write a Java program to convert a list of strings to uppercase or lowercase using streams.
//      String[] updatedStr = biodata.split(" ");
//      String updatedNewStr = Arrays
//              .stream(updatedStr)
//              .map(str -> Character.toUpperCase(str.charAt(0)) + str.substring(1))
//              .collect(Collectors.joining(" "));
//      System.out.println(updatedNewStr);
//      updatedNewStr.forEach(System.out::println);

//  ==================== Write a Java program to count the number of strings in a list that start with a specific letter using streams.
//        List <String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown" ,"Black", "blur");
//        char startingLetter = 'B';
//
//        long count = colors.stream()
//                .map(String :: toUpperCase)
//                .filter(clr -> clr.startsWith(String.valueOf(startingLetter)) )
//                .count();
//
//        System.out.println(count);

//  =========== Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
        List<String> ascStr = Arrays.stream(colors)
                .sorted().toList();
        List<String> descStr = Arrays.stream(colors)
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("asc: "+ ascStr);
        System.out.println("Desc: "+ descStr);

    }
}
