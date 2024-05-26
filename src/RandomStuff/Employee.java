package RandomStuff;

import java.util.Scanner;

public class Employee {
    private static Scanner scanner = new Scanner(System.in);
    private String emp_name;
    private long phone_number;
    private String dept_no;
    Employee(String emp_name, long phone_number){
        this.emp_name = emp_name;
        this.phone_number = phone_number;
        this.dept_no = generateId(emp_name, phone_number);
    }
    @Override
    public String toString() {
        return "RandomStuff.Employee{" +
                "emp_name='" + emp_name + '\'' +
                ", phone_number=" + phone_number +
                ", dept_no=" + dept_no +
                '}';
    }

    public String getEmp_name() {
        return emp_name;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public String getDept_no() {
        return dept_no;
    }

    public static String addName(){
        System.out.println("Please enter your name: ");
        return scanner.nextLine();
    }
    public static long addNumber(){
        System.out.println("Please enter your phone number: ");
        long number = 0;
        while (true){
            try {
                number = scanner.nextInt();
                break;
            }
            catch (Exception e){
                System.out.println("Please enter your number without any illegal characters.");
                scanner.next();
            }
        }
        return number;
    }
    public static String generateId(String name, long number){
        String subName = name.substring(Math.max(0, name.length() - 4));
        String subNumber = Long.toString(number).substring(0, Math.min(4, Long.toString(number).length()));
        return subName.concat(subNumber);
    }
}

class EmployeeRunner{
    public static void main(String[] args) {
        Employee employee = new Employee(Employee.addName(), Employee.addNumber());
        System.out.println(employee);

    }
}
