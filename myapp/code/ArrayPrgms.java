package myapp.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPrgms {

    public static void main(String[] args) {

        int[] intArr = {1, 2, 3, 4, 5, 16, 14, 10, 2, 1, 23, 24};

        int[] missingNum = {1, 2, 3, 4, 5, 7, 8, 9, 10};

        char[] array = {'5', '2', '#', '3'};


//        sort the array
//        sort(intArr);
//        Arrays.stream(intArr).forEach(e -> System.out.print(e+" "));

//        System.out.println(Arrays.toString(removeDuplicateValue(intArr)));

//        System.out.println(findMissingValue(missingNum));

        System.out.println(sumIntegers(array));
    }

    public static int sumIntegers(char[] array) {
        int sum = 0;
        for (char element : array) {

            int num = element;
            sum += num;
        }
        return sum;
    }


    public static int[] removeDuplicateValue(int[] intArr) {
        ArrayList<Integer> list = new ArrayList<>(); // Using ArrayList

        for (int num : intArr) {
            if (!list.contains(num)) { // O(n) operation for each element
                list.add(num); // Add only if it's not already present
            }
        }

        int[] uniqueValue = new int[list.size()];

        int index = 0;
        for (Integer i : list) {
            uniqueValue[index] = i;
            index++;
        }
//        list.forEach(e -> System.out.print(e + " "));
        return uniqueValue;
    }


    public static int findMissingValue(int[] array) {

        int n = array[array.length - 1];
        int totalCount = (n * (n + 1)) / 2;

        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return totalCount - sum;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


}
