class Number { //Zulfiqar Gauhar Sap id 76579 
    int a = 55;
    int b = 35;
}
class Addition extends Number {
    void sum() {
        System.out.println("Sum = " + (a + b));
    }
}
class Subtraction extends Number {  //Zulfiqar Gauhar Sap id 76579 
    void difference() {
        System.out.println("Difference = " + (a - b));
    }
}
class Multiplication extends Number {
    void product() {  //Zulfiqar Gauhar Sap id 76579 
        System.out.println("Product = " + (a * b));
    }
}
class Maximum extends Number {
    void show() {
        if(a > b) {
            System.out.println("Max = " + a);
        } else {   //Zulfiqar Gauhar Sap id 76579 
            System.out.println("Max = " + b);
        }
    }
}
public class Inheritance {   //Zulfiqar Gauhar Sap id 76579 
    public static void main(String[] args) {
        Addition a = new Addition();
        a.sum();

        Subtraction s = new Subtraction();
        s.difference();  //Zulfiqar Gauhar Sap id 76579 

        Multiplication m = new Multiplication();
        m.product();

        Maximum dMaximum = new Maximum();
        dMaximum.show();  //Zulfiqar Gauhar Sap id 76579 

    }
}
