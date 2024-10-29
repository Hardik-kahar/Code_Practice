package myapp.opps;

public class ConstructorsCode {

}

class A{

    int x=2;
    String str ="nitin";
    int   methoda(int x,String str) {
        System.out.println(x+str);
        return 25;
    }
    @Override
    public String 	toString() {
        return "A [x=" + x + ", str=" + str + "]";
    }

}

class B extends A{

    int y = 4;
    String s= "Hardik";
    void methodB() {
        System.out.println(y + s);
    }
}
