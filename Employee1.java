class Employee { //Zulfiqar Gauhar 76579 

    private String employeeName;
    private int salary;

    void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }
//Zulfiqar Gauhar 76579 
    String getEmployeeName() {
        return employeeName;
    }

    int getSalary() {
        return salary;
    }
}

public class Employee1 {  //Zulfiqar Gauhar 76579 
    public static void main(String[] args) {

        Employee e = new Employee();

        e.setEmployeeName("Ahmed");
        e.setSalary(50000);

        System.out.println("Employee Name: " + e.getEmployeeName());
        System.out.println("Salary: " + e.getSalary());
    }
}