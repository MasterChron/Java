package Business;

import Shop.Employees;

public class Payroll extends Employee {

    double basic_pay;

    public Payroll(String emp_name, long phone_number, int dept_no, double basic_pay) {
        super(emp_name, phone_number, dept_no);
        this.basic_pay = basic_pay;
    }


    public double CalculateDA(){
        return basic_pay * (1.0/5.0);
    }

    public double CalculatePF(){
        return basic_pay * (1.0/10.0);
    }
    public double CalculateNetPay(){
        return basic_pay + CalculateDA() - CalculatePF();
    }

    @Override
    public String display(){
        return "RandomStuff.Employee{" +
                "emp_name='" + super.emp_name + '\'' +
                ", phone_number=" + super.phone_number +
                ", dept_no=" + super.dept_no +
                ", emp_id='" + super.getEmp_id() + '\'' +
                ", basic_pay='" + CalculateNetPay() +
                '}';
    }

    public static void main(String[] args) {
        Payroll payroll = new Payroll("David", 24529343, 1900,10506.50);
        System.out.println(payroll.display());
    }
}
