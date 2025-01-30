package myapp.code;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StringBasicPrgms {

    public static void main(String[] args) {
        String str = "Hello My Dear Developer";

//     1.) Java program to reverse a string
//        System.out.println(toReverseString(str));

//        2. Java program to reverse each word of a given string
//        System.out.println(reverseEachWord(str));
    }

    //    3. Java program to find duplicate characters in a string
    public static void findDuplicateCharOfString(String inputString) {

        Map<Character, Integer> charCount = inputString.chars()
                .mapToObj(c -> (char) c) // Convert int to Character
                .collect(Collectors.groupingBy(c -> c, Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));

        System.out.println(charCount);
    }

    //  2. Java program to reverse each word of a given string
    public static String reverseEachWord(String s) {
        String nStr = "";
        String[] strArray = s.split(" ");
        System.out.println("subStr: " + strArray[0]);
        for (int i = 0; i < strArray.length; i++) {

            System.out.println("subStr: " + strArray[i]);
            String subStr = strArray[i];
            int lg = subStr.length();
            char ch;
//            StringBuilder nrvrsStr = new StringBuilder();
            String nrvrsStr = "";
            for (int j = 0; j < lg; j++) {
                ch = subStr.charAt(j);
                nrvrsStr = ch + nrvrsStr;

            }
            System.out.println("nrvrsStr: " + nrvrsStr);
            nStr = nStr + nrvrsStr + " ";

        }

        return nStr;

    }

    //      1.) Java program to reverse a string
    public static String toReverseString(String str) {
        String nstr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        return nstr;
    }

}