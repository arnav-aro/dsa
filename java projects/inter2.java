
interface I1{
    void m1();
    public interface inter2 {
        void m2();
        
    }
}

class Test implements I1{
    public void m1(){
        System.out.println("m1 method implementation");
        System.out.println(a);
    }
    public void m2(){
        System.out.println("m2 method implementation");
        System.out.println(a);
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.m1();
        t.m2();
        I1 obj = new Test();
        obj.m1();
        obj.m2();
    }
}
