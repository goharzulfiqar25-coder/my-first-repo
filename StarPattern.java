public class StarPattern { //ZULFIQAR GAUHAR SAP ID: 76579
    public static void main(String[] args) {
        int rows = 4;

        for(int i = rows; i >= 1; i--) {//ZULFIQAR GAUHAR SAP ID: 76579
            for (int j=1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}