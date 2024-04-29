public class st2 {
    {
        System.out.println("i am in non static block");
    }
    static{
        System.out.println("i am in static block");

    }
    public static void main(String[] args) {
        st2 s =new st2();
        System.out.println("main mein hoon");
    }
}