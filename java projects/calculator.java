import java.util.Scanner;
class Calculator
{
    int r,l,b,h;
    final double PI=3.14;
    Scanner sc= new Scanner(System.in);
    
    public void areaOfCircle()
    {
        System.out.println("Enter radius:");
        r=sc.nextInt();
        double area = PI*r*r;
        System.out.println("Area of Circle:"+area);
    }
    
    public void circumferenceOfCircle()
    {
        System.out.println("Enter radius:");
        r=sc.nextInt();
        double circumference = 2*PI*r;
        System.out.println("Circumference of Circle:"+circumference);
    }
    
    public void areaOfRectangle()
    {
        System.out.println("Enter length:");
        l=sc.nextInt();
        System.out.println("Enter breadth:");
        b=sc.nextInt();
        double area = l*b;
        System.out.println("Area of Rectangle:"+area);
    }
    
    public void volumeOfSphere()
    {
        System.out.println("Enter radius:");
        r=sc.nextInt();
        double volume = (4*PI*r*r*r)/3;
        System.out.println("Volume of sphere:"+volume);
    }
     
    public void saOfSphere()
    {
        System.out.println("Enter radius:");
        r=sc.nextInt();
        double sa = (4*PI*r*r);
        System.out.println("SA of sphere:"+sa);
    }

    public void areaOfSquare()
    {
        System.out.println("Enter radius:");
        l=sc.nextInt();
        double area = (l*l);
        System.out.println("Area of square:"+area);
    }

    public void areaOfRtTriangle()
    {
        System.out.println("Enter base:");
        b=sc.nextInt();
        System.out.println("Enter height:");
        h=sc.nextInt();
        double area = (b*h)/2;
        System.out.println("Area of Right Angled Triangle:"+area);
    }

    public void areaOfEqTriangle()
    {
        System.out.println("Enter side:");
        l=sc.nextInt();
        double area = (1.73*l*l)/4;
        System.out.println("Area of Equilateral Triangle:"+area);
    }

    public void perimeterOfRectangle()
    {
        System.out.println("Enter length:");
        l=sc.nextInt();
        System.out.println("Enter breadth:");
        b=sc.nextInt();
        double perimeter = 2*(l+b);
        System.out.println("Perimeter of Rectangle:"+perimeter);
    }

    
    public static void main(String args[])
    {
        Calculator c=new Calculator();
        Scanner sc1 = new Scanner(System.in);
        while (true) {
        System.out.println("1. Area of Circle");
        System.out.println("2. Circumference of Circle");
        System.out.println("3. Area of Rectangle");
        System.out.println("4. Volume of Sphere");
        System.out.println("5. Surface Area of Sphere");
        System.out.println("6. Area of Square");
        System.out.println("7. Area of RT Triangle");
        System.out.println("8. Area of Eq Triangle");
        System.out.println("9. Perimeter of Rectangle");
        System.out.println("10.Exit");
        System.out.println("Select an option");
        int ch = sc1.nextInt();
            if (ch==1) {
                c.areaOfCircle();
            }
            else if (ch==2) {
                c.circumferenceOfCircle();
            }
            else if (ch==3) {
                c.areaOfRectangle();
            }
            else if (ch==4) {
                c.volumeOfSphere();
            }
            else if (ch==5) {
                c.saOfSphere();
            }
            else if (ch==6) {
                c.areaOfSquare();
            }
            else if (ch==7) {
                c.areaOfRtTriangle();
            }
            else if (ch==8) {
                c.areaOfEqTriangle();
            }
            else if (ch==9) {
                c.perimeterOfRectangle();
            }
            else if (ch==10) {
                System.exit(0);
            }
            else{
                System.out.println("Invalid Input");
            }
        }
    }
}