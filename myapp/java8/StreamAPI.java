package myapp.java8;

import org.w3c.dom.ls.LSOutput;

import java.awt.image.ImageProducer;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

    record Product(String name, String category, int price) {
    }

    public static void main(String[] args) {

//        int[] numArray = {1, 2, 3, 4, 5, 6, 7, 4, 5};
//
//        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 1, 2, 4, 5, 6);
//
//        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
//        Map<String, Integer> wordStats = new HashMap<>();


//        names.forEach(name -> {
//            wordStats.put("count" ,wordStats.getOrDefault("count",0)+1 );
//            wordStats.put("totalLength" ,wordStats.getOrDefault("totalLength",0)+ name.length() );
//
//        });

//        names.forEach(name -> System.out.println("Word: " + name + ", Length: " + name.length()));

//                .reduce(0, Integer::sum);
//        System.out.println("nameString: "+ nameString);


//        List<Integer> filterNumber = list.stream().filter(num -> num>4).toList();
//        filterNumber.forEach(System.out :: print );

        List<Product> products = List.of(
                new Product("Laptop", "Electronics", 1000),
                new Product("TV", "Electronics", 1500),
                new Product("Sofa", "Furniture", 700),
                new Product("Table", "Furniture", 300),
                new Product("Lamp", "Home Decor", 50)
        );

        // list of products
//        List<String> productNames = products.stream().map( Product::name).toList();
//        System.out.println(productNames);

        // list of
//        int totalAmount = products.stream().mapToInt(Product::price).sum();
//        System.out.println(totalAmount);

        // list of totalAmount category wise
//        Map<String, Integer> totalAmount = products.stream()
//                .collect(Collectors.groupingBy(
//                        Product::category, Collectors.summingInt(Product::price)
//                ));
//
//        totalAmount.forEach((category, sum)-> System.out.println("Category:  "+ category+ ", sum: "+ sum ));

        // count the product category wise
//        Map<String, Long> countporductByCategory = products.stream()
//                .collect(Collectors.groupingBy(Product::category, Collectors.counting()));
//
//        countporductByCategory.forEach((num, count) -> System.out.println(num+ ", "+ count ));

        // ======================= find first highest price each category =======================
//        Map<String, Integer> topProductByCategory = products.stream().collect(
//                Collectors.groupingBy(Product::category,
//                        Collectors.collectingAndThen(
//                            Collectors.maxBy(Comparator.comparing(Product::price)),
//                            optionalProduct -> optionalProduct.map(Product::price).orElse(0)
//                ))
//        );
//        topProductByCategory.forEach((num, count) -> System.out.println(num + ", " + count));

        // ======================= find all price each category =======================
//        Map<String , List<Integer>> collectAllPriceByCategory = products.stream()
//                .collect(Collectors.groupingBy(
//                        Product::category,
//                        Collectors.mapping(Product::price, Collectors.toList())
//                ));
//        collectAllPriceByCategory.forEach((num, count) -> System.out.println(num + ", " + count));

        // ======================= find second highest each category =======================
        Map<String , Integer> secondHighestPriceByCategory = products.stream()
                        .collect(Collectors.groupingBy(
                                Product::category,
                                Collectors.collectingAndThen(
                                        Collectors.mapping(Product::price, Collectors.toList()),
                                        price -> price.
                                                stream()
                                                .sorted(Comparator.reverseOrder())
                                                .skip(1)
                                                .findFirst()
                                                .orElse(null)
                                )));
        secondHighestPriceByCategory.forEach((num, count) -> System.out.println(num + ", " + count));

        // count number occur
//        int[] numArray = {1, 2, 3, 4, 5, 6, 12, 1,2,3,4,7, 4, 5};
//        Map<Integer, Long> numberCount = Arrays.stream(numArray)
//                .boxed()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        numberCount.forEach((num, count) -> System.out.println(num+ ", "+ count ));

    }


}