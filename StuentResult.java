class Student {  //Zulfiqar Gauhar 76579

    // Method Overloading
    void result(int marks1, int marks2) {
        System.out.println("Total Marks: " + (marks1 + marks2));
    }

    void result(int marks1, int marks2, int marks3) {
        System.out.println("Total Marks: " + (marks1 + marks2 + marks3));
    }
}

class Topper extends Student {  //Zulfiqar Gauhar 76579

    // Method Overriding
    void result(int marks1, int marks2) {
        System.out.println("Topper Marks: " + (marks1 + marks2 + 10));
    }
}

public class StudentResult {  //Zulfiqar Gauhar 76579
    public static void main(String[] args) {

        Topper obj = new Topper();

        obj.result(80, 90);

        obj.result(80, 90, 95);
    }
}