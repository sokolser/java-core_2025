package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input second name: ");
        String sname = in.nextLine();

        System.out.println("Input last name: ");
        String lname = in.nextLine();


        System.out.println("Hello," +" "+ sname +" "+ name + " " + lname);
        in.close();

    }
}
