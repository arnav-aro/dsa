class A {
    public void showA(){
        System.out.println("i am in class A");
    }
}
class B extends A{
    public void showB(){
        System.out.println("i am in class B");
    }
}
class inheritance{
    public static void main(String[] args) {
        B obj  = new B();
        obj.showA();
        obj.showB();
    }
}
