
import java.util.Scanner;

public class averageArray {

    public static int average(int marks[], int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of " + n + " Students");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the marks of Student " + (i + 1) + ":");
            marks[i] = sc.nextInt();
            sum += marks[i];
        }
        int avg = sum / n;
        return avg;
    }

    public static void main(String args[]) {
        int marks[] = new int[10];
        int n = marks.length;
        int res = average(marks, n);
        System.out.print("Average = " + res);

    }
}
