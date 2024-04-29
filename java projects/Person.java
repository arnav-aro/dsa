class Person{
    Person(){
        System.out.println("THis is person class constructor");
    }
}
class Student extends Person{
    Student(){
        super();
        System.out.println("this is student class constructor");
    }
}
class Test{
    public static void main(String[] args) {
        Student s = new Student();
    }
}