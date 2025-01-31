package myapp.java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Test11 {

    public static void main(String[] args) {

        int[] num = {1,2,3,6,-2,10,34,12};

        Integer lowestNum = Arrays.stream(num)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findAny()
                .orElse(null);

//        System.out.println(lowestNum);

        int tesult = getNum(num);
    }

    public static int getNum(int nums[]) {


        for(int i=0 ; i<nums.length-1 ; i++  ){
            for( int j = 0 ; j<nums.length-1-i ; j++ ){

                if(nums[j] > nums[j+1]){
                   int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }

            }
        }
//        System.out.println(nums);
        Arrays.stream(nums).forEach(System.out::println);
        return 0;

    }
}
