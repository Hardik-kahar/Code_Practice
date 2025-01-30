package myapp.code;

import java.util.*;
import java.util.stream.Collectors;

public class basicPrgrms {

    public static void main(String[] args) {

        int number = 5;
        int bigNumber = 123345458;
        int number1 = 15;
        int number2 = 52;
        int armStrongNum = 153;
        long longNumber = 123456444465412333L;
        int palindromeNumber = 1234321;
        int[] numbers= {1, 2, 3, 4, 5};


//      1. Java program to Find Odd or Even number / And bifurcate even and odd number with stream/without stream;
//        findEvenAndOdd();

//      2. Java program to find Prime number
//        System.out.println(checkPrimeNumber(number));

//      3.  Java program to find Fibonacci series up to a given number range
//        fibonacciSeries(number);

//      4. Java program to swap two numbers without using third variable
//        swapNumber(number1, number2);


//      5. Java program to Find Factorial on given Number
//        System.out.println(findFactorialValue(number));


//      6 Java program to Reverse Number
//        reverNumber(bigNumber);

//      7. Java program to find Armstrong Number
//        System.out.println(ArmstrongNumber(armStrongNum));

//      8. Java program to find number of digits in given number
//        findCountOfNumber(longNumber);

//      9. Java program to find Palindrome number
//        System.out.println(checkPalindrome(palindromeNumber));

//      10.   Java program to calculate the sum of digits of a number
        System.out.println(sumOfNumbers(numbers));
    }

//      10.   Java program to calculate the sum of digits of a number
    public static int sumOfNumbers(int[] numbers){
        return Arrays.stream(numbers).sum();
    }

    public static boolean checkPalindrome(int number) {
//        brut force approach
//        int originalNumber = number;
//        int reversed = 0;
//
//        while (number > 0) {
//            int rem = number % 10;
//            reversed = reversed * 10 + rem;
//            number /= 10;
//        }
//
//        return originalNumber == reversed;


//        Optimize approach
        int reverseHalf = 0;
        while (number > reverseHalf) {
            int rem = number % 10;
            reverseHalf = reverseHalf * 10 + rem;
            number /= 10;
        }
        System.out.println("reverseHalf: " + reverseHalf);
        System.out.println("number: " + number);

        return reverseHalf == number || reverseHalf / 10 == number;
    }

    // 8. Java program to find number of digits in given number
    public static void findCountOfNumber(Long number) {

        // Convert long to String to extract digits
        String numberStr = number.toString();
        int[] intArray = new int[numberStr.length()];

        for (int i = 0; i < numberStr.length(); i++) {
            intArray[i] = Character.getNumericValue(numberStr.charAt(i));
        }

        Map<Integer, Long> digitCount = Arrays
                .stream(intArray)
                .boxed()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()));

        digitCount.forEach((digit, value) -> {
            System.out.println("digit: " + digit + " value: " + value);
        });

        int findCountdigit = 3;
        int count = 0;
        while (number > 0) {

            long rem = number % 10;
            if (rem == findCountdigit) {
                count++;
            }
            number /= 10;

        }
        System.out.println("count: " + count);

    }

    //      7. Java program to find Armstrong Number
    public static boolean ArmstrongNumber(int number) {
        int temp1 = number;
        int temp = 0;
        while (number > 0) {
            int rem = number % 10;
            temp = temp + (rem * rem * rem);
            number /= 10;
        }
        return temp == temp1;
    }

    // 6 Java program to Reverse Number
    public static void reverNumber(int number) {
        int temp = 0;
        while (number > 0) {
            int rem = number % 10;
            temp = temp * 10 + rem;
            number = number / 10;
        }
        System.out.println("temp: " + temp);
    }

    // 5. Java program to Find Factorial on given Number
    public static int findFactorialValue(int number) {
        int factorial = 1;
        for (int i = 1; i < number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    // 4. Java program to swap two numbers without using third variable
    public static void swapNumber(int number1, int number2) {

        number1 = number1 + number2;    // total value add in number1 15 + 52 = 67
        number2 = number1 - number2;    //  minus number2 from total get number1 value 67 - 52 = 15, 15 value set in number2
        number1 = number1 - number2;    //  minus number2 from total get number1 value 67 - 15 = 15, 52

        System.out.println("number1: " + number1 + " number2: " + number2);

    }


    // 3.  Java program to find Fibonacci series up to a given number range
    public static void fibonacciSeries(int num) {

        int first = 0, second = 1, next;
        for (int i = 0; i <= num; i++) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }
    }

    // 2.  Java program to find Prime number
    public static boolean checkPrimeNumber(int num) {

        if (num < 2) return false;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void findEvenAndOdd() {
//  =========================== bifurcate even and odd    ===========================
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 15};

//  =========================== with burt force approach  ===========================
        List<Integer> Integerlist = Arrays.stream(numbers).boxed().toList();
        Map<String, List<Integer>> listMap = new HashMap<>();

        // Initialize lists for even and odd numbers
        listMap.put("even", new ArrayList<>());
        listMap.put("odd", new ArrayList<>());

        for (Integer num : Integerlist) {
            if (num % 2 == 0) {
                listMap.get("even").add(num);  // Add to even list
            } else {
                listMap.get("odd").add(num);   // Add to odd list
            }
        }

        // Print results
        System.out.println("Even Numbers: " + listMap.get("even"));
        System.out.println("Odd Numbers: " + listMap.get("odd"));

//      =========================== With stream api ===========================
        Map<String, List<Integer>> bifurcateNumber = Arrays
                .stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(num -> num % 2 == 0 ? "Even" : "Odd"));

        List<Integer> evenNumber = bifurcateNumber.get("Even");
        List<Integer> oddNumber = bifurcateNumber.get("Odd");
        System.out.println("even number: " + evenNumber);
        System.out.println("odd number: " + oddNumber);
        int number = 12;
        if (number % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
}
