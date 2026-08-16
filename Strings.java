import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name:");

        // String name = sc.nextLine();
        // System.out.println("Your name is: " + name.toUpperCase());
        // System.out.println("Your name is: " + name.toLowerCase());
        // sc.close();

        String txt1 = "please locate the whhere 'locate' occurs!";
        System.out.println(txt1.indexOf("locate"));

        String txt2 = "please locate the whhere 'locate' occurs!";
        System.out.println(txt2.charAt(7));
        System.out.println(txt2.charAt(8));

        sc.close();

    }
}