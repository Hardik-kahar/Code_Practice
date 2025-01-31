package myapp.code;

import java.util.*;
import java.util.stream.Collectors;

public class StringBasicPrgms {

    public static void main(String[] args) {
        String str = "Hello My Dear Developer";
        String bigString = "geeksofGeeks";
        String smallStr = "abcd";
        String palindromeStr= "madam";

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
        System.out.println(anagrams("listen", "silent"));



    }

    public static boolean anagrams(String str1, String str2){

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
    public static boolean Palindrome(String str){

        char[] charArray = str.toCharArray();
        int s= 0, l = charArray.length-1;

        while(s < l){

            if(str.charAt(s) != str.charAt(l)){
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

        charCount1.forEach((key, value)->  {

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