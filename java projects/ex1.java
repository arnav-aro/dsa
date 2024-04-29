class Ex1 {
    public static void main(String[] args) {
        try {
            System.out.println("i am in try");
        } catch (ArithmeticException ae) {
            System.out.println("i am in catch");
        }
        finally{
            System.out.println("i am in finally");
        }
        System.out.println("after try/catch/finally");
    }
}
