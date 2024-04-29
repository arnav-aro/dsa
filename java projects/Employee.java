class Employee {
    int salary = 30000;
    public void work(){
        System.out.println("the employee is working on chatbot");
    }
    public void getSalary(int salary) {
        this.salary =+ salary;
    }
    public void printSalary(){
        System.out.println("the updated salary is: "+salary);
    }

       
}
class HRManager extends Employee{
    int eno,ename,emob;
    HRManager(){
        super.getSalary(40000);
    }
    public void work(){
        
    }
}