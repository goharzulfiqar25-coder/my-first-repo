class Student {  //Zulfiqar Gauhar sap Id 76579
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    void showInfo() {  //Zulfiqar Gauhar sap Id 76579
        System.out.println("Name: " + name);
        System.out.println("RollNo: " + rollNo);
    }
}
class Result extends Student {
    int m1, m2, m3, m4, m5;

    Result(String name, int rollNo, int m1, int m2, int m3, int m4, int m5) {
        super(name, rollNo);

        this.m1 = m1;  //Zulfiqar Gauhar sap Id 76579
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;

    }
    void showResult() {  //Zulfiqar Gauhar sap Id 76579
        int total = m1 + m2 + m3 + m4 + m5;
        double percent = total/5.0;

        showInfo();
            System.out.println("Total Marks: " + total);
            System.out.println("Percentage: " + percent);
    }
}
public class LabTask8 {  //Zulfiqar Gauhar sap Id 76579
    public static void main(String[] args) {
        Result r = new Result("Zulfiqar Gauhar", 76579, 89, 79, 99, 87, 78);
        r.showResult();
    }
}
