import java.util.Scanner;  // Zulfiqar Gauhar Sap id 76579

class Calculator {

    // ---------- ADD ----------
    int add(int a, int b) {
        return a + b; 
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    float add(float a, float b) {
        return a + b;
    }
    float add(float a, float b, float c) { 
        return a + b + c; 
    }
    double add(double a, double b) { 
        return a + b; 
    }
    double add(double a, double b, double c) {
        return a + b + c;
    }
    // ---------- SUB -------------
    int sub(int a, int b) { // Zulfiqar Gauhar Sap id 76579
        return a - b; 
    }
    int sub(int a, int b, int c) { 
        return a - b - c; 
    }
    float sub(float a, float b) { 
        return a - b; 
    }
    float sub(float a, float b, float c) { 
        return a - b - c; 
    }

    double sub(double a, double b) { 
        return a - b; 
    }
    double sub(double a, double b, double c) { 
        return a - b - c; 
    }
    // ---------- MUL ----------
    int mul(int a, int b) {  // Zulfiqar Gauhar Sap id 76579
        return a * b; 
    }
    int mul(int a, int b, int c) { 
        return a * b * c; 
    }
    float mul(float a, float b) { 
        return a * b; 
    }
    float mul(float a, float b, float c) { 
        return a * b * c; 
    }
    double mul(double a, double b) { 
        return a * b; 
    }
    double mul(double a, double b, double c) { 
        return a * b * c; 
    }
    // ---------- DIV ----------
    int div(int a, int b) { // Zulfiqar Gauhar Sap id 76579
        if (b == 0) { 
            System.out.println("Cannot divide by zero"); 
            return 0; 
        }
        return a / b;
    }
    int div(int a, int b, int c) {
        if (b == 0 || c == 0) { 
            System.out.println("Cannot divide by zero"); 
            return 0; 
        }
        return a / b / c;
    }

    float div(float a, float b) { // Zulfiqar Gauhar Sap id 76579
        if (b == 0) { 
            System.out.println("Cannot divide by zero"); 
            return 0; 
        }
        return a / b;
    }
    float div(float a, float b, float c) {
        if (b == 0 || c == 0) { 
            System.out.println("Cannot divide by zero");
            return 0; 
        }
        return a / b / c;
    }

    double div(double a, double b) { // Zulfiqar Gauhar Sap id 76579
        if (b == 0) { 
            System.out.println("Cannot divide by zero"); 
            return 0; 
        }
        return a / b;
    }
    double div(double a, double b, double c) { // Zulfiqar Gauhar Sap id 76579
        if (b == 0 || c == 0) { 
            System.out.println("Cannot divide by zero"); 
            return 0; 
        }
        return a / b / c;
    }
}
public class LabTAsk10 { // Zulfiqar Gauhar Sap id 76579
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        // Zulfiqar Gauhar Sap id 76579
        System.out.println("Enter 3 integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("INT ADD (2): " + calc.add(a, b));
        System.out.println("INT ADD (3): " + calc.add(a, b, c));
        System.out.println("INT SUB (2): " + calc.sub(a, b));
        System.out.println("INT SUB (3): " + calc.sub(a, b, c));
        System.out.println("INT MUL (2): " + calc.mul(a, b));
        System.out.println("INT MUL (3): " + calc.mul(a, b, c));
        System.out.println("INT DIV (2): " + calc.div(a, b));
        System.out.println("INT DIV (3): " + calc.div(a, b, c));

        // Zulfiqar Gauhar Sap id 76579
        System.out.println("\nEnter 3 float numbers:");
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        float f3 = sc.nextFloat();

        System.out.println("FLOAT ADD (2): " + calc.add(f1, f2));
        System.out.println("FLOAT ADD (3): " + calc.add(f1, f2, f3));
        System.out.println("FLOAT SUB (2): " + calc.sub(f1, f2));
        System.out.println("FLOAT SUB (3): " + calc.sub(f1, f2,f3));
        System.out.println("FLOAT MUL (2): " + calc.mul(f1, f2));
        System.out.println("FLOAT MUL (3): " + calc.mul(f1, f2,f3));
        System.out.println("FLOAT DIV (2): " + calc.div(f1, f2));
        System.out.println("FLOAT DIV (3): " + calc.div(f1, f2,f3));

        // Zulfiqar Gauhar Sap id 76579
        System.out.println("\nEnter 3 double numbers:");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();

        System.out.println("DOUBLE ADD (2): " + calc.add(d1, d2));
        System.out.println("DOUBLE ADD (3): " + calc.add(d1, d2, d3));
        System.out.println("DOUBLE SUB (2): " + calc.sub(d1, d2));
        System.out.println("DOUBLE SUB (3): " + calc.sub(d1, d2, d3));
        System.out.println("DOUBLE MUL (2): " + calc.mul(d1, d2));
        System.out.println("DOUBLE MUL (3): " + calc.mul(d1, d2, d3));
        System.out.println("DOUBLE DIV (2): " + calc.div(d1, d2));
        System.out.println("DOUBLE DIV (3): " + calc.div(d1, d2, d3));

    }
}