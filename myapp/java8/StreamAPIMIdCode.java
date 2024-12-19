package myapp.java8;

import java.util.Arrays;
import java.util.OptionalDouble;

public class StreamAPIMIdCode {

    public static void main(String[] args) {

        int[] intArray = {1,2,3,4,5,6,1,2,1,1,12,333,22,4};

        String biodata = "Harry potter study in hogwarts!";

        double avrgValue = (double) Arrays.stream(intArray).sum() / intArray.length;
        System.out.println("avrg value: "+ avrgValue);

//        String updatedStr = biodata.

    }
}
