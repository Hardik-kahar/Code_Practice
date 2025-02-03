package myapp.code;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringBasicPrgms {

    public static void main(String[] args) {
        String str = "Hello My Dear Developer";
        String bigString = "geeksofGeeks";
        String smallStr = "abcd";
        String palindromeStr = "madam";
        String s1 = "hello";
        String s2 = "world";

//          1.) Java program to reverse a string
//        System.out.println(toReverseString(str));

//        2. Java program to reverse each word of a given string
//        System.out.println(reverseEachWord(str));

//        3. Java program to find duplicate characters in a string
//        findDuplicateCharOfString(bigString);

//   IMP  4. Java program to count the number of words in a string
//        System.out.println(countWordOfString(str));

//   IMP  5. Java program to find all permutations of a given string
//        permutationOfString(smallStr);

//        6. Java program to find if a string is Palindrome
//        System.out.println(Palindrome(palindromeStr));

//        7. determine if Two Strings are "Anagrams"
//        System.out.println(anagrams("listen", "silent"));

//        8. Java program to print even indexed characters
//            printEvenIndexedCharacters(bigString);

//        9. Java program to remove space from a given string
//        System.out.println(removeSpace(str));

//        Java program to print each letter twice from a given string
//        System.out.println(doubleCharacters(bigString));

//        Java program to swap two string without using 3rd variable
//        swapString(s1, s2);

//        Java program to gives Output: a2b2c3d2 for the Input String Str = “aabbcccdd”
//        getCharacterCount("aabbcccdd");

//        separateCharacters("Subbu123raj");


//         Java program to find the longest without repeating characters


    }

    public static void lengthOfLongestSubString(String str){
        int count = 1;
        StringBuffer subString = new StringBuffer();

        char[] charStr = str.toCharArray();

        for(int i = 0 ; i< str.length() ; i++){

            if(i < charStr.length-1 && charStr[i] != charStr[i+1]  ){
                count++;
                subString.append(charStr[i]);
            }

        }


    }

    public static void separateCharacters(String str){
        char[] charStr = str.toCharArray();
        StringBuffer alphaPart = new StringBuffer();
        StringBuffer numericPart = new StringBuffer();

        for(Character c : charStr){

            if(Character.isLetter(c)){
                alphaPart.append(c);
            }else if(Character.isDigit(c)){
                numericPart.append(c);
            }
        }
        System.out.println("alphaPart: "+ alphaPart);
        System.out.println("numericPart: "+ numericPart);

    }

    public static void getCharacterCount(String str){
        StringBuffer newStr = new StringBuffer();
        int count = 1;
        char[] charString = str.toCharArray();

        for(int i= 0 ; i < str.length() ;i++){
            if(i + 1 < str.length() && charString[i] == charString[i+1] ){
                count++;
            }else {
                newStr.append(charString[i]).append(count);
                count=1;
            }
        }
        System.out.println(newStr);
    }

    public static void swapString(String s1, String s2){

        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());

        System.out.println("s1: "+ s1);
        System.out.println("s2: "+ s2);

    }

    public static String  doubleCharacters(String str){
        char[] charString = str.toCharArray();
        String newString = "";

        for(int i = 0 ; i < charString.length ; i++){
            newString = newString + charString[i] + charString[i];
        }
        return newString;
    }

    //        9. Java program to remove space from a given string
    public static String removeSpace(String str) {
        str = str.replaceAll("\\s", "");
        return str;
    }

    //        8. Java program to print even indexed characters
    public static void printEvenIndexedCharacters(String str) {
        char[] charString = str.toCharArray();

        for (int i = 0; i < charString.length; i++) {
            if (i % 2 == 0) {
                System.out.print(charString[i] + " ");
            }
        }
    }

    //        7. determine if Two Strings are "Anagrams"
    public static boolean anagrams(String str1, String str2) {

        char[] strchar1 = str1.toCharArray();
        char[] strchar2 = str1.toCharArray();

        Arrays.sort(strchar1);
        Arrays.sort(strchar2);

        return Arrays.toString(strchar1).equals(Arrays.toString(strchar2));


//        TreeMap<Character, Integer> mapStr1 = new TreeMap<>();
//        TreeMap<Character, Integer> mapStr2 = new TreeMap<>();
//
//        char[] charArray1 = str1.toCharArray();
//        char[] charArray2 = str2.toCharArray();
//
//        for(Character c: charArray1){
//            mapStr1.put(c, mapStr1.getOrDefault(c, 0)+1);
//        }
//
//        for(Character c: charArray2){
//            mapStr2.put(c, mapStr2.getOrDefault(c, 0)+1);
//        }
//
//        return mapStr1.equals(mapStr2);
    }


    //    6. Java program to find if a string is Palindrome
    public static boolean Palindrome(String str) {

        char[] charArray = str.toCharArray();
        int s = 0, l = charArray.length - 1;

        while (s < l) {

            if (str.charAt(s) != str.charAt(l)) {
                return false;
            }
            s++;
            l--;
        }
        return true;
    }


    //   =====IMP================   5. Java program to find all permutations of a given string =====================
    public static void permutationOfString(String str) {

        permute(str, "");
//        HashSet<String> set = new HashSet<>();
//        Queue<String> queue = new LinkedList<>();
//
//        queue.add(str);
//        while(!queue.isEmpty()){
//
//            String curr = queue.poll();
//            set.add(curr);
//
//            char[] charArray = curr.toCharArray();
//            for(int i=0; i< str.length()-1 ; i++){
//
//                swap(i, i+1, charArray);
//                String newStr = new String(charArray);
//                if(!set.contains(newStr)){
//                    queue.add(newStr);
//                }
//                swap(i, i+1, charArray);
//            }
//        }
//
//        for(String s : set){
//            System.out.println(s);
//        }

    }

    public static void swap(int s, int l, char[] str) {
        char temp = str[s];
        str[s] = str[l];
        str[l] = temp;
    }

    public static void permute(String str, String prefix) {
        if (str.isEmpty()) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permute(rem, prefix + str.charAt(i));
            }
        }

    }

    //      4. Java program to count the number of words in a string
    public static int countWordOfString(String str) {
        String[] subStr = str.split(" ");
        return subStr.length;
    }

    //    3. Java program to find duplicate characters in a string
    public static void findDuplicateCharOfString(String inputString) {

//        Map<Character, Integer> charCount = inputString.chars()
//                .mapToObj(c -> (char) c) // Convert int to Character
//                .collect(Collectors.groupingBy(c -> c, Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
//
//        System.out.println(charCount);

        Map<Character, Integer> charCount1 = new HashMap<>();
        char[] ch = inputString.toCharArray();

        for (Character c : ch) {
            charCount1.put(c, charCount1.getOrDefault(c, 0) + 1);
        }

        charCount1.forEach((key, value) -> {

        });
        System.out.println(charCount1);

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