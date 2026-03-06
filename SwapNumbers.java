public class SwapNumbers { //ZULFIQAR GAUHAR SAP ID: 76579
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int temp;
        System.out.println("Before swap (3 vars) a = " + a + " b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap (3 vars) a = " + a + " b = " + b);
        System.out.println("---");

        int x = 15; // ZULFIQAR GAUHAR SAP ID: 76579
        int y = 20;

        System.out.println("Before swap (2 vars) x = " + x + " y = " + y);
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swap (2 vars) x = " + x + " y = " + y);
    }
}