package Shop;

public abstract class Employees {

    private String emp_id;
    private double salary;
    private  String emp_name;

    public Employees(String emp_id, double salary, String emp_name) {
        this.emp_id = emp_id;
        this.salary = salary;
        this.emp_name = emp_name;
    }


    public String getEmp_id() {
        return emp_id;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmp_name() {
        return emp_name;
    }


    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }


    @Override
    public String toString() {
        return "Employees{" +
                "emp_id='" + emp_id + '\'' +
                ", salary=" + salary +
                ", emp_name='" + emp_name + '\'' +
                '}';
    }

    public static void main(String[] args) {
//        Employees e = new Employees("ID_2432", 10000, "Name");
//        e.setEmp_id("ID_2431");
//        e.setSalary(5000);
//        e.setEmp_name("David");
//
//        System.out.println(e.toString());
//
//        e.add(1.9,2);

    }

    public void add(int a, int b){
        System.out.println("Added final: " + (a + b));
    }

    public void add(int a, double b){
        System.out.println("Added final: " + (b + a));
    }

    public void add(double a, int b){
        System.out.println("Added final: " + (a + b));
    }
    public void add(double a, double b){
        System.out.println("Added final: " + (a + b));
    }

    public abstract String display();
}
