class Rectangle {
    int x,y;
    public Rectangle(int s1,int s2){
        x=s1;
        y=s2;
    }
    public void area(){
        System.out.println("area of rectangle is: "+(x*y));
    }

    public static void main(String[] args) {

        Rectangle r = new Rectangle(4, 5);
        r.area();
        Rectangle r1 =new Rectangle(5, 8);
        r1.area();
    }
}
