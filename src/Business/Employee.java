package Business;

public class Employee {
    String emp_name;
    long phone_number;
    int dept_no;
    private String emp_id;

    public Employee(String emp_name, long phone_number, int dept_no){
        this.emp_name = emp_name;
        this.phone_number = phone_number;
        this.dept_no = dept_no;

        emp_id = Generate_empId();
    }

    public String Generate_empId() {
        long temp = phone_number;
        StringBuilder emp_id = new StringBuilder();
        long val = (phone_number % 10);

        if(emp_name.length() >= 4){
        for (int i = 1; i <= 4; i++) {
            emp_id.append(Character.toUpperCase(emp_name.charAt(emp_name.length() - i)));
            }
        }
        for (int i = 0; i < 4; i++) {
            emp_id.append(val);
            phone_number = phone_number / 10;
            val = (phone_number % 10);
        }
        phone_number = temp;
        return emp_id.toString();
    }

    public String getEmp_name() {
        return emp_name;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public int getDept_no() {
        return dept_no;
    }

    public String getEmp_id() {
        return emp_id;
    }


    public String display() {
        return "RandomStuff.Employee{" +
                "emp_name='" + emp_name + '\'' +
                ", phone_number=" + phone_number +
                ", dept_no=" + dept_no +
                ", emp_id='" + emp_id + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("David", 345678901, 1000);
        System.out.println(e1.getEmp_id());
        System.out.println(e1.display());
    }
}
