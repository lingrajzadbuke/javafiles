
public class Pricecalculator {

    public static void main(String args[]) {
        // create variables of different data types
        int items = 50;
        float costperitem = 9.99f;
        float totalcost = items * costperitem;
        char currency = '$';

        // print variables
        System.out.println("Number of items = " + items);
        System.out.println("Cost per item = " + costperitem + currency);
        System.out.println("Total cost = " + totalcost + currency);

    }
}
