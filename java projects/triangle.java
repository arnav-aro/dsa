class Triangle {
    double x,y,z;
    public Triangle(){
        x=4;
        y=5;
        z=6;
    }
    public void area(){
        System.out.println("the area of the triangle is :"+Math.pow((7.5*(7.5-4)*(7.5-5)*(7.5-6)), (0.5)));
    }

    public void perimeter(){
        System.out.println("the perimeter of the traingle is: "+(x+y+z));
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.area();
        t.perimeter();
    }
}
