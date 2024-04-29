import java.util.*;
class overloading {
    void add(int a, int b){
        System.out.println("result is "+(a+b));
    }
    void add(int a, int b, int c){
        System.out.println("result is "+(a+b+c));

    }
    void add(int a , int b, int c, int d){
        System.out.println("result is "+(a+b+c+d));
    }

};
class Test{
    public static void main(String[] args) {
        overloading obj = new overloading();
        obj. add(2, 3);
        obj.add(4, 5, 7);
        obj.add(1, 2, 3, 4);
    }
}
