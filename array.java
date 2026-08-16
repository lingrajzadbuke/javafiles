
import java.util.*;

public class array {

    public static void main(String args[]) {
        int citizenage[] = new int[5];
        System.out.println("Enter ages of citizens:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < citizenage.length; i++) {
            citizenage[i] = sc.nextInt();
        }
        for (int age : citizenage) { // this is the for in loop where we don't have to initilize the counter and
                                     // increment the colunter

            System.out.println("The age of citizen is:" + age);

        }

        sc.close();

    }
}
