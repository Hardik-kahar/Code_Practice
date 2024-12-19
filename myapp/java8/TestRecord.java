package myapp.java8;

import java.util.List;

public class TestRecord {

    private int id;

    private List<StreamAPI.Product> list;

    public static  void recordMethod(){
        StreamAPI.Product product = new StreamAPI.Product("hardik", "electronics", 100);

        String name = product.name();
        String category = product.category();


        System.out.println("category: "+ category);
    }

    public static void main(String[] args) {
        recordMethod();
    }
}



