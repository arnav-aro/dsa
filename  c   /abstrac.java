abstract class T{
    abstract void m1();
    abstract void m2();
    abstract void m3();
    void m4(){
        System.out.println("m4 non abstact method");
    }
}
class MyJava extends T{
    void m1(){
        System.out.println("m1 abstract method");
    }
    void m2(){
        System.out.println("m2 abstract method");
    }
    void m3(){
        System.out.println("m3 abstract method");
    }
    public static void main(String[] args) {
        MyJava t =new MyJava();
        t.m1();
        t.m2();
        t.m3();
        t.m4();
        MyJava t1 =new MyJava();
        t1.m1();
        t1.m2();
        t1.m3();
        t1.m4();
    }
}
