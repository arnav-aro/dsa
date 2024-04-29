class ex3 {
    public static void main(String[] args) {
        System.out.println("divide by zero");
        try {
            System.out.println(10/0);
        } catch (ArithmeticException ae) {
            System.out.println(10/2);
            System.out.println(ae);
        }
        System.out.println("rest of ur application");
    }
}
