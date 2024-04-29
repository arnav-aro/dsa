class st3 {
    public void show(){
        System.out.println("non satic show");
    }
    static public void show1(){
        System.out.println("static show1");
    }
    {
        show();
    }
    static{
        show1();
    }
    public static void main(String[] args) {
        st3 s = new st3();
        System.out.println("i am in main");
    }
}
