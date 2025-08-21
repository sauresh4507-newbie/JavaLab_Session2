import java.util.Scanner;

class employee {
    String name;
    int id;
    int salary;
    public employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the employee: ");
        String name = sc.nextLine();
        int id = Integer.parseInt(args[0]);
        System.out.println("Enter the salary of the employee: ");
        int salary = sc.nextInt();
        employee emp = new employee(name, id, salary);
        emp.display();
    }
}