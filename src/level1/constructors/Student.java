package level1.constructors;

public class Student {

    Student(int id, String name){
        rollNumber = id;
        studentName = name;
    }

    int rollNumber;
    String studentName;

    void printInformation(){
        System.out.println(rollNumber + " " + studentName);
    }
}

class StudentDriver{

    public static void main(String[] args) {

        Student student1 = new Student(1,"Prab");

        student1.printInformation();
    }
}
