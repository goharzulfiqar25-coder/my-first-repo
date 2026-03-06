
import java.util.Scanner;

public class Zulfiqar
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        SecondClass myJuice = new SecondClass();
        System.out.println("Juice Menu");
        System.out.println("Options: 1 for SMALL, 2 for MEDIUM, 3 for LARGE");
        System.out.print("Enter your choice: "); 
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                myJuice.size=SecondClass.FreshJuiceSizes.SMALL;
                System.out.println("Selected: SMALL"); 
                break; 
            case 2:
                myJuice.size=SecondClass.FreshJuiceSizes.MEDIUM;
                System.out.println("Selected: MEDIUM");
                break;
            case 3:
                myJuice.size=SecondClass.FreshJuiceSizes.LARGE;
                System.out.println("Selected: LARGE");
                break;
            default: 
                System.out.println("Invalid choice");
                break;
        }


        
        if (myJuice.size != null) {
            System.out.println("Your juice size is: " + myJuice.size);
        }
        
        input.close();
    }
}
class SecondClass {
    enum FreshJuiceSizes {
        SMALL, MEDIUM, LARGE;
    }
    FreshJuiceSizes size;
}