package myapp.java8;

import java.util.Arrays;
import java.util.Comparator;

public class StreamAPIInteger {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,1,2,11,121,12,46,22,4};


//        double avrgValue = (double) Arrays.stream(intArray).sum() / intArray.length;
//        System.out.println("avrg value: "+ avrgValue);

//====================== Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
//        int evenNumberSum = Arrays.stream(numbers)
//                .filter(num -> num%2==0)
//                .sum();
//        System.out.println(evenNumberSum);
//
//        int oddNumberSum = Arrays.stream(numbers)
//                .filter(num -> num%2!=0)
////                .peek(System.out::println)
//                .sum();
//        System.out.println(oddNumberSum);

//       ============== first approch ==========================
//        int[] sum = {0 , 0};
//        Arrays.stream(numbers).forEach(num->{
//                    if(num%2 ==0){
//                        sum[0]= sum[0] + num;
//                    }else{
//                        sum[1] += num; //
//                }  });
//        System.out.println(sum[0]+ " odd "+sum[1]);

//      ============== second approch ==========================
//        Map<Boolean, Integer> sumByParity =  Arrays
//                .stream(numbers)
//                .boxed()
//                .collect(Collectors.partitioningBy(
//                        num -> num%2 == 0 ,
//                        Collectors.summingInt(Integer::intValue)
//                ));
//
//        System.out.println("Sum of even numbers: " + sumByParity.get(true));
//        System.out.println("Sum of odd numbers: " + sumByParity.get(false));


//      7. Write a Java program to find the maximum and minimum values in a list of integers using streams.
        Integer maxvalue = Arrays.stream(numbers)
                .boxed()
                .max(Integer :: compare)
                .orElse(null);

        Integer minvalue = Arrays.stream(numbers)
                .boxed()
                .min(Integer :: compare)
                .orElse(null);

//      8. Write a Java program to find the second smallest and largest elements in a list of integers using streams.

        Integer secondMaxvalue = Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findAny().orElse(null);

        System.out.println("secondMaxvalue: "+ secondMaxvalue);
    }
}
