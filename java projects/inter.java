interface I1{
    public void show();
}
class Parent implements I1{
    public void showParent(){
        System.out.println("showParent");
    }
    public void show(){
        System.out.println("overriden show");
    }
}
class inter{
    public static void main(String[] args) {
        Parent p = new Parent();
        p.showParent();
        p.show();
    }
}